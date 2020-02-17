package io.github.drewctaylor.function.exception;

import io.github.drewctaylor.function.F1;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 1-parameter function that may throw an exception.
 * 
 * @param <P1> the type of parameter 1
 * @param <R1> the type of the output value
 * @param <E>  the type of the exception
 */
@FunctionalInterface
public interface F1E<P1, R1, E extends Exception>
{
    /**
     * Returns the output value of this function.
     * 
     * @param  p1 the value of parameter 1
     * @return    the output value of this function
     * @throws E  the exception
     */
    R1 f(
            final P1 p1)
            throws E;

    /**
     * Returns a form of the given function that is of this function type.
     * 
     * @param  f1e                  the given function
     * @param  <P1>                 the type of parameter 1
     * @param  <R1>                 the type of the output value
     * @param  <E>                  the type of the exception
     * @return                      a form of the given function that is of this function type
     * @throws NullPointerException if f1e is null
     */
    static <P1, R1, E extends Exception> F1E<P1, R1, E> f1e(
            final F1E<P1, R1, E> f1e)
    {
        requireNonNull(f1e, "f1e");
        return f1e;
    }

    /**
     * Returns a function that returns its first parameter value as its output value.
     * 
     * @param  <P1> the type of parameter 1
     * @param  <E>  the type of the exception
     * @return      a function that returns its first parameter value as its output value
     */
    static <P1, E extends Exception> F1E<P1, P1, E> c()
    {
        return (
                p1) -> p1;
    }

    /**
     * Returns a form of this function with the value of parameter 1 fixed to the given value.
     * 
     * @param  p1 the given value
     * @return    a form of this function with the value of parameter 1 fixed to the given value
     */
    default F0E<R1, E> a(
            final P1 p1)
    {
        return () -> f(p1);
    }

    /**
     * Returns a function that is the given function composed with this function.
     * 
     * @param  f1                   the given function
     * @param  <R2>                 the type of the output value
     * @return                      a function that is the given function composed with this function
     * @throws NullPointerException if f1 is null
     */
    default <R2> F1E<P1, R2, E> then(
            final F1<R1, R2> f1)
    {
        requireNonNull(f1, "f1");
        return (
                p1) -> f1.f(f(p1));
    }

    /**
     * Returns a function that returns the given value as its output value.
     * 
     * @param  r1   the given value
     * @param  <P1> the type of parameter 1
     * @param  <R1> the type of the output value
     * @param  <E>  the type of the exception
     * @return      a function that returns the given value as its output value
     */
    static <P1, R1, E extends Exception> F1E<P1, R1, E> c(
            final R1 r1)
    {
        return (
                p1) -> r1;
    }

    /**
     * Returns a function that throws the given exception
     * 
     * @param  e                    the given exception
     * @param  <P1>                 the type of parameter 1
     * @param  <R1>                 the type of the output value
     * @param  <E>                  the type of the exception
     * @return                      a function that throws the given exception
     * @throws NullPointerException if e is null
     */
    static <P1, R1, E extends Exception> F1E<P1, R1, E> e(
            final E e)
    {
        requireNonNull(e, "e");
        return (
                p1) ->
        {
            throw e;
        };
    }
}
