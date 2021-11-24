package io.github.drewctaylor.effect;

import io.github.drewctaylor.function.F1;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 13-parameter effect.
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
 * @param <P12> the type of parameter 12
 * @param <P13> the type of parameter 13
 */
@FunctionalInterface
public interface E13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13>
{
    /**
     * Executes this effect.
     * 
     * @param p1  the value of parameter 1
     * @param p2  the value of parameter 2
     * @param p3  the value of parameter 3
     * @param p4  the value of parameter 4
     * @param p5  the value of parameter 5
     * @param p6  the value of parameter 6
     * @param p7  the value of parameter 7
     * @param p8  the value of parameter 8
     * @param p9  the value of parameter 9
     * @param p10 the value of parameter 10
     * @param p11 the value of parameter 11
     * @param p12 the value of parameter 12
     * @param p13 the value of parameter 13
     */
    void f(
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
            final P11 p11,
            final P12 p12,
            final P13 p13);

    /**
     * Returns a form of the given effect that is of this effect type.
     * 
     * @param  e13                  the given effect
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
     * @param  <P12>                the type of parameter 12
     * @param  <P13>                the type of parameter 13
     * 
     * @return                      a form of the given effect that is of this effect type
     * 
     * @throws NullPointerException if e13 is null
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> E13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> e13(
            final E13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> e13)
    {
        requireNonNull(e13, "e13");
        return e13;
    }

    /**
     * Returns an effect that does nothing.
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
     * @param  <P12> the type of parameter 12
     * @param  <P13> the type of parameter 13
     * 
     * @return       an effect that does nothing
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> E13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> nop()
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
                p11,
                p12,
                p13) ->
        {
        };
    }

    /**
     * Returns a form of this effect with the value of parameter 1 fixed to the given value.
     * 
     * @param  p1 the given value
     * 
     * @return    a form of this effect with the value of parameter 1 fixed to the given value
     */
    default E12<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> a(
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
                p11,
                p12,
                p13) -> f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
    }

    /**
     * Returns a form of this effect where the order of the parameters is reversed.
     * 
     * @return a form of this effect where the order of the parameters is reversed
     */
    default E13<P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1> reverse()
    {
        return (
                p13,
                p12,
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
                p1) -> f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
    }

    /**
     * Returns a curried form of this effect.
     * 
     * @return a curried form of this effect
     */
    default F1<P1, F1<P2, F1<P3, F1<P4, F1<P5, F1<P6, F1<P7, F1<P8, F1<P9, F1<P10, F1<P11, F1<P12, E1<P13>>>>>>>>>>>>> curry()
    {
        return p1 -> p2 -> p3 -> p4 -> p5 -> p6 -> p7 -> p8 -> p9 -> p10 -> p11 -> p12 -> p13 -> f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
    }

    /**
     * Returns an uncurried form of the given effect.
     * 
     * @param  f1                   the given effect
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
     * @param  <P12>                the type of parameter 12
     * @param  <P13>                the type of parameter 13
     * 
     * @return                      an uncurried form of the given effect
     * 
     * @throws NullPointerException if f1 is null
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> E13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13> uncurry(
            final F1<P1, F1<P2, F1<P3, F1<P4, F1<P5, F1<P6, F1<P7, F1<P8, F1<P9, F1<P10, F1<P11, F1<P12, E1<P13>>>>>>>>>>>>> f1)
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
                p11,
                p12,
                p13) -> f1.f(p1).f(p2).f(p3).f(p4).f(p5).f(p6).f(p7).f(p8).f(p9).f(p10).f(p11).f(p12).f(p13);
    }
}
