package io.github.drewctaylor.javapoet;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeSpec.Builder;
import com.squareup.javapoet.TypeVariableName;
import io.github.drewctaylor.require.Require;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static io.github.drewctaylor.javapoet.JavadocSpec.Builder.returnJavadoc;
import static io.github.drewctaylor.require.Require.requireNonNull;
import static io.github.drewctaylor.require.RequireBound.requireGreaterThanOrEqual;
import static io.github.drewctaylor.require.RequireNumberInteger.requirePositive;
import static io.github.drewctaylor.require.RequireNumberInteger.requireZeroOrPositive;
import static java.lang.String.format;
import static java.lang.System.lineSeparator;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.empty;
import static java.util.stream.Stream.of;
import static javax.lang.model.element.Modifier.ABSTRACT;
import static javax.lang.model.element.Modifier.DEFAULT;
import static javax.lang.model.element.Modifier.FINAL;
import static javax.lang.model.element.Modifier.PRIVATE;
import static javax.lang.model.element.Modifier.PUBLIC;
import static javax.lang.model.element.Modifier.STATIC;

public final class JavaPoetUtility
{
    private JavaPoetUtility()
    {
    }

    /**
     * Return the "FN" java file given a parameter count, an exception, and an effect.
     *
     * @param  parameterCount the given parameter count
     * @param  exception      the given exception
     * @param  effect         the given effect
     * 
     * @return                the "FN" java file
     */
    public static JavaFile file(
            final int parameterCount,
            final boolean exception,
            final boolean effect)
    {
        final var className = className(parameterCount, exception, effect);

        final Function<Builder, Builder> typeSpecBuilderAddMethodByEffect = builder -> effect ?
                builder :
                builder
                        .addMethod(then(parameterCount, exception))
                        .addMethods(c(parameterCount, exception).collect(toList()));

        final Function<Builder, Builder> typeSpecBuilderAddMethodByException = builder -> exception ?
                builder.addMethod(e(parameterCount, effect)) :
                builder;

        final Function<Builder, Builder> typeSpecBuilderAddMethodByParameterCount = builder -> parameterCount == 0 ?
                effect ?
                        builder
                                .addMethods(c(parameterCount, exception, effect).collect(toList())) :
                        builder :
                parameterCount == 1 ?
                        builder
                                .addMethods(c(parameterCount, exception, effect).collect(toList()))
                                .addMethod(apply(parameterCount, exception, effect)) :
                        builder
                                .addMethods(c(parameterCount, exception, effect).collect(toList()))
                                .addMethod(apply(parameterCount, exception, effect))
                                .addMethod(reverse(parameterCount, exception, effect))
                                .addMethod(curry(parameterCount, exception, effect))
                                .addMethod(uncurry(parameterCount, exception, effect));

        final var javadoc = concat(
                of(format("A %s-parameter %s%s.", parameterCount, effect ? "effect" : "function", exception ? " that may throw an exception" : "")),
                typeVariableNameJavadocList(0, parameterCount, typeVariableNameR(1), exception, effect))
                        .collect(joining(lineSeparator()));

        return JavaFile.builder(
                className.packageName(),
                typeSpecBuilderAddMethodByException
                        .apply(typeSpecBuilderAddMethodByEffect
                                .apply(typeSpecBuilderAddMethodByParameterCount
                                        .apply(TypeSpec
                                                .interfaceBuilder(className.simpleName())
                                                .addJavadoc(javadoc)
                                                .addAnnotation(FunctionalInterface.class)
                                                .addModifiers(PUBLIC)
                                                .addTypeVariables(typeVariableNameList(0, parameterCount, typeVariableNameR(1), exception, effect).collect(toList()))
                                                .addSuperinterfaces(superInterface(parameterCount, exception, effect).collect(toList()))
                                                .addMethod(f(parameterCount, exception, effect))
                                                .addMethod(fN(parameterCount, exception, effect)))))
                        .addMethods(methodSpec(parameterCount, exception, effect).collect(toList()))
                        .build())
                .skipJavaLangImports(true)
                .addStaticImport(Require.class, "requireNonNull")
                .build();
    }

    private static Stream<TypeName> superInterface(
            final int parameterCount,
            final boolean exception,
            final boolean effect)
    {
        return exception ?
                empty() :
                effect ?
                        parameterCount == 1 ?
                                of(ParameterizedTypeName.get(ClassName.get("java.util.function", "Consumer"), typeVariableNameList(0, parameterCount, typeVariableNameR(1), exception, effect).toArray(TypeVariableName[]::new))) :
                                parameterCount == 2 ?
                                        of(ParameterizedTypeName.get(ClassName.get("java.util.function", "BiConsumer"), typeVariableNameList(0, parameterCount, typeVariableNameR(1), exception, effect).toArray(TypeVariableName[]::new))) :
                                        empty() :
                        parameterCount == 0 ?
                                of(ParameterizedTypeName.get(ClassName.get("java.util.function", "Supplier"), typeVariableNameList(0, parameterCount, typeVariableNameR(1), exception, effect).toArray(TypeVariableName[]::new))) :
                                parameterCount == 1 ?
                                        of(ParameterizedTypeName.get(ClassName.get("java.util.function", "Function"), typeVariableNameList(0, parameterCount, typeVariableNameR(1), exception, effect).toArray(TypeVariableName[]::new))) :
                                        parameterCount == 2 ?
                                                of(ParameterizedTypeName.get(ClassName.get("java.util.function", "BiFunction"), typeVariableNameList(0, parameterCount, typeVariableNameR(1), exception, effect).toArray(TypeVariableName[]::new))) :
                                                empty();
    }

