package io.github.drewctaylor.effect;

import io.github.drewctaylor.function.F1;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 25-parameter effect.
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
 * @param <P14> the type of parameter 14
 * @param <P15> the type of parameter 15
 * @param <P16> the type of parameter 16
 * @param <P17> the type of parameter 17
 * @param <P18> the type of parameter 18
 * @param <P19> the type of parameter 19
 * @param <P20> the type of parameter 20
 * @param <P21> the type of parameter 21
 * @param <P22> the type of parameter 22
 * @param <P23> the type of parameter 23
 * @param <P24> the type of parameter 24
 * @param <P25> the type of parameter 25
 */
@FunctionalInterface
public interface E25<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25>
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
     * @param p14 the value of parameter 14
     * @param p15 the value of parameter 15
     * @param p16 the value of parameter 16
     * @param p17 the value of parameter 17
     * @param p18 the value of parameter 18
     * @param p19 the value of parameter 19
     * @param p20 the value of parameter 20
     * @param p21 the value of parameter 21
     * @param p22 the value of parameter 22
     * @param p23 the value of parameter 23
     * @param p24 the value of parameter 24
     * @param p25 the value of parameter 25
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
            final P13 p13,
            final P14 p14,
            final P15 p15,
            final P16 p16,
            final P17 p17,
            final P18 p18,
            final P19 p19,
            final P20 p20,
            final P21 p21,
            final P22 p22,
            final P23 p23,
            final P24 p24,
            final P25 p25);

    /**
     * Returns a form of the given effect that is of this effect type.
     * 
     * @param  e25                  the given effect
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
     * @param  <P14>                the type of parameter 14
     * @param  <P15>                the type of parameter 15
     * @param  <P16>                the type of parameter 16
     * @param  <P17>                the type of parameter 17
     * @param  <P18>                the type of parameter 18
     * @param  <P19>                the type of parameter 19
     * @param  <P20>                the type of parameter 20
     * @param  <P21>                the type of parameter 21
     * @param  <P22>                the type of parameter 22
     * @param  <P23>                the type of parameter 23
     * @param  <P24>                the type of parameter 24
     * @param  <P25>                the type of parameter 25
     * 
     * @return                      a form of the given effect that is of this effect type
     * 
     * @throws NullPointerException if e25 is null
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> E25<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> e25(
            final E25<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> e25)
    {
        requireNonNull(e25, "e25");
        return e25;
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
     * @param  <P14> the type of parameter 14
     * @param  <P15> the type of parameter 15
     * @param  <P16> the type of parameter 16
     * @param  <P17> the type of parameter 17
     * @param  <P18> the type of parameter 18
     * @param  <P19> the type of parameter 19
     * @param  <P20> the type of parameter 20
     * @param  <P21> the type of parameter 21
     * @param  <P22> the type of parameter 22
     * @param  <P23> the type of parameter 23
     * @param  <P24> the type of parameter 24
     * @param  <P25> the type of parameter 25
     * 
     * @return       an effect that does nothing
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> E25<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> nop()
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
                p13,
                p14,
                p15,
                p16,
                p17,
                p18,
                p19,
                p20,
                p21,
                p22,
                p23,
                p24,
                p25) ->
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
    default E24<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> a(
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
                p13,
                p14,
                p15,
                p16,
                p17,
                p18,
                p19,
                p20,
                p21,
                p22,
                p23,
                p24,
                p25) -> f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25);
    }

    /**
     * Returns a form of this effect where the order of the parameters is reversed.
     * 
     * @return a form of this effect where the order of the parameters is reversed
     */
    default E25<P25, P24, P23, P22, P21, P20, P19, P18, P17, P16, P15, P14, P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1> reverse()
    {
        return (
                p25,
                p24,
                p23,
                p22,
                p21,
                p20,
                p19,
                p18,
                p17,
                p16,
                p15,
                p14,
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
                p1) -> f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25);
    }

    /**
     * Returns a curried form of this effect.
     * 
     * @return a curried form of this effect
     */
    default F1<P1, F1<P2, F1<P3, F1<P4, F1<P5, F1<P6, F1<P7, F1<P8, F1<P9, F1<P10, F1<P11, F1<P12, F1<P13, F1<P14, F1<P15, F1<P16, F1<P17, F1<P18, F1<P19, F1<P20, F1<P21, F1<P22, F1<P23, F1<P24, E1<P25>>>>>>>>>>>>>>>>>>>>>>>>> curry()
    {
        return p1 -> p2 -> p3 -> p4 -> p5 -> p6 -> p7 -> p8 -> p9 -> p10 -> p11 -> p12 -> p13 -> p14 -> p15 -> p16 -> p17 -> p18 -> p19 -> p20 -> p21 -> p22 -> p23 -> p24 -> p25 -> f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25);
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
     * @param  <P14>                the type of parameter 14
     * @param  <P15>                the type of parameter 15
     * @param  <P16>                the type of parameter 16
     * @param  <P17>                the type of parameter 17
     * @param  <P18>                the type of parameter 18
     * @param  <P19>                the type of parameter 19
     * @param  <P20>                the type of parameter 20
     * @param  <P21>                the type of parameter 21
     * @param  <P22>                the type of parameter 22
     * @param  <P23>                the type of parameter 23
     * @param  <P24>                the type of parameter 24
     * @param  <P25>                the type of parameter 25
     * 
     * @return                      an uncurried form of the given effect
     * 
     * @throws NullPointerException if f1 is null
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> E25<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, P24, P25> uncurry(
            final F1<P1, F1<P2, F1<P3, F1<P4, F1<P5, F1<P6, F1<P7, F1<P8, F1<P9, F1<P10, F1<P11, F1<P12, F1<P13, F1<P14, F1<P15, F1<P16, F1<P17, F1<P18, F1<P19, F1<P20, F1<P21, F1<P22, F1<P23, F1<P24, E1<P25>>>>>>>>>>>>>>>>>>>>>>>>> f1)
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
                p13,
                p14,
                p15,
                p16,
                p17,
                p18,
                p19,
                p20,
                p21,
                p22,
                p23,
                p24,
                p25) -> f1.f(p1).f(p2).f(p3).f(p4).f(p5).f(p6).f(p7).f(p8).f(p9).f(p10).f(p11).f(p12).f(p13).f(p14).f(p15).f(p16).f(p17).f(p18).f(p19).f(p20).f(p21).f(p22).f(p23).f(p24).f(p25);
    }
}
