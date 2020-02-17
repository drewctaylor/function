package io.github.drewctaylor.function.javapoet;

import com.squareup.javapoet.JavaFile;

/**
 * Returns java files that implement effects that may throw an exception - from E0 to En, where n is the parameter
 * count.
 */
public final class EffectThrowsExceptionFactory
{
    private EffectThrowsExceptionFactory()
    {
    }

    /**
     * Returns java files that implement effects that may throw an exception - from E0 to En, where n is the parameter
     * count.
     *
     * @param  parameterCountString     the parameter count
     * @return                          java files that implement effects that may throw an exception - from E0 to En, where
     *                                  n is the parameter count
     * @throws NullPointerException     if parameterCountString is null
     * @throws IllegalArgumentException if parameterCountString is empty
     * @throws IllegalArgumentException if parameterCountString is not an int
     * @throws IllegalArgumentException if parameterCountString is not zero or positive
     */
    public static Iterable<JavaFile> iterable(
            final String parameterCountString)
    {
        return JavaPoetUtility.file(parameterCountString, true, true);
    }
}