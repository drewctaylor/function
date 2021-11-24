package io.github.drewctaylor.effect.javapoet;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;

import java.util.List;

import static io.github.drewctaylor.require.RequireNumberInteger.requireZeroOrPositive;
import static java.lang.String.format;
import static java.util.Objects.requireNonNull;

/**
 * A descriptor for an effect.
 */
public final class EffectDescriptor
{
    private static final String PACKAGE_NAME = "io.github.drewctaylor.effect";

    private final int parameterCount;
    private final String simpleName;
    private final ClassName className;

    /**
     * Construct a descriptor for an effect.
     *
     * @param parameterCount the parameter count
     */
    public EffectDescriptor(
            final int parameterCount)
    {
        requireZeroOrPositive(parameterCount, "parameterCount");

        this.parameterCount = parameterCount;
        this.simpleName = format("E%s", parameterCount);
        this.className = ClassName.get(PACKAGE_NAME, simpleName);
    }

    public ClassName getClassName()
    {
        return className;
    }

    public static ParameterizedTypeName parameterizedTypeName(
            final List<TypeName> typeNameListForParameter)
    {
        requireNonNull(typeNameListForParameter);

        return ParameterizedTypeName.get(new EffectDescriptor(typeNameListForParameter.size()).getClassName(), typeNameListForParameter.toArray(TypeName[]::new));
    }
}
