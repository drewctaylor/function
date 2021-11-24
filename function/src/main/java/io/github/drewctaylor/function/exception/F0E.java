package io.github.drewctaylor.function.exception;

import io.github.drewctaylor.function.F1;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 0-parameter function that may throw an exception.
 * 
 * @param <R1> the type of the output value
 * @param <E>  the type of the exception
 */
@FunctionalInterface
public interface F0E<R1, E extends Exception>
{
    /**
     * Returns the output value of this function.
     * 
     * @return   the output value of this function
     * 
     * @throws E the exception
     */
    R1 f()
            throws E;

    /**
     * Returns a form of the given function that is of this function type.
     * 
     * @param  f0e                  the given function
     * @param  <R1>                 the type of the output value
     * @param  <E>                  the type of the exception
     * 
     * @return                      a form of the given function that is of this function type
     * 
     * @throws NullPointerException if f0e is null
     */
    static <R1, E extends Exception> F0E<R1, E> f0e(
            final F0E<R1, E> f0e)
    {
        requireNonNull(f0e, "f0e");
        return f0e;
    }

    /**
     * Returns a function that is the given function composed with this function.
     * 
     * @param  f1                   the given function
     * @param  <R2>                 the type of the output value
     * 
     * @return                      a function that is the given function composed with this function
     * 
     * @throws NullPointerException if f1 is null
     */
    default <R2> F0E<R2, E> then(
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
     * @param  <E>  the type of the exception
     * 
     * @return      a function that returns the given value as its output value
     */
    static <R1, E extends Exception> F0E<R1, E> c(
            final R1 r1)
    {
        return () -> r1;
    }

    /**
     * Returns a function that throws the given exception.
     * 
     * @param  e                    the given exception
     * @param  <R1>                 the type of the output value
     * @param  <E>                  the type of the exception
     * 
     * @return                      a function that throws the given exception
     * 
     * @throws NullPointerException if e is null
     */
    static <R1, E extends Exception> F0E<R1, E> e(
            final E e)
    {
        requireNonNull(e, "e");
        return () ->
        {
            throw e;
        };
    }
}
