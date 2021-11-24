package io.github.drewctaylor.function;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 16-parameter function.
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
 * @param <R1>  the type of the output value
 */
@FunctionalInterface
public interface F16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R1>
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
     * @param  p12 the value of parameter 12
     * @param  p13 the value of parameter 13
     * @param  p14 the value of parameter 14
     * @param  p15 the value of parameter 15
     * @param  p16 the value of parameter 16
     * 
     * @return     the output value of this function
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
            final P11 p11,
            final P12 p12,
            final P13 p13,
            final P14 p14,
            final P15 p15,
            final P16 p16);

    /**
     * Returns a form of the given function that is of this function type.
     * 
     * @param  f16                  the given function
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
     * @param  <R1>                 the type of the output value
     * 
     * @return                      a form of the given function that is of this function type
     * 
     * @throws NullPointerException if f16 is null
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R1> F16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R1> f16(
            final F16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R1> f16)
    {
        requireNonNull(f16, "f16");
        return f16;
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
     * @param  <P12> the type of parameter 12
     * @param  <P13> the type of parameter 13
     * @param  <P14> the type of parameter 14
     * @param  <P15> the type of parameter 15
     * @param  <P16> the type of parameter 16
     * 
     * @return       a function that returns its first parameter value as its output value
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16> F16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P1> c()
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
                p16) -> p1;
    }

    /**
     * Returns a form of this function with the value of parameter 1 fixed to the given value.
     * 
     * @param  p1 the given value
     * 
     * @return    a form of this function with the value of parameter 1 fixed to the given value
     */
    default F15<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R1> a(
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
                p16) -> f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16);
    }

    /**
     * Returns a form of this function where the order of the parameters is reversed.
     * 
     * @return a form of this function where the order of the parameters is reversed
     */
    default F16<P16, P15, P14, P13, P12, P11, P10, P9, P8, P7, P6, P5, P4, P3, P2, P1, R1> reverse()
    {
        return (
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
                p1) -> f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16);
    }

    /**
     * Returns a curried form of this function.
     * 
     * @return a curried form of this function
     */
    default F1<P1, F1<P2, F1<P3, F1<P4, F1<P5, F1<P6, F1<P7, F1<P8, F1<P9, F1<P10, F1<P11, F1<P12, F1<P13, F1<P14, F1<P15, F1<P16, R1>>>>>>>>>>>>>>>> curry()
    {
        return p1 -> p2 -> p3 -> p4 -> p5 -> p6 -> p7 -> p8 -> p9 -> p10 -> p11 -> p12 -> p13 -> p14 -> p15 -> p16 -> f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16);
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
     * @param  <P12>                the type of parameter 12
     * @param  <P13>                the type of parameter 13
     * @param  <P14>                the type of parameter 14
     * @param  <P15>                the type of parameter 15
     * @param  <P16>                the type of parameter 16
     * @param  <R1>                 the type of the output value
     * 
     * @return                      an uncurried form of the given function
     * 
     * @throws NullPointerException if f1 is null
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R1> F16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R1> uncurry(
            final F1<P1, F1<P2, F1<P3, F1<P4, F1<P5, F1<P6, F1<P7, F1<P8, F1<P9, F1<P10, F1<P11, F1<P12, F1<P13, F1<P14, F1<P15, F1<P16, R1>>>>>>>>>>>>>>>> f1)
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
                p16) -> f1.f(p1).f(p2).f(p3).f(p4).f(p5).f(p6).f(p7).f(p8).f(p9).f(p10).f(p11).f(p12).f(p13).f(p14).f(p15).f(p16);
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
    default <R2> F16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R2> then(
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
                p11,
                p12,
                p13,
                p14,
                p15,
                p16) -> f1.f(f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16));
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
     * @param  <P12> the type of parameter 12
     * @param  <P13> the type of parameter 13
     * @param  <P14> the type of parameter 14
     * @param  <P15> the type of parameter 15
     * @param  <P16> the type of parameter 16
     * @param  <R1>  the type of the output value
     * 
     * @return       a function that returns the given value as its output value
     */
    static <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R1> F16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R1> c(
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
                p11,
                p12,
                p13,
                p14,
                p15,
                p16) -> r1;
    }
}
