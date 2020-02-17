package io.github.drewctaylor.function.exception;

import io.github.drewctaylor.function.F1;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 11-parameter function that may throw an exception.
 * 
 * @param <P1>  the type of parameter 1
 * @param <P2>  the type of parameter 2
 * @param <P3>  the type of parameter 3
 * @param <P4>  the type of parameter 4
 * @param <P5>  the type of parameter 5
 * @param <P6>  the type of parameter 6
 * @param <P7>  the type of parameter 7
 * @param <P8>  the type of parameter 8
 * @param <P9>  the type of parameter 9
 * @param <P10> the type of parameter 10
 * @param <P11> the type of parameter 11
 * @param <R1>  the type of the output value
 * @param <E>   the type of the exception
 */
@FunctionalInterface
public interface F11E<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, E extends Exception>
{
    /**
     * Returns the output value of this function.
     * 
     * @param  p1  the value of parameter 1
     * @param  p2  the value of parameter 2
     * @param  p3  the value of parameter 3
     * @param  p4  the value of parameter 4
     * @param  p5  the value of parameter 5
     * @param  p6  the value of parameter 6
     * @param  p7  the value of parameter 7
     * @param  p8  the value of parameter 8
     * @param  p9  the value of parameter 9
     * @param  p10 the value of parameter 10
     * @param  p11 the value of parameter 11
     * @return     the output value of this function
     * @throws E   the exception
     */
    R1 f(
            final P1 p1,
            final P2 p2,
            final P3 p3,
            final P4 p4,
            final P5 p5,
            final P6 p6,
            final P7 p7,
            final P8 p8,
            final P9 p9,
            final P10 p10,
            final P11 p11)
            throws E;

