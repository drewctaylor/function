package io.github.drewctaylor.sum.javapoet;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeVariableName;
import io.github.drewctaylor.javapoet.JavadocSpec;
import io.github.drewctaylor.require.Require;

import java.util.List;
import java.util.stream.IntStream;

import javax.lang.model.element.Modifier;

import static io.github.drewctaylor.require.RequireNumberInteger.requireZeroOrPositive;
import static io.github.drewctaylor.require.RequireString.requireLengthGreaterThan;
import static java.lang.String.format;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;
import static javax.lang.model.element.Modifier.ABSTRACT;
import static javax.lang.model.element.Modifier.FINAL;
import static javax.lang.model.element.Modifier.PRIVATE;
import static javax.lang.model.element.Modifier.PUBLIC;
import static javax.lang.model.element.Modifier.STATIC;

/**
 * A descriptor for a sum.
 */
public final class SumDescriptor
{
    private static final String PACKAGE_NAME = "io.github.drewctaylor.sum";
    private static final String SIMPLE_NAME_DEFAULT = "Default";

    private final int parameterCount;
    private final ClassName className;
    private final List<TypeVariableName> typeVariableNameList;
    private final ParameterizedTypeName parameterizedTypeName;

    /**
     * Construct a descriptor for a sum.
     *
     * @param parameterCount the parameter count
     */
    public SumDescriptor(
            final int parameterCount)
    {
        if (parameterCount < 2)
            throw new RuntimeException();

        this.parameterCount = parameterCount;
        this.className = ClassName.get(PACKAGE_NAME, format("S%s", parameterCount));
        this.typeVariableNameList = range(0, parameterCount).mapToObj(typeVariableIndex -> TypeVariableName.get(format("T%s", typeVariableIndex + 1))).collect(toList());
        this.parameterizedTypeName = ParameterizedTypeName.get(className, typeVariableNameList.toArray(TypeVariableName[]::new));
    }

    private static TypeVariableName typeVariableName(
            final String typeVariablePrefix,
            final int typeVariableIndex)
    {
        requireLengthGreaterThan(typeVariablePrefix, 0, "typeVariablePrefix");
        requireZeroOrPositive(typeVariableIndex, "typeVariableIndex");

        return TypeVariableName.get(format("%s%s", typeVariablePrefix, typeVariableIndex));
    }

    private MethodSpec methodSpecForMatch(
            final int parameterIndex,
            final List<TypeVariableName> typeVariableNameList)
    {
        return methodSpecForMatchHelper(typeVariableNameList)
                .addModifiers(PUBLIC)
                .addCode(CodeBlock.of("return f$L.f($N);", typeVariableNameList.get(parameterIndex - 1), typeVariableName("T", parameterIndex).toString().toLowerCase()))
                .build();
    }

    private MethodSpec methodSpecForMatchAbstract(
            final List<TypeVariableName> typeVariableNameList)
    {
        return methodSpecForMatchHelper(typeVariableNameList)
                .addModifiers(PUBLIC, ABSTRACT)
                .build();
    }

    private MethodSpec.Builder methodSpecForMatchHelper(
            final List<TypeVariableName> typeVariableNameList)
    {
        final var typeVariableNameReturn = TypeVariableName.get("R1");
        final var parameterSpecList = typeVariableNameList.stream().map(typeVariableNameInner -> ParameterSpec.builder(ParameterizedTypeName.get(ClassName.get("io.github.drewctaylor.function", "F1"), List.of(typeVariableNameInner, typeVariableNameReturn).toArray(TypeVariableName[]::new)), format("f%s", typeVariableNameInner), Modifier.FINAL).build()).collect(toList());

        final var javadoc = JavadocSpec.Builder.javadocBuilder()
                .add("Return the output of the given function when given the value of this sum as input.")
                .addTypeVariable(typeVariableNameReturn, "the type of the output value")
                .addParameterWithStringDescription(parameterSpecList, (
                        parameterSpec,
                        parameterSpecIndex) -> format("the function to apply to value %s", parameterSpecIndex + 1))
                .setReturn("the output of the given function when given the value of this sum as input")
                .build()
                .toCodeBlock();

        return MethodSpec
                .methodBuilder("match")
                .addJavadoc(javadoc)
                .addTypeVariable(typeVariableNameReturn)
                .returns(typeVariableNameReturn)
                .addParameters(parameterSpecList);
    }

