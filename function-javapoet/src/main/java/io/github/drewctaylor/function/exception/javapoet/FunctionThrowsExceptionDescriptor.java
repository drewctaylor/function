package io.github.drewctaylor.function.exception.javapoet;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;

import java.util.List;

import static io.github.drewctaylor.require.RequireNumberInteger.requireZeroOrPositive;
import static java.lang.String.format;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.of;

/**
 * A descriptor for a function that may throw an exception.
 */
public final class FunctionThrowsExceptionDescriptor
{
    private static final String PACKAGE_NAME = "io.github.drewctaylor.function.exception";

    private final int parameterCount;
    private final String simpleName;
    private final ClassName className;

    /**
     * Construct a descriptor for a function that may produce an exception.
     *
     * @param parameterCount the parameter count
     */

    public FunctionThrowsExceptionDescriptor(
            final int parameterCount)
    {
        requireZeroOrPositive(parameterCount, "parameterCount");

        this.parameterCount = parameterCount;
        this.simpleName = format("F%sE", parameterCount);
        this.className = ClassName.get(PACKAGE_NAME, simpleName);
    }

    public ClassName getClassName()
    {
        return className;
    }

    public static ParameterizedTypeName parameterizedTypeNameFor(
            final List<TypeName> typeNameListForParameter,
            final TypeName typeNameReturn,
            final TypeName typeNameForException)
    {
        requireNonNull(typeNameListForParameter);
        requireNonNull(typeNameReturn);
        requireNonNull(typeNameForException);

        return ParameterizedTypeName.get(new FunctionThrowsExceptionDescriptor(typeNameListForParameter.size()).getClassName(), concat(typeNameListForParameter.stream(), of(typeNameReturn, typeNameForException)).toArray(TypeName[]::new));
    }
}
