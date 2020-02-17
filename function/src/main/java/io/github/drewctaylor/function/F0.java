package io.github.drewctaylor.function;

import java.util.function.Supplier;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 0-parameter function.
 * 
 * @param <R1> the type of the output value
 */
@FunctionalInterface
public interface F0<R1> extends Supplier<R1>
{
    /**
     * Returns the output value of this function.
     * 
     * @return the output value of this function
     */
    R1 f();

    /**
     * Returns a form of the given function that is of this function type.
     * 
     * @param  f0                   the given function
     * @param  <R1>                 the type of the output value
     * @return                      a form of the given function that is of this function type
     * @throws NullPointerException if f0 is null
     */
    static <R1> F0<R1> f0(
            final F0<R1> f0)
    {
        requireNonNull(f0, "f0");
        return f0;
    }

    /**
     * Returns a function that is the given function composed with this function.
     * 
     * @param  f1                   the given function
     * @param  <R2>                 the type of the output value
     * @return                      a function that is the given function composed with this function
     * @throws NullPointerException if f1 is null
     */
    default <R2> F0<R2> then(
            final F1<R1, R2> f1)
    {
        requireNonNull(f1, "f1");
        return () -> f1.f(f());
    }

    /**
     * Returns a function that returns the given value as its output value.
     * 
     * @param  r1   the given value
     * @param  <R1> the type of the output value
     * @return      a function that returns the given value as its output value
     */
    static <R1> F0<R1> c(
            final R1 r1)
    {
        return () -> r1;
    }

    @Override
    default R1 get()
    {
        return f();
    }
}