    private MethodSpec methodSpecForMatchException(
            final int parameterIndex,
            final List<TypeVariableName> typeVariableNameList)
    {
        return methodSpecForMatchExceptionHelper(typeVariableNameList)
                .addModifiers(PUBLIC)
                .addCode(CodeBlock.of("return f$L.f($N);", typeVariableNameList.get(parameterIndex - 1), typeVariableName("T", parameterIndex).toString().toLowerCase()))
                .build();
    }

    private MethodSpec methodSpecForMatchExceptionAbstract(
            final List<TypeVariableName> typeVariableNameList)
    {
        return methodSpecForMatchExceptionHelper(typeVariableNameList)
                .addModifiers(PUBLIC, ABSTRACT)
                .build();
    }

    private MethodSpec.Builder methodSpecForMatchExceptionHelper(
            final List<TypeVariableName> typeVariableNameList)
    {
        final var typeVariableNameReturn = TypeVariableName.get("R1");
        final var typeVariableNameException = TypeVariableName.get("E", Exception.class);
        final var parameterSpecList = typeVariableNameList.stream().map(typeVariableNameInner -> ParameterSpec.builder(ParameterizedTypeName.get(ClassName.get("io.github.drewctaylor.function.exception", "F1E"), List.of(typeVariableNameInner, typeVariableNameReturn, typeVariableNameException).toArray(TypeVariableName[]::new)), format("f%s", typeVariableNameInner), Modifier.FINAL).build()).collect(toList());

        final var javadoc = JavadocSpec.Builder.javadocBuilder()
                .add("Return the output of the given function when given the value of this sum as input.")
                .addParameterWithStringDescription(parameterSpecList, (
                        parameterSpec,
                        parameterSpecIndex) -> format("the function to apply to value %s", parameterSpecIndex + 1))
                .addTypeVariable(typeVariableNameReturn, "the type of the output value")
                .addTypeVariable(typeVariableNameException, "the type of the exception")
                .addThrows(typeVariableNameException, "if the given function throws an exception")
                .setReturn("the output of the given function when given the value of this sum as input")
                .build()
                .toCodeBlock();

        return MethodSpec
                .methodBuilder("matchException")
                .addJavadoc(javadoc)
                .addTypeVariable(typeVariableNameReturn)
                .addTypeVariable(typeVariableNameException)
                .returns(typeVariableNameReturn)
                .addParameters(parameterSpecList)
                .addException(typeVariableNameException);
    }

    private MethodSpec methodSpecForMatchEffect(
            final int parameterIndex,
            final List<TypeVariableName> typeVariableNameList)
    {
        return methodSpecForMatchEffectHelper(typeVariableNameList)
                .addModifiers(PUBLIC)
                .addCode(CodeBlock.of("f$L.f($N);", typeVariableNameList.get(parameterIndex - 1), typeVariableName("T", parameterIndex).toString().toLowerCase()))
                .build();
    }

    private MethodSpec methodSpecForMatchEffectAbstract(
            final List<TypeVariableName> typeVariableNameList)
    {
        return methodSpecForMatchEffectHelper(typeVariableNameList)
                .addModifiers(PUBLIC, ABSTRACT)
                .build();
    }