    /**
     * Returns a form of the given function that is of this function type.
     * 
     * @param  f11e                 the given function
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <P3>                 the type of parameter 3
     * @param  <P4>                 the type of parameter 4
     * @param  <P5>                 the type of parameter 5
     * @param  <P6>                 the type of parameter 6
     * @param  <P7>                 the type of parameter 7
     * @param  <P8>                 the type of parameter 8
     * @param  <P9>                 the type of parameter 9
     * @param  <P10>                the type of parameter 10
     * @param  <P11>                the type of parameter 11
     * @param  <R1>                 the type of the output value
     * @param  <E>                  the type of the exception
     * @return                      a form of the given function that is of this function type
     * @throws NullPointerException if f11e is null
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, E extends Exception> F11E<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, E> f11e(
            final F11E<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, E> f11e)
    {
        requireNonNull(f11e, "f11e");
        return f11e;
    }

    /**
     * Returns a function that returns its first parameter value as its output value.
     * 
     * @param  <P1>  the type of parameter 1
     * @param  <P2>  the type of parameter 2
     * @param  <P3>  the type of parameter 3
     * @param  <P4>  the type of parameter 4
     * @param  <P5>  the type of parameter 5
     * @param  <P6>  the type of parameter 6
     * @param  <P7>  the type of parameter 7
     * @param  <P8>  the type of parameter 8
     * @param  <P9>  the type of parameter 9
     * @param  <P10> the type of parameter 10
     * @param  <P11> the type of parameter 11
     * @param  <E>   the type of the exception
     * @return       a function that returns its first parameter value as its output value
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, E extends Exception> F11E<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P1, E> c()
    {
        return (
                p1,
                p2,
                p3,
                p4,
                p5,
                p6,
                p7,
                p8,
                p9,
                p10,
                p11) -> p1;
    }

    /**
     * Returns a form of this function with the value of parameter 1 fixed to the given value.
     * 
     * @param  p1 the given value
     * @return    a form of this function with the value of parameter 1 fixed to the given value
     */
    default F10E<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, E> a(
            final P1 p1)
    {
        return (
                p2,
                p3,
                p4,
                p5,
                p6,
                p7,
                p8,
                p9,
                p10,
                p11) -> f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    /**
     * Returns a form of this function where the order of the parameters is reversed.
     * 
     * @return a form of this function where the order of the parameters is reversed
     */
    default F11E<P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1, R1, E> reverse()
    {
        return (
                p11,
                p10,
                p9,
                p8,
                p7,
                p6,
                p5,
                p4,
                p3,
                p2,
                p1) -> f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    /**
     * Returns a curried form of this function.
     * 
     * @return a curried form of this function
     */
    default F1<P1, F1<P2, F1<P3, F1<P4, F1<P5, F1<P6, F1<P7, F1<P8, F1<P9, F1<P10, F1E<P11, R1, E>>>>>>>>>>> curry()
    {
        return p1 -> p2 -> p3 -> p4 -> p5 -> p6 -> p7 -> p8 -> p9 -> p10 -> p11 -> f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    /**
     * Returns an uncurried form of the given function.
     * 
     * @param  f1                   the given function
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <P3>                 the type of parameter 3
     * @param  <P4>                 the type of parameter 4
     * @param  <P5>                 the type of parameter 5
     * @param  <P6>                 the type of parameter 6
     * @param  <P7>                 the type of parameter 7
     * @param  <P8>                 the type of parameter 8
     * @param  <P9>                 the type of parameter 9
     * @param  <P10>                the type of parameter 10
     * @param  <P11>                the type of parameter 11
     * @param  <R1>                 the type of the output value
     * @param  <E>                  the type of the exception
     * @return                      an uncurried form of the given function
     * @throws NullPointerException if f1 is null
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, E extends Exception> F11E<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, E> uncurry(
            final F1<P1, F1<P2, F1<P3, F1<P4, F1<P5, F1<P6, F1<P7, F1<P8, F1<P9, F1<P10, F1E<P11, R1, E>>>>>>>>>>> f1)
    {
        requireNonNull(f1, "f1");
        return (
                p1,
                p2,
                p3,
                p4,
                p5,
                p6,
                p7,
                p8,
                p9,
                p10,
                p11) -> f1.f(p1).f(p2).f(p3).f(p4).f(p5).f(p6).f(p7).f(p8).f(p9).f(p10).f(p11);
    }

    /**
     * Returns a function that is the given function composed with this function.
     * 
     * @param  f1                   the given function
     * @param  <R2>                 the type of the output value
     * @return                      a function that is the given function composed with this function
     * @throws NullPointerException if f1 is null
     */
    default <R2> F11E<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R2, E> then(
            final F1<R1, R2> f1)
    {
        requireNonNull(f1, "f1");
        return (
                p1,
                p2,
                p3,
                p4,
                p5,
                p6,
                p7,
                p8,
                p9,
                p10,
                p11) -> f1.f(f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));
    }

    /**
     * Returns a function that returns the given value as its output value.
     * 
     * @param  r1    the given value
     * @param  <P1>  the type of parameter 1
     * @param  <P2>  the type of parameter 2
     * @param  <P3>  the type of parameter 3
     * @param  <P4>  the type of parameter 4
     * @param  <P5>  the type of parameter 5
     * @param  <P6>  the type of parameter 6
     * @param  <P7>  the type of parameter 7
     * @param  <P8>  the type of parameter 8
     * @param  <P9>  the type of parameter 9
     * @param  <P10> the type of parameter 10
     * @param  <P11> the type of parameter 11
     * @param  <R1>  the type of the output value
     * @param  <E>   the type of the exception
     * @return       a function that returns the given value as its output value
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, E extends Exception> F11E<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, E> c(
            final R1 r1)
    {
        return (
                p1,
                p2,
                p3,
                p4,
                p5,
                p6,
                p7,
                p8,
                p9,
                p10,
                p11) -> r1;
    }

    /**
     * Returns a function that throws the given exception
     * 
     * @param  e                    the given exception
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <P3>                 the type of parameter 3
     * @param  <P4>                 the type of parameter 4
     * @param  <P5>                 the type of parameter 5
     * @param  <P6>                 the type of parameter 6
     * @param  <P7>                 the type of parameter 7
     * @param  <P8>                 the type of parameter 8
     * @param  <P9>                 the type of parameter 9
     * @param  <P10>                the type of parameter 10
     * @param  <P11>                the type of parameter 11
     * @param  <R1>                 the type of the output value
     * @param  <E>                  the type of the exception
     * @return                      a function that throws the given exception
     * @throws NullPointerException if e is null
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, E extends Exception> F11E<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R1, E> e(
            final E e)
    {
        requireNonNull(e, "e");
        return (
                p1,
                p2,
                p3,
                p4,
                p5,
                p6,
                p7,
                p8,
                p9,
                p10,
                p11) ->
        {
            throw e;
        };
    }
}
