package io.github.drewctaylor.function.exception;

import io.github.drewctaylor.function.F1;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 3-parameter function that may throw an exception.
 * 
 * @param <P1> the type of parameter 1
 * @param <P2> the type of parameter 2
 * @param <P3> the type of parameter 3
 * @param <R1> the type of the output value
 * @param <E>  the type of the exception
 */
@FunctionalInterface
public interface F3E<P1, P2, P3, R1, E extends Exception>
{
    /**
     * Returns the output value of this function.
     * 
     * @param  p1 the value of parameter 1
     * @param  p2 the value of parameter 2
     * @param  p3 the value of parameter 3
     * @return    the output value of this function
     * @throws E  the exception
     */
    R1 f(
            final P1 p1,
            final P2 p2,
            final P3 p3)
            throws E;

    /**
     * Returns a form of the given function that is of this function type.
     * 
     * @param  f3e                  the given function
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <P3>                 the type of parameter 3
     * @param  <R1>                 the type of the output value
     * @param  <E>                  the type of the exception
     * @return                      a form of the given function that is of this function type
     * @throws NullPointerException if f3e is null
     */
    static <P1, P2, P3, R1, E extends Exception> F3E<P1, P2, P3, R1, E> f3e(
            final F3E<P1, P2, P3, R1, E> f3e)
    {
        requireNonNull(f3e, "f3e");
        return f3e;
    }

    /**
     * Returns a function that returns its first parameter value as its output value.
     * 
     * @param  <P1> the type of parameter 1
     * @param  <P2> the type of parameter 2
     * @param  <P3> the type of parameter 3
     * @param  <E>  the type of the exception
     * @return      a function that returns its first parameter value as its output value
     */
    static <P1, P2, P3, E extends Exception> F3E<P1, P2, P3, P1, E> c()
    {
        return (
                p1,
                p2,
                p3) -> p1;
    }

    /**
     * Returns a form of this function with the value of parameter 1 fixed to the given value.
     * 
     * @param  p1 the given value
     * @return    a form of this function with the value of parameter 1 fixed to the given value
     */
    default F2E<P2, P3, R1, E> a(
            final P1 p1)
    {
        return (
                p2,
                p3) -> f(p1, p2, p3);
    }

    /**
     * Returns a form of this function where the order of the parameters is reversed.
     * 
     * @return a form of this function where the order of the parameters is reversed
     */
    default F3E<P3, P2, P1, R1, E> reverse()
    {
        return (
                p3,
                p2,
                p1) -> f(p1, p2, p3);
    }

    /**
     * Returns a curried form of this function.
     * 
     * @return a curried form of this function
     */
    default F1<P1, F1<P2, F1E<P3, R1, E>>> curry()
    {
        return p1 -> p2 -> p3 -> f(p1, p2, p3);
    }

    /**
     * Returns an uncurried form of the given function.
     * 
     * @param  f1                   the given function
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <P3>                 the type of parameter 3
     * @param  <R1>                 the type of the output value
     * @param  <E>                  the type of the exception
     * @return                      an uncurried form of the given function
     * @throws NullPointerException if f1 is null
     */
    static <P1, P2, P3, R1, E extends Exception> F3E<P1, P2, P3, R1, E> uncurry(
            final F1<P1, F1<P2, F1E<P3, R1, E>>> f1)
    {
        requireNonNull(f1, "f1");
        return (
                p1,
                p2,
                p3) -> f1.f(p1).f(p2).f(p3);
    }

    /**
     * Returns a function that is the given function composed with this function.
     * 
     * @param  f1                   the given function
     * @param  <R2>                 the type of the output value
     * @return                      a function that is the given function composed with this function
     * @throws NullPointerException if f1 is null
     */
    default <R2> F3E<P1, P2, P3, R2, E> then(
            final F1<R1, R2> f1)
    {
        requireNonNull(f1, "f1");
        return (
                p1,
                p2,
                p3) -> f1.f(f(p1, p2, p3));
    }

    /**
     * Returns a function that returns the given value as its output value.
     * 
     * @param  r1   the given value
     * @param  <P1> the type of parameter 1
     * @param  <P2> the type of parameter 2
     * @param  <P3> the type of parameter 3
     * @param  <R1> the type of the output value
     * @param  <E>  the type of the exception
     * @return      a function that returns the given value as its output value
     */
    static <P1, P2, P3, R1, E extends Exception> F3E<P1, P2, P3, R1, E> c(
            final R1 r1)
    {
        return (
                p1,
                p2,
                p3) -> r1;
    }

    /**
     * Returns a function that throws the given exception
     * 
     * @param  e                    the given exception
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <P3>                 the type of parameter 3
     * @param  <R1>                 the type of the output value
     * @param  <E>                  the type of the exception
     * @return                      a function that throws the given exception
     * @throws NullPointerException if e is null
     */
    static <P1, P2, P3, R1, E extends Exception> F3E<P1, P2, P3, R1, E> e(
            final E e)
    {
        requireNonNull(e, "e");
        return (
                p1,
                p2,
                p3) ->
        {
            throw e;
        };
    }
}
