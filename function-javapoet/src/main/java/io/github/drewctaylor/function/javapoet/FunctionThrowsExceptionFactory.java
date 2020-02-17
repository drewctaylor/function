package io.github.drewctaylor.function.javapoet;

import com.squareup.javapoet.JavaFile;

/**
 * Returns java files that implement functions that throw exceptions - F0E through FnE, where n is the parameter count.
 */
public final class FunctionThrowsExceptionFactory
{
    private FunctionThrowsExceptionFactory()
    {
    }

    /**
     * Returns java files that implement functions that may throw exceptions - F0 through Fn, where n is the parameter
     * count.
     *
     * @param  parameterCountString     the parameter count
     * @return                          java files that implement functions that may throw exceptions - F0 through Fn, where
     *                                  n is the parameter count
     * @throws NullPointerException     if parameterCountString is null
     * @throws IllegalArgumentException if parameterCountString is empty
     * @throws IllegalArgumentException if parameterCountString is not an int
     * @throws IllegalArgumentException if parameterCountString is not zero or positive
     */
    public static Iterable<JavaFile> iterable(
            final String parameterCountString)
    {
        return JavaPoetUtility.file(parameterCountString, true, false);
    }
}