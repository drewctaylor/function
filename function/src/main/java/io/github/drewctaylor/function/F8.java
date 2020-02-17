package io.github.drewctaylor.function;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 8-parameter function.
 * 
 * @param <P1> the type of parameter 1
 * @param <P2> the type of parameter 2
 * @param <P3> the type of parameter 3
 * @param <P4> the type of parameter 4
 * @param <P5> the type of parameter 5
 * @param <P6> the type of parameter 6
 * @param <P7> the type of parameter 7
 * @param <P8> the type of parameter 8
 * @param <R1> the type of the output value
 */
@FunctionalInterface
public interface F8<P1, P2, P3, P4, P5, P6, P7, P8, R1>
{
    /**
     * Returns the output value of this function.
     * 
     * @param  p1 the value of parameter 1
     * @param  p2 the value of parameter 2
     * @param  p3 the value of parameter 3
     * @param  p4 the value of parameter 4
     * @param  p5 the value of parameter 5
     * @param  p6 the value of parameter 6
     * @param  p7 the value of parameter 7
     * @param  p8 the value of parameter 8
     * @return    the output value of this function
     */
    R1 f(
            final P1 p1,
            final P2 p2,
            final P3 p3,
            final P4 p4,
            final P5 p5,
            final P6 p6,
            final P7 p7,
            final P8 p8);

    /**
     * Returns a form of the given function that is of this function type.
     * 
     * @param  f8                   the given function
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <P3>                 the type of parameter 3
     * @param  <P4>                 the type of parameter 4
     * @param  <P5>                 the type of parameter 5
     * @param  <P6>                 the type of parameter 6
     * @param  <P7>                 the type of parameter 7
     * @param  <P8>                 the type of parameter 8
     * @param  <R1>                 the type of the output value
     * @return                      a form of the given function that is of this function type
     * @throws NullPointerException if f8 is null
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, R1> F8<P1, P2, P3, P4, P5, P6, P7, P8, R1> f8(
            final F8<P1, P2, P3, P4, P5, P6, P7, P8, R1> f8)
    {
        requireNonNull(f8, "f8");
        return f8;
    }

    /**
     * Returns a function that returns its first parameter value as its output value.
     * 
     * @param  <P1> the type of parameter 1
     * @param  <P2> the type of parameter 2
     * @param  <P3> the type of parameter 3
     * @param  <P4> the type of parameter 4
     * @param  <P5> the type of parameter 5
     * @param  <P6> the type of parameter 6
     * @param  <P7> the type of parameter 7
     * @param  <P8> the type of parameter 8
     * @return      a function that returns its first parameter value as its output value
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8> F8<P1, P2, P3, P4, P5, P6, P7, P8, P1> c()
    {
        return (
                p1,
                p2,
                p3,
                p4,
                p5,
                p6,
                p7,
                p8) -> p1;
    }

    /**
     * Returns a form of this function with the value of parameter 1 fixed to the given value.
     * 
     * @param  p1 the given value
     * @return    a form of this function with the value of parameter 1 fixed to the given value
     */
    default F7<P2, P3, P4, P5, P6, P7, P8, R1> a(
            final P1 p1)
    {
        return (
                p2,
                p3,
                p4,
                p5,
                p6,
                p7,
                p8) -> f(p1, p2, p3, p4, p5, p6, p7, p8);
    }

    /**
     * Returns a form of this function where the order of the parameters is reversed.
     * 
     * @return a form of this function where the order of the parameters is reversed
     */
    default F8<P8, P7, P6, P5, P4, P3, P2, P1, R1> reverse()
    {
        return (
                p8,
                p7,
                p6,
                p5,
                p4,
                p3,
                p2,
                p1) -> f(p1, p2, p3, p4, p5, p6, p7, p8);
    }

    /**
     * Returns a curried form of this function.
     * 
     * @return a curried form of this function
     */
    default F1<P1, F1<P2, F1<P3, F1<P4, F1<P5, F1<P6, F1<P7, F1<P8, R1>>>>>>>> curry()
    {
        return p1 -> p2 -> p3 -> p4 -> p5 -> p6 -> p7 -> p8 -> f(p1, p2, p3, p4, p5, p6, p7, p8);
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
     * @param  <R1>                 the type of the output value
     * @return                      an uncurried form of the given function
     * @throws NullPointerException if f1 is null
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, R1> F8<P1, P2, P3, P4, P5, P6, P7, P8, R1> uncurry(
            final F1<P1, F1<P2, F1<P3, F1<P4, F1<P5, F1<P6, F1<P7, F1<P8, R1>>>>>>>> f1)
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
                p8) -> f1.f(p1).f(p2).f(p3).f(p4).f(p5).f(p6).f(p7).f(p8);
    }

    /**
     * Returns a function that is the given function composed with this function.
     * 
     * @param  f1                   the given function
     * @param  <R2>                 the type of the output value
     * @return                      a function that is the given function composed with this function
     * @throws NullPointerException if f1 is null
     */
    default <R2> F8<P1, P2, P3, P4, P5, P6, P7, P8, R2> then(
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
                p8) -> f1.f(f(p1, p2, p3, p4, p5, p6, p7, p8));
    }

    /**
     * Returns a function that returns the given value as its output value.
     * 
     * @param  r1   the given value
     * @param  <P1> the type of parameter 1
     * @param  <P2> the type of parameter 2
     * @param  <P3> the type of parameter 3
     * @param  <P4> the type of parameter 4
     * @param  <P5> the type of parameter 5
     * @param  <P6> the type of parameter 6
     * @param  <P7> the type of parameter 7
     * @param  <P8> the type of parameter 8
     * @param  <R1> the type of the output value
     * @return      a function that returns the given value as its output value
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, R1> F8<P1, P2, P3, P4, P5, P6, P7, P8, R1> c(
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
                p8) -> r1;
    }
}
