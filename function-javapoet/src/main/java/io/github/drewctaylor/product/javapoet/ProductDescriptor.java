package io.github.drewctaylor.product.javapoet;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeVariableName;
import io.github.drewctaylor.effect.exception.javapoet.EffectThrowsExceptionDescriptor;
import io.github.drewctaylor.effect.javapoet.EffectDescriptor;
import io.github.drewctaylor.function.exception.javapoet.FunctionThrowsExceptionDescriptor;
import io.github.drewctaylor.function.javapoet.FunctionDescriptor;
import io.github.drewctaylor.javapoet.JavaPoetUtility;
import io.github.drewctaylor.javapoet.JavadocSpec;
import io.github.drewctaylor.require.Require;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.lang.model.element.Modifier;

import static io.github.drewctaylor.javapoet.JavaPoetUtility.methodSpecForInterface;
import static java.lang.String.format;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.of;
import static javax.lang.model.element.Modifier.FINAL;
import static javax.lang.model.element.Modifier.PRIVATE;
import static javax.lang.model.element.Modifier.PUBLIC;
import static javax.lang.model.element.Modifier.STATIC;

/**
 * A descriptor for a product.
 */
public final class ProductDescriptor
{
    private static final String PACKAGE_NAME = "io.github.drewctaylor.product";
    private static final String SIMPLE_NAME_DEFAULT = "Default";

    private final int parameterCount;
    private final String simpleName;
    private final ClassName className;
    private final List<TypeVariableName> typeVariableNameList;
    private final List<TypeVariableName> typeVariableNameListReverse;
    private final TypeVariableName[] typeVariableNameArray;
    private final TypeVariableName[] typeVariableNameArrayReverse;
    private final ParameterizedTypeName parameterizedTypeName;
    private final List<FieldSpec> fieldSpecList;

    /**
     * Construct a descriptor for a product.
     *
     * @param parameterCount the parameter count
     */
    public ProductDescriptor(
            final int parameterCount)
    {
        if (parameterCount < 2)
            throw new RuntimeException();

        this.parameterCount = parameterCount;
        this.simpleName = format("P%s", parameterCount);
        this.className = ClassName.get(PACKAGE_NAME, simpleName);
        this.typeVariableNameList = range(0, parameterCount).mapToObj(typeVariableIndex -> TypeVariableName.get(format("T%s", typeVariableIndex + 1))).collect(toList());
        this.typeVariableNameArray = typeVariableNameList.toArray(TypeVariableName[]::new);
        this.parameterizedTypeName = ParameterizedTypeName.get(className, typeVariableNameArray);
        this.fieldSpecList = range(0, parameterCount).mapToObj(fieldIndex -> FieldSpec.builder(typeVariableNameList.get(fieldIndex), format("v%s", fieldIndex + 1), PRIVATE, Modifier.FINAL).build()).collect(toList());

        this.typeVariableNameListReverse = new ArrayList<TypeVariableName>(typeVariableNameList);
        Collections.reverse(this.typeVariableNameListReverse);
        this.typeVariableNameArrayReverse = typeVariableNameListReverse.toArray(TypeVariableName[]::new);
    }

    private List<TypeVariableName> getTypeVariableNameList()
    {
        return typeVariableNameList;
    }

    private TypeVariableName[] getTypeVariableNameArray()
    {
        return typeVariableNameArray;
    }

    private ParameterizedTypeName getParameterizedTypeName()
    {
        return parameterizedTypeName;
    }

    private ParameterizedTypeName parameterizedTypeName(
            final List<TypeVariableName> typeVariableNameList)
    {
        return ParameterizedTypeName.get(className, typeVariableNameList.toArray(TypeVariableName[]::new));
    }

    private List<FieldSpec> getFieldSpecList()
    {
        return fieldSpecList;
    }

    private MethodSpec methodSpecForMatchAbstract()
    {
        return methodSpecForInterface(methodSpecForMatch());
    }

    private MethodSpec methodSpecForMatchExceptionAbstract()
    {
        return methodSpecForInterface(methodSpecForMatchException());
    }