    private static Stream<MethodSpec> methodSpec(
            final int parameterCount,
            final boolean exception,
            final boolean effect)
    {
        return exception ?
                empty() :
                effect ?
                        parameterCount == 1 ?
                                of(MethodSpec
                                        .methodBuilder("accept")
                                        .addAnnotation(Override.class)
                                        .addModifiers(PUBLIC, DEFAULT)
                                        .addParameters(parameterSpecList(parameterCount).collect(toList()))
                                        .addStatement(format("f(%s)", parameterNameListDelimitedByComma(parameterCount)))
                                        .build()) :
                                parameterCount == 2 ?
                                        of(MethodSpec
                                                .methodBuilder("accept")
                                                .addAnnotation(Override.class)
                                                .addModifiers(PUBLIC, DEFAULT)
                                                .addParameters(parameterSpecList(parameterCount).collect(toList()))
                                                .addStatement(format("f(%s)", parameterNameListDelimitedByComma(parameterCount)))
                                                .build()) :
                                        empty() :
                        parameterCount == 0 ?
                                of(MethodSpec
                                        .methodBuilder("get")
                                        .addAnnotation(Override.class)
                                        .addModifiers(PUBLIC, DEFAULT)
                                        .returns(typeVariableNameR(1))
                                        .addParameters(parameterSpecList(parameterCount).collect(toList()))
                                        .addStatement(format("return f(%s)", parameterNameListDelimitedByComma(parameterCount)))
                                        .build()) :
                                parameterCount == 1 ?
                                        of(MethodSpec
                                                .methodBuilder("apply")
                                                .addAnnotation(Override.class)
                                                .addModifiers(PUBLIC, DEFAULT)
                                                .returns(typeVariableNameR(1))
                                                .addParameters(parameterSpecList(parameterCount).collect(toList()))
                                                .addStatement(format("return f(%s)", parameterNameListDelimitedByComma(parameterCount)))
                                                .build()) :
                                        parameterCount == 2 ?
                                                of(MethodSpec
                                                        .methodBuilder("apply")
                                                        .addAnnotation(Override.class)
                                                        .addModifiers(PUBLIC, DEFAULT)
                                                        .returns(typeVariableNameR(1))
                                                        .addParameters(parameterSpecList(parameterCount).collect(toList()))
                                                        .addStatement(format("return f(%s)", parameterNameListDelimitedByComma(parameterCount)))
                                                        .build()) :
                                                empty();
    }

    /**
     * Return the "f" method spec given a parameter count, an exception, and an effect.
     *
     * @param  parameterCount the given parameter count
     * @param  exception      the given exception
     * @param  effect         the given effect
     * 
     * @return                the "f" method spec
     */
    private static MethodSpec f(
            final int parameterCount,
            final boolean exception,
            final boolean effect)
    {
        final var e = typeVariableNameE();
        final var r = typeVariableNameR(1);

        final var javadocReturn = "the output value of this function";

        final var javadoc = concat(concat(concat(
                of(effect ? "Executes this effect." : format("Returns %s.", javadocReturn)),
                pJavadocList(parameterCount)),
                effect ? empty() : of(format("@return %s", javadocReturn))),
                exception ? of("@throws E the exception") : empty())
                        .collect(joining(lineSeparator()));

        final var builder1 = MethodSpec
                .methodBuilder("f")
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC, ABSTRACT)
                .addParameters(parameterSpecList(parameterCount).collect(toList()));

        final var builder2 = exception ? builder1.addException(e) : builder1;
        final var builder3 = effect ? builder2 : builder2.returns(r);

