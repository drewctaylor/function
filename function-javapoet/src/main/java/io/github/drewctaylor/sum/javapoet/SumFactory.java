package io.github.drewctaylor.sum.javapoet;

import com.squareup.javapoet.JavaFile;

import static io.github.drewctaylor.require.RequireNumberInteger.requireInteger;
import static io.github.drewctaylor.require.RequireNumberInteger.requirePositive;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

/**
 * Returns java files that implement sums - from S2 to Sn, where n is the parameter count.
 */
public final class SumFactory
{

    private SumFactory()
    {
    }

    /**
     * Returns java files that implement sums - from S2 to Sn, where n is the parameter count.
     *
     * @param  parameterCountString     the parameter count
     * 
     * @return                          java files that implement sums - from S2 to Sn, where n is the parameter count
     * 
     * @throws NullPointerException     if parameterCountString is null
     * @throws IllegalArgumentException if parameterCountString is empty
     * @throws IllegalArgumentException if parameterCountString is not an int
     * @throws IllegalArgumentException if parameterCountString is less than 2
     */
    public static Iterable<JavaFile> iterable(
            final String parameterCountString)
    {
        int parameterCountInteger = requireInteger(parameterCountString, "parameterCountString");
        int parameterCount = requirePositive(parameterCountInteger - 1, "parameterCountInteger");

        return range(2, parameterCount + 1)
                .mapToObj(SumDescriptor::new)
                .map(SumDescriptor::javaFile)
                .collect(toList());
    }
}