    private MethodSpec methodSpecForMatchEffectAbstract()
    {
        return methodSpecForInterface(methodSpecForMatchEffect());
    }

    private MethodSpec methodSpecForMatchEffectExceptionAbstract()
    {
        return methodSpecForInterface(methodSpecForMatchEffectException());
    }

    private MethodSpec methodSpecForMatch()
    {
        final var typeVariableNameReturn = TypeVariableName.get("R1");
        final var parameterSpec = ParameterSpec.builder(FunctionDescriptor.parameterizedTypeName(typeVariableNameList.stream().map(typeVariableName -> (TypeName) typeVariableName).collect(toList()), typeVariableNameReturn), "f", FINAL).build();
        final var javadoc = JavadocSpec.Builder.javadocBuilder()
                .add(format("Returns %s.", "the output of the given function when given the values of this product as input"))
                .addParameter(parameterSpec, "the given function")
                .addTypeVariable(typeVariableNameReturn, "the type of the output value")
                .setReturn(format("return %s", "the output of the given function when given the values of this product as input"))
                .build()
                .toCodeBlock();

        return MethodSpec
                .methodBuilder("match")
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC)
                .addTypeVariable(typeVariableNameReturn)
                .returns(typeVariableNameReturn)
                .addParameter(parameterSpec)
                .addStatement("$T.requireNonNull($N, \"$N\")", Require.class, parameterSpec.name, parameterSpec.name)
                .addCode("\n")
                .addCode(CodeBlock.of("return $N.f($L);", parameterSpec.name, fieldSpecList.stream().map(fieldSpec -> CodeBlock.of(fieldSpec.name)).collect(CodeBlock.joining(","))))
                .build();
    }

    private MethodSpec methodSpecForMatchException()
    {
        final var typeVariableNameReturn = TypeVariableName.get("R1");
        final var typeVariableNameException = TypeVariableName.get("E", Exception.class);
        final var parameterSpec = ParameterSpec.builder(FunctionThrowsExceptionDescriptor.parameterizedTypeNameFor(typeVariableNameList.stream().map(typeVariableName -> (TypeName) typeVariableName).collect(toList()), typeVariableNameReturn, typeVariableNameException), "f", FINAL).build();
        final var javadoc = JavadocSpec.Builder.javadocBuilder()
                .add(format("Returns %s.", "the output of the given function when given the values of this product as input"))
                .addParameter(parameterSpec, "the given function")
                .addTypeVariable(typeVariableNameReturn, "the type of the output value")
                .addTypeVariable(typeVariableNameException, "the type of the exception")
                .addThrows(NullPointerException.class, "if the given function is null")
                .addThrows(typeVariableNameException, "if the given function throws an exception")
                .setReturn(format("return %s", "the output of the given function when given the values of this product as input"))
                .build()
                .toCodeBlock();

        return MethodSpec
                .methodBuilder("matchException")
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC)
                .addTypeVariable(typeVariableNameReturn)
                .addTypeVariable(typeVariableNameException)
                .returns(typeVariableNameReturn)
                .addParameter(parameterSpec)
                .addException(typeVariableNameException)
                .addStatement("$T.requireNonNull($N, \"$N\")", Require.class, parameterSpec.name, parameterSpec.name)
                .addCode("\n")
                .addCode(CodeBlock.of("return $N.f($L);", parameterSpec.name, fieldSpecList.stream().map(fieldSpec -> CodeBlock.of(fieldSpec.name)).collect(CodeBlock.joining(","))))
                .build();
    }

    private MethodSpec methodSpecForMatchEffect()
    {
        final var parameterSpec = ParameterSpec.builder(ParameterizedTypeName.get(new EffectDescriptor(parameterCount).getClassName(), typeVariableNameArray), "f", FINAL).build();
        final var javadoc = JavadocSpec.Builder.javadocBuilder()
                .add("Executes the given effect when given the values of this product as input.")
                .addParameter(parameterSpec, "the given effect")
                .build()
                .toCodeBlock();

        return MethodSpec
                .methodBuilder("matchEffect")
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC)
                .addParameter(parameterSpec)
                .addStatement("$T.requireNonNull($N, \"$N\")", Require.class, parameterSpec.name, parameterSpec.name)
                .addCode("\n")
                .addCode(CodeBlock.of("$N.f($L);", parameterSpec.name, fieldSpecList.stream().map(fieldSpec -> CodeBlock.of(fieldSpec.name)).collect(CodeBlock.joining(","))))
                .build();
    }

    private MethodSpec methodSpecForMatchEffectException()
    {
        final var typeVariableNameException = TypeVariableName.get("E", Exception.class);
        final var parameterSpec = ParameterSpec.builder(ParameterizedTypeName.get(new EffectThrowsExceptionDescriptor(parameterCount).getClassName(), concat(typeVariableNameList.stream(), of(typeVariableNameException)).toArray(TypeVariableName[]::new)), "f", FINAL).build();
        final var javadoc = JavadocSpec.Builder.javadocBuilder()
                .add("Executes the given effect when given the values of this product as input.")
                .addParameter(parameterSpec, "the given effect")
                .addTypeVariable(typeVariableNameException, "the type of the exception")
                .addThrows(NullPointerException.class, "if the given effect is null")
                .addThrows(typeVariableNameException, "if the given effect throws an exception")
                .build()
                .toCodeBlock();

        return MethodSpec
                .methodBuilder("matchEffectException")
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC)
                .addTypeVariable(typeVariableNameException)
                .addParameter(parameterSpec)
                .addException(typeVariableNameException)
                .addStatement("$T.requireNonNull($N, \"$N\")", Require.class, parameterSpec.name, parameterSpec.name)
                .addCode("\n")
                .addCode(CodeBlock.of("$N.f($L);", parameterSpec.name, fieldSpecList.stream().map(fieldSpec -> CodeBlock.of(fieldSpec.name)).collect(CodeBlock.joining(","))))
                .build();
    }

    private MethodSpec methodSpecForReverseStatic()
    {
        final var returns = new ProductDescriptor(parameterCount).parameterizedTypeName(typeVariableNameListReverse);
        final var parameterSpecP = ParameterSpec.builder(parameterizedTypeName, "p", FINAL).build();
        final var parameterSpecF = ParameterSpec.builder(FunctionDescriptor.parameterizedTypeName(typeVariableNameListReverse.stream().map(typeVariableName -> (TypeName) typeVariableName).collect(toList()), new ProductDescriptor(parameterCount).parameterizedTypeName(typeVariableNameListReverse)), "f", FINAL).build();
        final var javadoc = JavadocSpec.Builder.javadocBuilder()
                .add("Returns a form of the given product where the order of the values is reversed.")
                .addParameter(parameterSpecP, "the given product")
                .addParameter(parameterSpecF, "the given product constructor")
                .addTypeVariableWithStringDescription(typeVariableNameList, (
                        typeVariableName,
                        typeVariableNameIndex) -> format("the type of value %s", typeVariableNameIndex + 1))
                .setReturn("a form of the given product where the order of the values is reversed")
                .addThrows(NullPointerException.class, "if the given product is null")
                .addThrows(NullPointerException.class, "if the given product constructor is null")
                .build()
                .toCodeBlock();

        return MethodSpec
                .methodBuilder("reverse")
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC, STATIC)
                .addTypeVariables(typeVariableNameList)
                .returns(returns)
                .addParameter(parameterSpecP)
                .addParameter(parameterSpecF)
                .addStatement("$T.requireNonNull($N, \"$N\")", Require.class, parameterSpecP.name, parameterSpecP.name)
                .addStatement("$T.requireNonNull($N, \"$N\")", Require.class, parameterSpecF.name, parameterSpecF.name)
                .addCode("\n")
                .addCode("return p.match(f.reverse());")
                .build();
    }

    private MethodSpec methodSpecForReverse()
    {
        final var returns = new ProductDescriptor(parameterCount).parameterizedTypeName(typeVariableNameListReverse);
        final var javadoc = JavadocSpec.Builder.javadocBuilder()
                .add("Returns a form of this product where the order of values is reversed.")
                .setReturn("a form of this product where the order of values is reversed")
                .build()
                .toCodeBlock();

        return MethodSpec
                .methodBuilder("reverse")
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC)
                .returns(returns)
                .addCode("return $T.reverse(this, Default::new);", new ProductDescriptor(parameterCount).className)
                .build();
    }

    private MethodSpec methodSpecForConstructor()
    {
        return JavaPoetUtility.methodSpecForConstructor(getFieldSpecList());
    }

    private List<MethodSpec> methodSpecListForGet()
    {
        return JavaPoetUtility.methodSpecListForGet(getFieldSpecList(), (
                fieldSpec,
                fieldSpecIndex) -> format("value %s", fieldSpecIndex + 1));
    }

    private MethodSpec methodSpecForFactory()
    {
        final var javadoc = JavadocSpec.Builder.javadocBuilder()
                .add(format("Returns a %s-value product.", parameterCount))
                .addTypeVariableWithStringDescription(typeVariableNameList, (
                        typeVariableName,
                        typeVariableNameIndex) -> format("the type of value %s", typeVariableNameIndex + 1))
                .addParameterWithStringDescription(fieldSpecList.stream().map(fieldSpec -> ParameterSpec.builder(fieldSpec.type, fieldSpec.name, FINAL).build()).collect(Collectors.toList()), (
                        parameterSpec,
                        parameterSpecIndex) -> format("value %s", parameterSpecIndex + 1))
                .setReturn(format("a %s-value product", parameterCount))
                .build()
                .toCodeBlock();

        return JavaPoetUtility.methodSpecForFactory(className, getTypeVariableNameList(), Optional.of("p"), getFieldSpecList())
                .addJavadoc(javadoc)
                .build();
    }

    public JavaFile javaFile()
    {
        final var javadoc = JavadocSpec.Builder.javadocBuilder()
                .add(format("A %s-value product.", parameterCount))
                .addTypeVariableWithStringDescription(typeVariableNameList, (
                        typeVariableName,
                        typeVariableNameIndex) -> format("the type of value %s", typeVariableNameIndex + 1))
                .build()
                .toCodeBlock();

        final var javadocDefault = JavadocSpec.Builder.javadocBuilder()
                .add(format("A default %s-value product.", parameterCount))
                .addTypeVariableWithStringDescription(typeVariableNameList, (
                        typeVariableName,
                        typeVariableNameIndex) -> format("the type of value %s", typeVariableNameIndex + 1))
                .build()
                .toCodeBlock();

        return JavaFile.builder(
                PACKAGE_NAME,
                TypeSpec.interfaceBuilder(simpleName)
                        .addJavadoc(javadoc)
                        .addModifiers(PUBLIC)
                        .addTypeVariables(getTypeVariableNameList())
                        .addMethod(methodSpecForMatchAbstract())
                        .addMethod(methodSpecForMatchExceptionAbstract())
                        .addMethod(methodSpecForMatchEffectAbstract())
                        .addMethod(methodSpecForMatchEffectExceptionAbstract())
                        // .addMethod(methodSpecForReverseStatic())
                        .addType(TypeSpec.classBuilder(SIMPLE_NAME_DEFAULT)
                                .addJavadoc(javadocDefault)
                                .addSuperinterface(getParameterizedTypeName())
                                .addModifiers(PUBLIC, STATIC, FINAL)
                                .addTypeVariables(getTypeVariableNameList())
                                .addFields(getFieldSpecList())
                                .addMethod(methodSpecForConstructor())
                                .addMethods(methodSpecListForGet())
                                .addMethod(methodSpecForMatch())
                                .addMethod(methodSpecForMatchException())
                                .addMethod(methodSpecForMatchEffect())
                                .addMethod(methodSpecForMatchEffectException())
                                .addMethod(methodSpecForFactory())
                                .addMethod(methodSpecForReverse())
                                .build())
                        .build())
                .skipJavaLangImports(true)
                .addStaticImport(Require.class, "requireNonNull")
                .build();
    }
}