        return builder3.build();
    }

    /**
     * Return the "then" method spec given a parameter count and an exception.
     *
     * @param  parameterCount the given parameter count
     * @param  exception      the given exception
     * 
     * @return                the "the" method spec
     */
    private static MethodSpec then(
            final int parameterCount,
            final boolean exception)
    {
        final var r1 = typeVariableNameR(1);
        final var r2 = typeVariableNameR(2);
        final var parameterSpec = parameterSpec(ParameterizedTypeName.get(className(1, false, false), r1, r2));

        final var javadocReturn = "a function that is the given function composed with this function";

        final var javadoc = of(
                format("Returns %s.", javadocReturn),
                format("@param %s the given function", parameterSpec.name),
                format("@param <%s> the type of the output value", r2.name),
                format("@return %s", javadocReturn),
                format("@throws NullPointerException if %s is null", parameterSpec.name))
                        .collect(joining(lineSeparator()));

        return MethodSpec
                .methodBuilder("then")
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC, DEFAULT)
                .addTypeVariable(r2)
                .returns(parameterizedTypeName(parameterCount, r2, exception, false))
                .addParameter(parameterSpec)
                .addStatement("$T.requireNonNull($N, \"$N\")", Require.class, parameterSpec.name, parameterSpec.name)
                .addStatement(format("return (%s) -> $N.f(f(%s))", parameterNameListDelimitedByComma(parameterCount), parameterNameListDelimitedByComma(parameterCount)), parameterSpec.name)
                .build();
    }

    /**
     * Return the "c" method spec given a parameter count, an exception, and an effect.
     *
     * @param  parameterCount the given parameter count
     * @param  exception      the given exception
     * @param  effect         the given effect
     * 
     * @return                the "c" method spec
     */
    private static Stream<MethodSpec> c(
            final int parameterCount,
            final boolean exception,
            final boolean effect)
    {
        final var p1 = TypeVariableName.get("P1");

        final var javadocReturn = effect ? "an effect that does nothing" : "a function that returns its first parameter value as its output value";

        final var javadoc = concat(concat(
                of(format("Returns %s.", javadocReturn)),
                typeVariableNameJavadocList(parameterCount, exception)),
                of(format("@return %s", javadocReturn)))
                        .collect(joining(lineSeparator()));

        final Function<MethodSpec.Builder, MethodSpec> methodSpecF = methodSpecBuilder -> parameterCount == 0 ?
                methodSpecBuilder
                        .addJavadoc(javadoc)
                        .addModifiers(PUBLIC, STATIC)
                        .addTypeVariables(typeVariableNameList(0, parameterCount, typeVariableNameR(1), exception, effect).collect(toList()))
                        .returns(typeVariableNameF(0, parameterCount, typeVariableNameR(1), exception, effect))
                        .addStatement(format(effect ? "return (%s) -> {}" : "return (%s) -> p1", parameterNameListDelimitedByComma(parameterCount)))
                        .build() :
                methodSpecBuilder
                        .addJavadoc(javadoc)
                        .addModifiers(PUBLIC, STATIC)
                        .addTypeVariables(typeVariableNameList(parameterCount, exception).collect(toList()))
                        .returns(parameterizedTypeName(parameterCount, p1, exception, effect))
                        .addStatement(format(effect ? "return (%s) -> {}" : "return (%s) -> p1", parameterNameListDelimitedByComma(parameterCount)))
                        .build();

        return concat(
                of(methodSpecF.apply(MethodSpec
                        .methodBuilder(effect ? "nop" : "c"))),
                !exception && !effect && parameterCount == 1 ?
                        of(methodSpecF.apply(MethodSpec
                                .methodBuilder("identity"))) :
                        empty());
    }

    /**
     * Return the "c" method spec given a parameter count and an exception.
     *
     * @param  parameterCount the given parameter count
     * @param  exception      the given exception
     * 
     * @return                the "c" method spec
     */
    private static Stream<MethodSpec> c(
            final int parameterCount,
            final boolean exception)
    {
        final var r = typeVariableNameR(1);
        final var parameterSpec = parameterSpec(r);

        final var javadocReturn = "a function that returns the given value as its output value";

        final var javadoc = concat(concat(of(
                format("Returns %s.", javadocReturn),
                format("@param %s the given value", parameterSpec.name)),
                typeVariableNameJavadocList(0, parameterCount, r, exception, false)),
                of(format("@return %s", javadocReturn)))
                        .collect(joining(lineSeparator()));

        final Function<MethodSpec.Builder, MethodSpec> methodSpecF = methodSpecBuilder -> methodSpecBuilder
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC, STATIC)
                .addTypeVariables(typeVariableNameList(0, parameterCount, r, exception, false).collect(toList()))
                .returns(parameterizedTypeName(parameterCount, r, exception, false))
                .addParameter(parameterSpec)
                .addStatement(format("return (%s) -> $N", parameterNameListDelimitedByComma(parameterCount)), parameterSpec.name)
                .build();

        return concat(
                of(methodSpecF.apply(MethodSpec
                        .methodBuilder("c"))),
                !exception && parameterCount == 1 ?
                        of(methodSpecF.apply(MethodSpec
                                .methodBuilder("constant"))) :
                        empty());
    }

    /**
     * Return the "e" method spec given a parameter count and an effect.
     *
     * @param  parameterCount the given parameter count
     * @param  effect         the given effect
     * 
     * @return                the "e" method spec
     */
    private static MethodSpec e(
            final int parameterCount,
            final boolean effect)
    {
        final var e = typeVariableNameE();
        final var r = typeVariableNameR(1);
        final var parameterSpec = parameterSpec(e);

        final var javadocReturn = format("%s that throws the given exception", effect ? "an effect" : "a function");

        final var javadoc = concat(concat(concat(of(
                format("Returns %s.", javadocReturn),
                format("@param %s the given exception", parameterSpec.name)),
                typeVariableNameJavadocList(0, parameterCount, r, true, effect)),
                of(format("@return %s", javadocReturn))),
                of(format("@throws NullPointerException if %s is null", parameterSpec.name)))
                        .collect(joining(lineSeparator()));

        return MethodSpec
                .methodBuilder("e")
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC, STATIC)
                .addTypeVariables(typeVariableNameList(0, parameterCount, r, true, effect).collect(toList()))
                .returns(parameterizedTypeName(parameterCount, r, true, effect))
                .addParameter(parameterSpec)
                .addStatement("$T.requireNonNull($N, \"$N\")", Require.class, parameterSpec.name, parameterSpec.name)
                .addStatement(format("return (%s) -> { throw $N; }", parameterNameListDelimitedByComma(parameterCount)), parameterSpec.name)
                .build();
    }

    /**
     * Return the "fN" or "eN" method spec given a parameter count, an exception, and an effect.
     *
     * @param  parameterCount the given parameter count
     * @param  exception      the given exception
     * @param  effect         the given effect
     * 
     * @return                the "fN" or "eN" method spec
     */
    private static MethodSpec fN(
            final int parameterCount,
            final boolean exception,
            final boolean effect)
    {
        final var r = typeVariableNameR(1);
        final var parameterSpec = parameterSpec(typeVariableNameF(0, parameterCount, r, exception, effect));

        final var javadocReturn = format("a form of the given %s that is of this %s type", effect ? "effect" : "function", effect ? "effect" : "function");

        final var javadoc = concat(concat(concat(of(
                format("Returns %s.", javadocReturn),
                format("@param %s the given %s", parameterSpec.name, effect ? "effect" : "function")),
                typeVariableNameJavadocList(0, parameterCount, r, exception, effect)),
                of(format("@return %s", javadocReturn))),
                of(format("@throws NullPointerException if %s is null", parameterSpec.name)))
                        .collect(joining(lineSeparator()));

        return MethodSpec
                .methodBuilder(parameterSpec.name)
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC, STATIC)
                .addTypeVariables(typeVariableNameList(0, parameterCount, r, exception, effect).collect(toList()))
                .returns(typeVariableNameF(0, parameterCount, r, exception, effect))
                .addParameter(parameterSpec)
                .addStatement("$T.requireNonNull($N, \"$N\")", Require.class, parameterSpec.name, parameterSpec.name)
                .addStatement("return $N", parameterSpec.name)
                .build();
    }

    /**
     * Return the "apply" method spec given a parameter count, an exception, and an effect.
     *
     * @param  parameterCount the given parameter count
     * @param  exception      the given exception
     * @param  effect         the given effect
     * 
     * @return                the "apply" method spec
     */
    private static MethodSpec apply(
            final int parameterCount,
            final boolean exception,
            final boolean effect)
    {
        final var r = typeVariableNameR(1);
        final var p1 = TypeVariableName.get("P1");

        final var javadocReturn = format("a form of this %s with the value of parameter 1 fixed to the given value", effect ? "effect" : "function");

        final var javadoc = of(
                format("Returns %s.", javadocReturn),
                format("@param %s %s", parameterSpec(p1).name, "the given value"),
                format("@return %s", javadocReturn))
                        .collect(joining(lineSeparator()));

        return MethodSpec
                .methodBuilder("a")
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC, DEFAULT)
                .returns(typeVariableNameF(1, parameterCount, r, exception, effect))
                .addParameter(parameterSpec(p1))
                .addStatement(format("return (%s) -> f(%s)", parameterNameListDelimitedByCommaShift(parameterCount), parameterNameListDelimitedByComma(parameterCount)))
                .build();
    }

    /**
     * Return the "curry" method spec given a parameter count, an exception, and an effect.
     *
     * @param  parameterCount the given parameter count
     * @param  exception      the given exception
     * @param  effect         the given effect
     * 
     * @return                the "curry" method spec
     */
    private static MethodSpec curry(
            final int parameterCount,
            final boolean exception,
            final boolean effect)
    {
        final var javadocReturn = format("a curried form of this %s", effect ? "effect" : "function");

        final var javadoc = of(
                format("Returns %s.", javadocReturn),
                format("@return %s", javadocReturn))
                        .collect(joining(lineSeparator()));

        return MethodSpec
                .methodBuilder("curry")
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC, DEFAULT)
                .returns(parameterizedTypeNameCurry(parameterCount, exception, effect))
                .addStatement(format("return %s -> f(%s)", parameterNameListDelimitedByArrow(parameterCount), parameterNameListDelimitedByComma(parameterCount)))
                .build();
    }

    /**
     * Return the "uncurry" method spec given a parameter count, an exception, and an effect.
     *
     * @param  parameterCount the given parameter count
     * @param  exception      the given exception
     * @param  effect         the given effect
     * 
     * @return                the "uncurry" method spec
     */
    private static MethodSpec uncurry(
            final int parameterCount,
            final boolean exception,
            final boolean effect)
    {
        final var r1 = typeVariableNameR(1);
        final var parameterSpec = parameterSpec(parameterizedTypeNameCurry(parameterCount, exception, effect));

        final var javadocReturn = format("an uncurried form of the given %s", effect ? "effect" : "function");

        final var javadoc = concat(concat(concat(of(
                format("Returns %s.", javadocReturn),
                format("@param %s the given %s", parameterSpec.name, effect ? "effect" : "function")),
                typeVariableNameJavadocList(0, parameterCount, r1, exception, effect)),
                of(format("@return %s", javadocReturn))),
                of(format("@throws NullPointerException if %s is null", parameterSpec.name)))
                        .collect(joining(lineSeparator()));

        return MethodSpec
                .methodBuilder("uncurry")
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC, STATIC)
                .addTypeVariables(typeVariableNameList(0, parameterCount, r1, exception, effect).collect(toList()))
                .returns(parameterizedTypeName(parameterCount, r1, exception, effect))
                .addParameter(parameterSpec)
                .addStatement("$T.requireNonNull($N, \"$N\")", Require.class, parameterSpec.name, parameterSpec.name)
                .addStatement(format("return (%s) -> $N.%s", parameterNameListDelimitedByComma(parameterCount), parameterNameListDelimitedByF(parameterCount)), parameterSpec.name)
                .build();
    }

    /**
     * Return the "reverse" method spec given a parameter count, an exception, and an effect.
     *
     * @param  parameterCount the given parameter count
     * @param  exception      the given exception
     * @param  effect         the given effect
     * 
     * @return                the "reverse" method spec
     */
    private static MethodSpec reverse(
            final int parameterCount,
            final boolean exception,
            final boolean effect)
    {
        final var javadocReturn = format("a form of this %s where the order of the parameters is reversed", effect ? "effect" : "function");

        final var javadoc = of(
                format("Returns %s.", javadocReturn),
                format("@return %s", javadocReturn))
                        .collect(joining(lineSeparator()));

        return MethodSpec
                .methodBuilder("reverse")
                .addJavadoc(javadoc)
                .addModifiers(PUBLIC, DEFAULT)
                .returns(parameterizedTypeNameReverse(parameterCount, typeVariableNameR(1), exception, effect))
                .addStatement(format("return (%s) -> f(%s)", parameterNameListDelimitedByCommaReverse(parameterCount), parameterNameListDelimitedByComma(parameterCount)))
                .build();
    }

    /**
     * Return a parameter specification list for the given parameter count.
     * <ul>
     * <li>0 -> (empty list)</li>
     * <li>1 -> final P1 p1</li>
     * <li>2 -> final P1 p1, final P2 p2</li>
     * </ul>
     *
     * @param  parameterCount the given parameter count
     * 
     * @return                the parameter specification list
     */
    private static Stream<ParameterSpec> parameterSpecList(
            final int parameterCount)
    {
        requireZeroOrPositive(parameterCount, "parameterCount");

        return range(0, parameterCount)
                .mapToObj(i -> parameterSpec(typeVariableNameP(i)));
    }

    /**
     * Return a parameter specification for the given type name.
     * <p>
     * package.TypeName < T0 > -> final TypeName < T0 > typeName
     *
     * @param  typeName the given type name
     * 
     * @return          the parameter specification
     */
    private static ParameterSpec parameterSpec(
            final TypeName typeName)
    {
        requireNonNull(typeName, "typeName");

        final var beforeOpen = typeName.toString().contains("<") ? typeName.toString().substring(0, typeName.toString().indexOf('<')) : typeName.toString();
        final var afterPackage = beforeOpen.contains(".") ? beforeOpen.substring(beforeOpen.lastIndexOf('.') + 1) : beforeOpen;
        final var parameterName = afterPackage.toLowerCase();

        return ParameterSpec.builder(typeName, parameterName, FINAL).build();
    }

    /**
     * Return a type variable name for the given first parameter, parameter count,
     * exception, and effect.
     * <p>
     * // @formatter:off
     * <ul>
     * <li>(0 0 R1 false false) -> F0  < R1        > </li>
     * <li>(1 1 R1 false false) -> F0  < R1        > </li>
     * <li>(0 1 R1 false false) -> F1  < P1, R1    > </li>
     * <li>(1 2 R1 false false) -> F1  < P2, R1    > </li>
     * <li>(0 0 R1 true  false) -> F0E < R1, E     > </li>
     * <li>(1 1 R1 true  false) -> F0E < R1, E     > </li>
     * <li>(0 1 R1 true  false) -> F1E < P1, R1, E > </li>
     * <li>(1 2 R1 true  false) -> F1E < P2, R1, E > </li>
     * <li>(0 0 R1 false false) -> E0                </li>
     * <li>(1 1 R1 false false) -> E0                </li>
     * <li>(0 1 R1 false false) -> E1  < P1        > </li>
     * <li>(1 2 R1 false false) -> E1  < P2        > </li>
     * <li>(0 0 R1 true  false) -> E0E < E         > </li>
     * <li>(1 1 R1 true  false) -> E0E < R1, E     > </li>
     * <li>(0 1 R1 true  false) -> E1E < P1, E     > </li>
     * <li>(1 2 R1 true  false) -> E1E < P2, R1, E > </li>
     * </ul>
     * // @formatter:on
     *
     * @param parameterCount the given parameter count
     * @param exception      the given exception
     * @param effect         the given effect
     * @return the parameterized type name
     */
    private static TypeName typeVariableNameF(
            final int parameterFirst,
            final int parameterCount,
            final TypeVariableName r,
            final boolean exception,
            final boolean effect)
    {
        return match(
                typeVariableNameList(parameterFirst, parameterCount, r, exception, effect),
                () -> className(parameterCount - parameterFirst, exception, effect),
                typeVariableNameListInner -> ParameterizedTypeName.get(
                        className(parameterCount - parameterFirst, exception, effect),
                        typeVariableNameListInner.toArray(TypeVariableName[]::new)));
    }

    /**
     * Return a parameter name list, delimited by a comma, beginning with p1.
     * <ul>
     * <li>(0) -></li>
     * <li>(1) -> p1</li>
     * <li>(2) -> p1, p2</li>
     * </ul>
     *
     * @param  parameterCount the given parameter count
     * 
     * @return                a parameter name list, delimited by a comma, beginning with p1
     */
    private static String parameterNameListDelimitedByComma(
            final int parameterCount)
    {
        requireZeroOrPositive(parameterCount, "parameterCount");

        return parameterNameList(0, parameterCount).collect(joining(", "));
    }

    /**
     * Return a parameter name list, delimited by an comma, beginning with p1, reversed.
     * <ul>
     * <li>(2) -> p2, p1</li>
     * <li>(3) -> p3, p2, p1</li>
     * </ul>
     *
     * @param  parameterCount the given parameter count
     * 
     * @return                a parameter name list, delimited by an arrow
     */
    private static String parameterNameListDelimitedByCommaReverse(
            final int parameterCount)
    {
        requireGreaterThanOrEqual(parameterCount, 2, "parameterCount");

        return reverse(parameterNameList(0, parameterCount)).collect(joining(", "));
    }

    /**
     * Return a parameter name list, delimited by a comma, beginning with p2.
     * <ul>
     * <li>(1) -></li>
     * <li>(2) -> p2</li>
     * <li>(3) -> p2, p3</li>
     * </ul>
     *
     * @param  parameterCount the given parameter count
     * 
     * @return                a parameter name list, delimited by a comma, beginning with p2
     */
    private static String parameterNameListDelimitedByCommaShift(
            final int parameterCount)
    {
        requirePositive(parameterCount, "parameterCount");

        return parameterNameList(1, parameterCount).collect(joining(", "));
    }

    /**
     * Return a parameter name list, delimited by an arrow.
     * <ul>
     * <li>(2) -> p1 -> p2</li>
     * <li>(3) -> p1 -> p2 -> p3</li>
     * </ul>
     *
     * @param  parameterCount the given parameter count
     * 
     * @return                a parameter name list, delimited by an arrow
     */
    private static String parameterNameListDelimitedByArrow(
            final int parameterCount)
    {
        requireGreaterThanOrEqual(parameterCount, 2, "parameterCount");

        return parameterNameList(0, parameterCount).collect(joining(" -> "));
    }

    /**
     * Return a parameter name list, delimited by function application.
     * <ul>
     * <li>(2) -> f(p1).f(p2)</li>
     * <li>(3) -> f(p1).f(p2).f(p3)</li>
     * </ul>
     *
     * @param  parameterCount the given parameter count
     * 
     * @return                a parameter name list, delimited by function application
     */
    private static String parameterNameListDelimitedByF(
            final int parameterCount)
    {
        return range(0, parameterCount).mapToObj(i -> format("f(p%s)", i + 1)).collect(joining("."));
    }

    /**
     *
     */
    private static Stream<String> parameterNameList(
            final int parameterFirst,
            final int parameterCount)
    {
        return range(parameterFirst, parameterCount).mapToObj(i -> format("p%s", i + 1));
    }

    /**
     * Return a class name for the given parameter count, exception, and effect.
     *
     * @param  parameterCount the given parameter count
     * @param  exception      the given exception
     * @param  effect         the given effect
     * 
     * @return                the class name
     */
    private static ClassName className(
            final int parameterCount,
            final boolean exception,
            final boolean effect)
    {
        return ClassName.get(
                exception ?
                        effect ?
                                "io.github.drewctaylor.effect.exception" :
                                "io.github.drewctaylor.function.exception" :
                        effect ?
                                "io.github.drewctaylor.effect" :
                                "io.github.drewctaylor.function",
                format(exception ?
                        effect ?
                                "E%sE" :
                                "F%sE" :
                        effect ?
                                "E%s" :
                                "F%s",
                        parameterCount));
    }

    /**
     * Return a type parameter list for the given parameter count and exception.
     * <p>
     * // @formatter:off
     * <ul>
     * <li> (1 false) -> (P1)
     * <li> (1 true)  -> (P1, E)
     * <li> (2 false) -> (P1, P2)
     * <li> (2 true)  -> (P1, P2, E)
     * </ul>
     * // @formatter:on
     *
     * @param parameterCount the given parameter count
     * @param exception      the given exception
     * @return the type parameter list
     */
    private static Stream<TypeVariableName> typeVariableNameList(
            final int parameterCount,
            final boolean exception)
    {
        requirePositive(parameterCount, "parameterCount");

        return exception ?
                concat(typeVariableNameList(0, parameterCount), of(typeVariableNameE())) :
                typeVariableNameList(0, parameterCount);
    }

    /**
     * Return a parameterized type name for the given parameter count, return type variable name, exception, and effect.
     * <p>
     * // @formatter:off
     * <ul>
     * <li>(2, R1, false, false) -> F2  < P1, P2, R1    ></li>
     * <li>(2, R1, true,  false) -> F2E < P1, P2, R1, E ></li>
     * <li>(2, R1, false, true)  -> E2  < P1, P2        ></li>
     * <li>(2, R1, true,  true)  -> E2E < P1, P2, E     ></li>
     * </ul>
     * // @formatter:on
     *
     * @param parameterCount   the given parameter count
     * @param typeVariableName the given return type variable name
     * @param exception        the given exception
     * @param effect           the given effect
     * @return the parameterized type name
     */
    private static ParameterizedTypeName parameterizedTypeName(
            final int parameterCount,
            final TypeVariableName typeVariableName,
            final boolean exception,
            final boolean effect)
    {
        requireZeroOrPositive(parameterCount, "parameterCount");
        requireNonNull(typeVariableName, "typeVariableName");

        return ParameterizedTypeName.get(
                className(parameterCount, exception, effect),
                typeVariableNameList(0, parameterCount, typeVariableName, exception, effect).toArray(TypeVariableName[]::new));
    }

    /**
     * Return a parameterized type name for the given parameter count, return type variable name, exception, and effect; in this case, reverse the parameter types.
     * <p>
     * // @formatter:off
     * <ul>
     * <li>(2, R1, false, false) -> F2  < P2, P1, R1    ></li>
     * <li>(2, R1, true,  false) -> F2E < P2, P1, R2, E ></li>
     * <li>(2, R1, false, true)  -> E2  < P2, P1        ></li>
     * <li>(2, R1, true,  true)  -> E2E < P2, P1, E     ></li>
     * </ul>
     * // @formatter:on
     *
     * @param parameterCount   the given parameter count
     * @param typeVariableName the given return type variable name
     * @param exception        the given exception
     * @param effect           the given effect
     * @return the parameterized type name
     */
    private static ParameterizedTypeName parameterizedTypeNameReverse(
            final int parameterCount,
            final TypeVariableName typeVariableName,
            final boolean exception,
            final boolean effect)
    {
        requireGreaterThanOrEqual(parameterCount, 2, "parameterCount");
        requireNonNull(typeVariableName, "typeVariableName");

        // noinspection ConditionalCanBePushedInsideExpression
        return ParameterizedTypeName.get(
                className(parameterCount, exception, effect),
                (exception ?
                        effect ?
                                concat(reverse(typeVariableNameList(0, parameterCount)), of(typeVariableNameE())) :
                                concat(concat(reverse(typeVariableNameList(0, parameterCount)), of(typeVariableName)), of(typeVariableNameE())) :
                        effect ?
                                reverse(typeVariableNameList(0, parameterCount)) :
                                concat(reverse(typeVariableNameList(0, parameterCount)), of(typeVariableName))).toArray(TypeVariableName[]::new));
    }

    /**
     * Return a parameterized type name for the given parameter count, return type variable name, exception, and effect.
     * <p>
     * // @formatter:off
     * <ul>
     * <li>(2, false, false) -> F1 < P1, F1  < P2, R1    > ></li>
     * <li>(2, true,  false) -> F1 < P1, F1E < P2, R1, E > ></li>
     * <li>(2, false, true)  -> F1 < P1, E1  < P2        > ></li>
     * <li>(2, true,  true)  -> F1 < P1, E1E < P2, E     > ></li>
     * </ul>
     * // @formatter:on
     *
     * @param parameterCount the given parameter count
     * @param exception      the given exception
     * @param effect         the given effect
     * @return the parameterized type name
     */
    private static ParameterizedTypeName parameterizedTypeNameCurry(
            final int parameterCount,
            final boolean exception,
            final boolean effect)
    {
        requireGreaterThanOrEqual(parameterCount, 2, "parameterCount");

        return reverse(typeVariableNameList(0, parameterCount - 1)).sequential()
                .reduce(
                        ParameterizedTypeName.get(
                                className(1, exception, effect),
                                (exception ?
                                        effect ?
                                                of(typeVariableNameP(parameterCount - 1), typeVariableNameE()) :
                                                of(typeVariableNameP(parameterCount - 1), typeVariableNameR(1), typeVariableNameE()) :
                                        effect ?
                                                of(typeVariableNameP(parameterCount - 1)) :
                                                of(typeVariableNameP(parameterCount - 1), typeVariableNameR(1))).toArray(TypeVariableName[]::new)),
                        (
                                parameterizedTypeName,
                                typeVariableName) -> ParameterizedTypeName.get(
                                        className(1, false, false),
                                        typeVariableName,
                                        parameterizedTypeName),
                        (
                                parameterizedTypeName1,
                                parameterizedTypeName2) -> parameterizedTypeName1);
    }

    /**
     * Return a type variable name list for the given parameter index, parameter count, return type variable name,
     * exception, and effect.
     *
     * @param  parameterFirst            the given parameter index
     * @param  parameterCount            the given parameter count
     * @param  typeVariableNameForReturn the given return type variable name
     * @param  exception                 the given exception
     * @param  effect                    the given effect
     * 
     * @return                           the type variable name list
     */
    private static Stream<TypeVariableName> typeVariableNameList(
            final int parameterFirst,
            final int parameterCount,
            final TypeVariableName typeVariableNameForReturn,
            final boolean exception,
            final boolean effect)
    {
        return exception ?
                effect ?
                        concat(typeVariableNameList(parameterFirst, parameterCount), of(typeVariableNameE())) :
                        concat(typeVariableNameList(parameterFirst, parameterCount), of(typeVariableNameForReturn, typeVariableNameE())) :
                effect ?
                        typeVariableNameList(parameterFirst, parameterCount) :
                        concat(typeVariableNameList(parameterFirst, parameterCount), of(typeVariableNameForReturn));
    }

    /**
     * Return a type variable name list for the given parameter index and parameter count.
     *
     * @param  parameterFirst the given parameter index
     * @param  parameterCount the given parameter count
     * 
     * @return                the type variable name list
     */
    private static Stream<TypeVariableName> typeVariableNameList(
            final int parameterFirst,
            final int parameterCount)
    {
        return range(parameterFirst, parameterCount).mapToObj(JavaPoetUtility::typeVariableNameP);
    }

    /**
     * Return a type variable name for the given parameter index.
     * <p>
     * 0 -> P1
     *
     * @param  parameterIndex the given parameter index
     * 
     * @return                the type variable name
     */
    private static TypeVariableName typeVariableNameP(
            final int parameterIndex)
    {
        requireZeroOrPositive(parameterIndex, "parameterIndex");

        return TypeVariableName.get(format("P%s", parameterIndex + 1));
    }

    /**
     * Return a type variable name for the given return index.
     * <p>
     * 1 -> R1
     *
     * @param  returnIndex the given return index
     * 
     * @return             the type variable name
     */
    private static TypeVariableName typeVariableNameR(
            final int returnIndex)
    {
        requirePositive(returnIndex, "returnIndex");

        return TypeVariableName.get(format("R%s", returnIndex));
    }

    /**
     * Return a type variable name for an exception.
     * <p>
     * E
     *
     * @return the type variable name
     */
    private static TypeVariableName typeVariableNameE()
    {
        return TypeVariableName.get("E", Exception.class);
    }

    /**
     * Return a javadoc param list for the given parameter count.
     * <p>
     * (0) -> (empty stream) (1) -> @param p1 the the value of parameter 1
     *
     * @param  parameterCount the given parameter count
     * 
     * @return                the javadoc param list
     */
    private static Stream<String> pJavadocList(
            final int parameterCount)
    {
        return range(0, parameterCount).mapToObj(JavaPoetUtility::pJavadoc);
    }

    /**
     * Return a javadoc param for the given parameter index.
     * <p>
     * (0) -> @param p1 the the value of parameter 1
     *
     * @param  parameterIndex the given parameter index
     * 
     * @return                the javadoc param
     */
    private static String pJavadoc(
            final int parameterIndex)
    {
        requireZeroOrPositive(parameterIndex, "parameterIndex");

        return format("@param %s the value of parameter %s", parameterSpec(typeVariableNameP(parameterIndex)).name, parameterIndex + 1);
    }

    /**
     * Return a javadoc param list for the given parameter count and exception.
     * <p>
     * // @formatter:off
     * <ul>
     * <li>(1 false) -> @param < P1 > the type of parameter 1</li>
     * <li>(1 true)  -> @param < P1 > the type of parameter 1, @param < E > the type of the exception</li>
     *
     * <li>(2 false) -> @param < P1 > the type of parameter 1, @param < P2 > the type of parameter 2</li>
     * <li>(2 true)  -> @param < P1 > the type of parameter 1, @param < P2 > the type of parameter 2, @param < E > the type of the exception</li>
     * </ul>
     * // @formatter:on
     *
     * @param parameterCount the given parameter count
     * @param exception      the given exception
     * @return the javadoc param list
     */
    private static Stream<String> typeVariableNameJavadocList(
            final int parameterCount,
            final boolean exception)
    {
        return typeVariableNameJavadocListHelper(
                0,
                parameterCount,
                Optional.empty(),
                exception,
                true);
    }

    /**
     * Return a javadoc param list for the given parameter index, parameter count, return type variable name, exception, and effect.
     * <p>
     * // @formatter:off
     * <ul>
     * <li>(0 0 R1 false true)  -> ()</li>
     * <li>(0 0 R1 false false) -> (@param < R1 > the type of the output value)</li>
     * <li>(0 0 R1 true  false) -> (@param < R1 > the type of the output value, @param < E  > the type of the exception)</li>
     * <li>(0 0 R1 true  true)  -> (                                            @param < E  > the type of the exception)</li>
     *
     * <li>(0 1 R1 false true)  -> (@param < P1 > the type of parameter 1)</li>
     * <li>(0 1 R1 false false) -> (@param < P1 > the type of parameter 1, @param < R1 > the type of the output value)</li>
     * <li>(0 1 R1 true  false) -> (@param < P1 > the type of parameter 1, @param < R1 > the type of the output value, @param < E  > the type of the exception)</li>
     * <li>(0 1 R1 true  true)  -> (@param < P1 > the type of parameter 1,                                             @param < E  > the type of the exception)</li>
     *
     * <li>(0 2 R1 false true)  -> (@param < P1 > the type of parameter 1, @param < P2 > the type of parameter 2)</li>
     * <li>(0 2 R1 false false) -> (@param < P1 > the type of parameter 1, @param < P2 > the type of parameter 2, @param < R1 > the type of the output value)</li>
     * <li>(0 2 R1 true  false) -> (@param < P1 > the type of parameter 1, @param < P2 > the type of parameter 2, @param < R1 > the type of the output value, @param < E > the type of the exception)</li>
     * <li>(0 2 R1 true  true)  -> (@param < P1 > the type of parameter 1, @param < P2 > the type of parameter 2,                                             @param < E  > the type of the exception)</li>
     * </ul>
     * // @formatter:on
     *
     * @param parameterFirst            the given parameter index
     * @param parameterCount            the given parameter count
     * @param typeVariableNameForReturn the given return type variable name
     * @param exception                 the given exception
     * @param effect                    the given effect
     * @return the javadoc param list
     */
    private static Stream<String> typeVariableNameJavadocList(
            final int parameterFirst,
            final int parameterCount,
            final TypeVariableName typeVariableNameForReturn,
            final boolean exception,
            final boolean effect)
    {
        return typeVariableNameJavadocListHelper(
                parameterFirst,
                parameterCount,
                Optional.ofNullable(typeVariableNameForReturn),
                exception,
                effect);
    }

    /**
     * Return a javadoc param list for the given parameter index, parameter count, return type variable name, exception, and effect.
     * <p>
     * // @formatter:off
     * <ul>
     * <li>(0 0 R1 false true)  -> ()</li>
     * <li>(0 0 R1 false false) -> (@param < R1 > the type of the output value)</li>
     * <li>(0 0 R1 true  false) -> (@param < R1 > the type of the output value, @param < E  > the type of the exception)</li>
     * <li>(0 0 R1 true  true)  -> (                                            @param < E  > the type of the exception)</li>
     *
     * <li>(0 1 R1 false true)  -> (@param < P1 > the type of parameter 1)</li>
     * <li>(0 1 R1 false false) -> (@param < P1 > the type of parameter 1, @param < R1 > the type of the output value)</li>
     * <li>(0 1 R1 true  false) -> (@param < P1 > the type of parameter 1, @param < R1 > the type of the output value, @param < E  > the type of the exception)</li>
     * <li>(0 1 R1 true  true)  -> (@param < P1 > the type of parameter 1,                                             @param < E  > the type of the exception)</li>
     *
     * <li>(0 2 R1 false true)  -> (@param < P1 > the type of parameter 1, @param < P2 > the type of parameter 2)</li>
     * <li>(0 2 R1 false false) -> (@param < P1 > the type of parameter 1, @param < P2 > the type of parameter 2, @param < R1 > the type of the output value)</li>
     * <li>(0 2 R1 true  false) -> (@param < P1 > the type of parameter 1, @param < P2 > the type of parameter 2, @param < R1 > the type of the output value, @param < E > the type of the exception)</li>
     * <li>(0 2 R1 true  true)  -> (@param < P1 > the type of parameter 1, @param < P2 > the type of parameter 2,                                             @param < E  > the type of the exception)</li>
     * </ul>
     * // @formatter:on
     *
     * @param parameterFirst            the given parameter index
     * @param parameterCount            the given parameter count
     * @param typeVariableNameForReturn the given return type variable name
     * @param exception                 the given exception
     * @param effect                    the given effect
     * @return the javadoc param list
     */
    private static Stream<String> typeVariableNameJavadocListHelper(
            final int parameterFirst,
            final int parameterCount,
            final Optional<TypeVariableName> typeVariableNameForReturn,
            final boolean exception,
            final boolean effect)
    {
        requireZeroOrPositive(parameterFirst, "parameterFirst");
        requireZeroOrPositive(parameterCount, "parameterCount");
        requireNonNull(typeVariableNameForReturn, "typeVariableNameForReturn");

        return exception ?
                concat(effect ? typeVariableNameJavadocList(parameterFirst, parameterCount) :
                        concat(typeVariableNameJavadocList(parameterFirst, parameterCount),
                                of(typeVariableNameJavadocR(typeVariableNameForReturn.get()))),
                        of(typeVariableNameJavadocE(typeVariableNameE()))) :
                effect ?
                        typeVariableNameJavadocList(parameterFirst, parameterCount) :
                        concat(typeVariableNameJavadocList(parameterFirst, parameterCount),
                                of(typeVariableNameJavadocR(typeVariableNameForReturn.get())));
    }

    /**
     * Return a javadoc param list for the given parameter count and exception.
     *
     * @param  parameterFirst the given parameter index
     * @param  parameterCount the given parameter count
     * 
     * @return                the javadoc param list
     */
    private static Stream<String> typeVariableNameJavadocList(
            final int parameterFirst,
            final int parameterCount)
    {
        return range(parameterFirst, parameterCount).mapToObj(JavaPoetUtility::typeVariableNameJavadocP);
    }

    /**
     * Return a javadoc type param for the given parameter index.
     * <p>
     * (0) -> @param < P1 > the type of parameter 1
     *
     * @param  parameterIndex the given parameter index
     * 
     * @return                the javadoc param
     */
    private static String typeVariableNameJavadocP(
            final int parameterIndex)
    {
        requireZeroOrPositive(parameterIndex, "parameterIndex");

        return format("@param <%s> the type of parameter %s", typeVariableNameP(parameterIndex), parameterIndex + 1);
    }

    /**
     * Return a javadoc type param for the given return type variable name.
     * <p>
     * () -> @param < R1 > the type of the output value
     *
     * @param  typeVariableNameForReturn the return type variable name
     * 
     * @return                           the javadoc param
     */
    private static String typeVariableNameJavadocR(
            final TypeVariableName typeVariableNameForReturn)
    {
        requireNonNull(typeVariableNameForReturn, "typeVariableNameForReturn");

        return format("@param <%s> the type of the output value", typeVariableNameForReturn.name);
    }

    /**
     * Return a javadoc type param for the given exception type variable name.
     * <p>
     * () -> @param < E > the type of the exception
     *
     * @param  typeVariableNameForException the exception type variable name
     * 
     * @return                              the javadoc param
     */
    private static String typeVariableNameJavadocE(
            final TypeVariableName typeVariableNameForException)
    {
        requireNonNull(typeVariableNameForException, "typeVariableNameForException");

        return format("@param <%s> the type of the exception", typeVariableNameForException.name);
    }

    static <T0> Stream<T0> reverse(
            final Stream<T0> stream)
    {
        final var reverse = stream.collect(toList());
        Collections.reverse(reverse);
        return reverse.stream();
    }

    static <T0, T1> T1 match(
            final Stream<T0> stream,
            final Supplier<T1> supplier,
            final Function<Stream<T0>, T1> function)
    {
        final var list = stream.collect(toList());

        return list.isEmpty() ?
                supplier.get() :
                function.apply(list.stream());
    }

    public static MethodSpec methodSpecForConstructor(
            final List<FieldSpec> fieldSpecList)
    {
        requireNonNull(fieldSpecList, "fieldSpecList");

        return MethodSpec
                .constructorBuilder()
                .addModifiers(PRIVATE)
                .addParameters(fieldSpecList.stream().map(fieldSpec -> ParameterSpec.builder(fieldSpec.type, fieldSpec.name, FINAL).build()).collect(toList()))
                .addCode(fieldSpecList.stream().map(fieldSpec -> CodeBlock.of("this.$N = $N;", fieldSpec.name, fieldSpec.name)).collect(CodeBlock.joining("")))
                .build();
    }

    public static List<MethodSpec> methodSpecListForGet(
            final List<FieldSpec> fieldSpecList,
            final BiFunction<FieldSpec, Integer, String> javadoc)
    {
        requireNonNull(fieldSpecList, "fieldSpecList");

        return range(0, fieldSpecList.size())
                .mapToObj(fieldSpecIndex -> MethodSpec
                        .methodBuilder(fieldSpecList.get(fieldSpecIndex).name)
                        .addJavadoc(concat(
                                of(CodeBlock.of(format("Returns %s.", javadoc.apply(fieldSpecList.get(fieldSpecIndex), fieldSpecIndex)))),
                                of(returnJavadoc(CodeBlock.of(format("return %s", javadoc.apply(fieldSpecList.get(fieldSpecIndex), fieldSpecIndex))))))
                                        .collect(CodeBlock.joining(lineSeparator())))
                        .addModifiers(PUBLIC)
                        .returns(fieldSpecList.get(fieldSpecIndex).type)
                        .addCode(CodeBlock.of("return $N;", fieldSpecList.get(fieldSpecIndex).name))
                        .build())
                .collect(toList());
    }

    public static MethodSpec.Builder methodSpecForFactory(
            final ClassName className,
            final List<TypeVariableName> typeVariableNameList,
            final Optional<String> name,
            final List<FieldSpec> fieldSpecList)
    {
        requireNonNull(className, "parameterizedTypeName");
        requireNonNull(typeVariableNameList, "typeVariableNameList");
        requireNonNull(name, "name");
        requireNonNull(fieldSpecList, "fieldSpecList");

        return MethodSpec
                .methodBuilder(name.orElse(className.simpleName()))
                .addModifiers(PUBLIC, STATIC)
                .addTypeVariables(typeVariableNameList)
                .returns(ParameterizedTypeName.get(className, typeVariableNameList.toArray(TypeVariableName[]::new)))
                .addParameters(fieldSpecList.stream().map(fieldSpec -> ParameterSpec.builder(fieldSpec.type, fieldSpec.name, FINAL).build()).collect(toList()))
                .addCode(CodeBlock.of("return new $N<>($L);", "Default", fieldSpecList.stream().map(fieldSpec -> CodeBlock.of(fieldSpec.name)).collect(CodeBlock.joining(","))));
    }

    public static MethodSpec methodSpecForInterface(
            final MethodSpec methodSpec)
    {
        requireNonNull(methodSpec, "methodSpec");

        if (methodSpec.modifiers.contains(STATIC))
            throw new RuntimeException();

        final var modifierSet = new HashSet<>(methodSpec.modifiers);
        modifierSet.remove(FINAL);
        modifierSet.add(ABSTRACT);

        return MethodSpec.methodBuilder(methodSpec.name)
                .addJavadoc(methodSpec.javadoc)
                .addModifiers(modifierSet)
                .addTypeVariables(methodSpec.typeVariables)
                .returns(methodSpec.returnType)
                .addParameters(methodSpec.parameters)
                .addExceptions(methodSpec.exceptions)
                .build();
    }
}