    private MethodSpec.Builder methodSpecForMatchEffectHelper(
            final List<TypeVariableName> typeVariableNameList)
    {
        final var parameterSpecList = typeVariableNameList.stream().map(typeVariableNameInner -> ParameterSpec.builder(ParameterizedTypeName.get(ClassName.get("io.github.drewctaylor.effect", "E1"), List.of(typeVariableNameInner).toArray(TypeVariableName[]::new)), format("f%s", typeVariableNameInner), Modifier.FINAL).build()).collect(toList());

        final var javadoc = JavadocSpec.Builder.javadocBuilder()
                .add("Executes the given effect when given the value of this sum as input.")
                .addParameterWithStringDescription(parameterSpecList, (
                        parameterSpec,
                        parameterSpecIndex) -> format("the effect to apply to value %s", parameterSpecIndex + 1))
                .build()
                .toCodeBlock();

        return MethodSpec
                .methodBuilder("matchEffect")
                .addJavadoc(javadoc)
                .addParameters(parameterSpecList);
    }

    private MethodSpec methodSpecForMatchEffectException(
            final int parameterIndex,
            final List<TypeVariableName> typeVariableNameList)
    {
        return methodSpecForMatchEffectExceptionHelper(typeVariableNameList)
                .addModifiers(PUBLIC)
                .addCode(CodeBlock.of("f$L.f($N);", typeVariableNameList.get(parameterIndex - 1), typeVariableName("T", parameterIndex).toString().toLowerCase()))
                .build();
    }

    private MethodSpec methodSpecForMatchEffectExceptionAbstract(
            final List<TypeVariableName> typeVariableNameList)
    {
        return methodSpecForMatchEffectExceptionHelper(typeVariableNameList)
                .addModifiers(PUBLIC, ABSTRACT)
                .build();
    }

    private MethodSpec.Builder methodSpecForMatchEffectExceptionHelper(
            final List<TypeVariableName> typeVariableNameList)
    {
        final var typeVariableNameException = TypeVariableName.get("E", Exception.class);
        final var parameterSpecList = typeVariableNameList.stream().map(typeVariableNameInner -> ParameterSpec.builder(ParameterizedTypeName.get(ClassName.get("io.github.drewctaylor.effect.exception", "E1E"), List.of(typeVariableNameInner, typeVariableNameException).toArray(TypeVariableName[]::new)), format("f%s", typeVariableNameInner), Modifier.FINAL).build()).collect(toList());

        final var javadoc = JavadocSpec.Builder.javadocBuilder()
                .add("Executes the given effect when given the value of this sum as input.")
                .addParameterWithStringDescription(parameterSpecList, (
                        parameterSpec,
                        parameterSpecIndex) -> format("the effect to apply to value %s", parameterSpecIndex + 1))
                .addTypeVariable(typeVariableNameException, "the type of the exception")
                .addThrows(typeVariableNameException, "if the given effect throws an exception")
                .build()
                .toCodeBlock();

        return MethodSpec
                .methodBuilder("matchEffectException")
                .addJavadoc(javadoc)
                .addTypeVariable(typeVariableNameException)
                .addParameters(parameterSpecList)
                .addException(typeVariableNameException);
    }

