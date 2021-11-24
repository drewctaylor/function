package io.github.drewctaylor.effect.javapoet;

import com.squareup.javapoet.JavaFile;
import io.github.drewctaylor.javapoet.JavaPoetUtility;

import static io.github.drewctaylor.require.RequireNumberInteger.requireInteger;
import static io.github.drewctaylor.require.RequireNumberInteger.requireZeroOrPositive;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

/**
 * Returns java files that implement effects - from E0 to En, where n is the parameter count.
 */
public final class EffectFactory
{
    private EffectFactory()
    {
    }

    /**
     * Returns java files that implement effects - from E0 to En, where n is the parameter count.
     *
     * @param  parameterCountString     the parameter count
     * 
     * @return                          java files that implement effects - from E0 to En, where n is the parameter count
     * 
     * @throws NullPointerException     if parameterCountString is null
     * @throws IllegalArgumentException if parameterCountString is empty
     * @throws IllegalArgumentException if parameterCountString is not an int
     * @throws IllegalArgumentException if parameterCountString is not zero or positive
     */
    public static Iterable<JavaFile> iterable(
            final String parameterCountString)
    {
        int parameterCountInteger = requireInteger(parameterCountString, "parameterCountString");
        int parameterCount = requireZeroOrPositive(parameterCountInteger, "parameterCountInteger");

        return range(0, parameterCount + 1)
                .mapToObj(parameterCountInner -> JavaPoetUtility.file(parameterCountInner, false, true))
                .collect(toList());
    }
}