    private List<TypeSpec> typeSpecList()
    {
        return IntStream.range(1, parameterCount + 1).mapToObj(parameterIndex -> TypeSpec
                .classBuilder(format("S%sT%s", typeVariableNameList.size(), parameterIndex))
                .addModifiers(PRIVATE, STATIC, FINAL)
                .addTypeVariables(typeVariableNameList)
                .superclass(ParameterizedTypeName.get(ClassName.get("io.github.drewctaylor.sum", format("S%s", parameterCount), "Default"), typeVariableNameList.toArray(TypeVariableName[]::new)))
                .addField(FieldSpec.builder(typeVariableName("T", parameterIndex), typeVariableName("T", parameterIndex).toString().toLowerCase(), PRIVATE, FINAL).build())
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(PRIVATE)
                        .addParameter(ParameterSpec.builder(typeVariableName("T", parameterIndex), typeVariableName("T", parameterIndex).toString().toLowerCase(), FINAL).build())
                        .addCode(CodeBlock.of("this.$N = $N;", typeVariableName("T", parameterIndex).toString().toLowerCase(), typeVariableName("T", parameterIndex).toString().toLowerCase()))
                        .build())
                .addMethod(methodSpecForMatch(parameterIndex, typeVariableNameList))
                .addMethod(methodSpecForMatchException(parameterIndex, typeVariableNameList))
                .addMethod(methodSpecForMatchEffect(parameterIndex, typeVariableNameList))
                .addMethod(methodSpecForMatchEffectException(parameterIndex, typeVariableNameList))
                .build()).collect(toList());
    }

    private List<MethodSpec> methodSpecList()
    {
        return IntStream.range(1, parameterCount + 1).mapToObj(parameterIndex ->
        {
            final var parameterSpec = ParameterSpec.builder(typeVariableName("T", parameterIndex), typeVariableName("T", parameterIndex).toString().toLowerCase(), FINAL).build();

            return MethodSpec
                    .methodBuilder(format("s%st%s", typeVariableNameList.size(), parameterIndex))
                    .addJavadoc(JavadocSpec.Builder.javadocBuilder()
                            .add(format("Returns a %s-value sum.", parameterCount))
                            .addParameter(parameterSpec, format("value %s", parameterIndex))
                            .addTypeVariableWithStringDescription(typeVariableNameList, (
                                    typeVariableName,
                                    typeVariableNameIndex) -> format("the type of value %s", typeVariableNameIndex + 1))
                            .setReturn(format("a %s-value sum", parameterCount))
                            .build()
                            .toCodeBlock())
                    .addModifiers(PUBLIC, STATIC, FINAL)
                    .addTypeVariables(typeVariableNameList)
                    .returns(parameterizedTypeName)
                    .addParameter(parameterSpec)
                    .addCode(CodeBlock.of("return new $L<>($N);", format("S%sT%s", typeVariableNameList.size(), parameterIndex), typeVariableName("T",
                            parameterIndex).toString().toLowerCase()))
                    .build();
        })
                .collect(toList());
    }

    /**
     * Return a java file that implements the descriptor for the sum.
     *
     * @return a java file that implements the descriptor for the sum
     */
    public JavaFile javaFile()
    {
        final var javadoc = JavadocSpec.Builder.javadocBuilder()
                .add(format("A %s-value sum.", parameterCount))
                .addTypeVariableWithStringDescription(typeVariableNameList, (
                        typeVariableName,
                        typeVariableNameIndex) -> format("the type of value %s", typeVariableNameIndex + 1))
                .build()
                .toCodeBlock();

        final var javadocDefault = JavadocSpec.Builder.javadocBuilder()
                .add(format("A default %s-value sum.", parameterCount))
                .addTypeVariableWithStringDescription(typeVariableNameList, (
                        typeVariableName,
                        typeVariableNameIndex) -> format("the type of value %s", typeVariableNameIndex + 1))
                .build()
                .toCodeBlock();

        return JavaFile.builder(
                className.packageName(),
                TypeSpec.interfaceBuilder(className.simpleName())
                        .addJavadoc(javadoc)
                        .addModifiers(PUBLIC)
                        .addTypeVariables(typeVariableNameList)
                        .addMethod(methodSpecForMatchAbstract(typeVariableNameList))
                        .addMethod(methodSpecForMatchExceptionAbstract(typeVariableNameList))
                        .addMethod(methodSpecForMatchEffectAbstract(typeVariableNameList))
                        .addMethod(methodSpecForMatchEffectExceptionAbstract(typeVariableNameList))
                        .addType(
                                TypeSpec.classBuilder(SIMPLE_NAME_DEFAULT)
                                        .addJavadoc(javadocDefault)
                                        .addSuperinterface(parameterizedTypeName)
                                        .addModifiers(PUBLIC, STATIC, ABSTRACT)
                                        .addTypeVariables(typeVariableNameList)
                                        .addMethod(MethodSpec.constructorBuilder().addModifiers(PRIVATE).build())
                                        .addTypes(typeSpecList())
                                        .addMethods(methodSpecList())
                                        .build())
                        .build())
                .skipJavaLangImports(true)
                .addStaticImport(Require.class, "requireNonNull")
                .build();
    }

}
