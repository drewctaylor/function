package io.github.drewctaylor.sum;

import io.github.drewctaylor.effect.E1;
import io.github.drewctaylor.effect.exception.E1E;
import io.github.drewctaylor.function.F1;
import io.github.drewctaylor.function.exception.F1E;

/**
 * A 31-value sum.
 * 
 * @param <T1>  the type of value 1
 * @param <T2>  the type of value 2
 * @param <T3>  the type of value 3
 * @param <T4>  the type of value 4
 * @param <T5>  the type of value 5
 * @param <T6>  the type of value 6
 * @param <T7>  the type of value 7
 * @param <T8>  the type of value 8
 * @param <T9>  the type of value 9
 * @param <T10> the type of value 10
 * @param <T11> the type of value 11
 * @param <T12> the type of value 12
 * @param <T13> the type of value 13
 * @param <T14> the type of value 14
 * @param <T15> the type of value 15
 * @param <T16> the type of value 16
 * @param <T17> the type of value 17
 * @param <T18> the type of value 18
 * @param <T19> the type of value 19
 * @param <T20> the type of value 20
 * @param <T21> the type of value 21
 * @param <T22> the type of value 22
 * @param <T23> the type of value 23
 * @param <T24> the type of value 24
 * @param <T25> the type of value 25
 * @param <T26> the type of value 26
 * @param <T27> the type of value 27
 * @param <T28> the type of value 28
 * @param <T29> the type of value 29
 * @param <T30> the type of value 30
 * @param <T31> the type of value 31
 */
public interface S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
{
    /**
     * Return the output of the given function when given the value of this sum as input.
     * 
     * @param  fT1  the function to apply to value 1
     * @param  fT2  the function to apply to value 2
     * @param  fT3  the function to apply to value 3
     * @param  fT4  the function to apply to value 4
     * @param  fT5  the function to apply to value 5
     * @param  fT6  the function to apply to value 6
     * @param  fT7  the function to apply to value 7
     * @param  fT8  the function to apply to value 8
     * @param  fT9  the function to apply to value 9
     * @param  fT10 the function to apply to value 10
     * @param  fT11 the function to apply to value 11
     * @param  fT12 the function to apply to value 12
     * @param  fT13 the function to apply to value 13
     * @param  fT14 the function to apply to value 14
     * @param  fT15 the function to apply to value 15
     * @param  fT16 the function to apply to value 16
     * @param  fT17 the function to apply to value 17
     * @param  fT18 the function to apply to value 18
     * @param  fT19 the function to apply to value 19
     * @param  fT20 the function to apply to value 20
     * @param  fT21 the function to apply to value 21
     * @param  fT22 the function to apply to value 22
     * @param  fT23 the function to apply to value 23
     * @param  fT24 the function to apply to value 24
     * @param  fT25 the function to apply to value 25
     * @param  fT26 the function to apply to value 26
     * @param  fT27 the function to apply to value 27
     * @param  fT28 the function to apply to value 28
     * @param  fT29 the function to apply to value 29
     * @param  fT30 the function to apply to value 30
     * @param  fT31 the function to apply to value 31
     * @param  <R1> the type of the output value
     * 
     * @return      the output of the given function when given the value of this sum as input
     */
    <R1> R1 match(
            final F1<T1, R1> fT1,
            final F1<T2, R1> fT2,
            final F1<T3, R1> fT3,
            final F1<T4, R1> fT4,
            final F1<T5, R1> fT5,
            final F1<T6, R1> fT6,
            final F1<T7, R1> fT7,
            final F1<T8, R1> fT8,
            final F1<T9, R1> fT9,
            final F1<T10, R1> fT10,
            final F1<T11, R1> fT11,
            final F1<T12, R1> fT12,
            final F1<T13, R1> fT13,
            final F1<T14, R1> fT14,
            final F1<T15, R1> fT15,
            final F1<T16, R1> fT16,
            final F1<T17, R1> fT17,
            final F1<T18, R1> fT18,
            final F1<T19, R1> fT19,
            final F1<T20, R1> fT20,
            final F1<T21, R1> fT21,
            final F1<T22, R1> fT22,
            final F1<T23, R1> fT23,
            final F1<T24, R1> fT24,
            final F1<T25, R1> fT25,
            final F1<T26, R1> fT26,
            final F1<T27, R1> fT27,
            final F1<T28, R1> fT28,
            final F1<T29, R1> fT29,
            final F1<T30, R1> fT30,
            final F1<T31, R1> fT31);

    /**
     * Return the output of the given function when given the value of this sum as input.
     * 
     * @param  fT1  the function to apply to value 1
     * @param  fT2  the function to apply to value 2
     * @param  fT3  the function to apply to value 3
     * @param  fT4  the function to apply to value 4
     * @param  fT5  the function to apply to value 5
     * @param  fT6  the function to apply to value 6
     * @param  fT7  the function to apply to value 7
     * @param  fT8  the function to apply to value 8
     * @param  fT9  the function to apply to value 9
     * @param  fT10 the function to apply to value 10
     * @param  fT11 the function to apply to value 11
     * @param  fT12 the function to apply to value 12
     * @param  fT13 the function to apply to value 13
     * @param  fT14 the function to apply to value 14
     * @param  fT15 the function to apply to value 15
     * @param  fT16 the function to apply to value 16
     * @param  fT17 the function to apply to value 17
     * @param  fT18 the function to apply to value 18
     * @param  fT19 the function to apply to value 19
     * @param  fT20 the function to apply to value 20
     * @param  fT21 the function to apply to value 21
     * @param  fT22 the function to apply to value 22
     * @param  fT23 the function to apply to value 23
     * @param  fT24 the function to apply to value 24
     * @param  fT25 the function to apply to value 25
     * @param  fT26 the function to apply to value 26
     * @param  fT27 the function to apply to value 27
     * @param  fT28 the function to apply to value 28
     * @param  fT29 the function to apply to value 29
     * @param  fT30 the function to apply to value 30
     * @param  fT31 the function to apply to value 31
     * @param  <R1> the type of the output value
     * @param  <E>  the type of the exception
     * 
     * @return      the output of the given function when given the value of this sum as input
     * 
     * @throws E    if the given function throws an exception
     */
    <R1, E extends Exception> R1 matchException(
            final F1E<T1, R1, E> fT1,
            final F1E<T2, R1, E> fT2,
            final F1E<T3, R1, E> fT3,
            final F1E<T4, R1, E> fT4,
            final F1E<T5, R1, E> fT5,
            final F1E<T6, R1, E> fT6,
            final F1E<T7, R1, E> fT7,
            final F1E<T8, R1, E> fT8,
            final F1E<T9, R1, E> fT9,
            final F1E<T10, R1, E> fT10,
            final F1E<T11, R1, E> fT11,
            final F1E<T12, R1, E> fT12,
            final F1E<T13, R1, E> fT13,
            final F1E<T14, R1, E> fT14,
            final F1E<T15, R1, E> fT15,
            final F1E<T16, R1, E> fT16,
            final F1E<T17, R1, E> fT17,
            final F1E<T18, R1, E> fT18,
            final F1E<T19, R1, E> fT19,
            final F1E<T20, R1, E> fT20,
            final F1E<T21, R1, E> fT21,
            final F1E<T22, R1, E> fT22,
            final F1E<T23, R1, E> fT23,
            final F1E<T24, R1, E> fT24,
            final F1E<T25, R1, E> fT25,
            final F1E<T26, R1, E> fT26,
            final F1E<T27, R1, E> fT27,
            final F1E<T28, R1, E> fT28,
            final F1E<T29, R1, E> fT29,
            final F1E<T30, R1, E> fT30,
            final F1E<T31, R1, E> fT31)
            throws E;

    /**
     * Executes the given effect when given the value of this sum as input.
     * 
     * @param fT1  the effect to apply to value 1
     * @param fT2  the effect to apply to value 2
     * @param fT3  the effect to apply to value 3
     * @param fT4  the effect to apply to value 4
     * @param fT5  the effect to apply to value 5
     * @param fT6  the effect to apply to value 6
     * @param fT7  the effect to apply to value 7
     * @param fT8  the effect to apply to value 8
     * @param fT9  the effect to apply to value 9
     * @param fT10 the effect to apply to value 10
     * @param fT11 the effect to apply to value 11
     * @param fT12 the effect to apply to value 12
     * @param fT13 the effect to apply to value 13
     * @param fT14 the effect to apply to value 14
     * @param fT15 the effect to apply to value 15
     * @param fT16 the effect to apply to value 16
     * @param fT17 the effect to apply to value 17
     * @param fT18 the effect to apply to value 18
     * @param fT19 the effect to apply to value 19
     * @param fT20 the effect to apply to value 20
     * @param fT21 the effect to apply to value 21
     * @param fT22 the effect to apply to value 22
     * @param fT23 the effect to apply to value 23
     * @param fT24 the effect to apply to value 24
     * @param fT25 the effect to apply to value 25
     * @param fT26 the effect to apply to value 26
     * @param fT27 the effect to apply to value 27
     * @param fT28 the effect to apply to value 28
     * @param fT29 the effect to apply to value 29
     * @param fT30 the effect to apply to value 30
     * @param fT31 the effect to apply to value 31
     */
    void matchEffect(
            final E1<T1> fT1,
            final E1<T2> fT2,
            final E1<T3> fT3,
            final E1<T4> fT4,
            final E1<T5> fT5,
            final E1<T6> fT6,
            final E1<T7> fT7,
            final E1<T8> fT8,
            final E1<T9> fT9,
            final E1<T10> fT10,
            final E1<T11> fT11,
            final E1<T12> fT12,
            final E1<T13> fT13,
            final E1<T14> fT14,
            final E1<T15> fT15,
            final E1<T16> fT16,
            final E1<T17> fT17,
            final E1<T18> fT18,
            final E1<T19> fT19,
            final E1<T20> fT20,
            final E1<T21> fT21,
            final E1<T22> fT22,
            final E1<T23> fT23,
            final E1<T24> fT24,
            final E1<T25> fT25,
            final E1<T26> fT26,
            final E1<T27> fT27,
            final E1<T28> fT28,
            final E1<T29> fT29,
            final E1<T30> fT30,
            final E1<T31> fT31);

    /**
     * Executes the given effect when given the value of this sum as input.
     * 
     * @param  fT1  the effect to apply to value 1
     * @param  fT2  the effect to apply to value 2
     * @param  fT3  the effect to apply to value 3
     * @param  fT4  the effect to apply to value 4
     * @param  fT5  the effect to apply to value 5
     * @param  fT6  the effect to apply to value 6
     * @param  fT7  the effect to apply to value 7
     * @param  fT8  the effect to apply to value 8
     * @param  fT9  the effect to apply to value 9
     * @param  fT10 the effect to apply to value 10
     * @param  fT11 the effect to apply to value 11
     * @param  fT12 the effect to apply to value 12
     * @param  fT13 the effect to apply to value 13
     * @param  fT14 the effect to apply to value 14
     * @param  fT15 the effect to apply to value 15
     * @param  fT16 the effect to apply to value 16
     * @param  fT17 the effect to apply to value 17
     * @param  fT18 the effect to apply to value 18
     * @param  fT19 the effect to apply to value 19
     * @param  fT20 the effect to apply to value 20
     * @param  fT21 the effect to apply to value 21
     * @param  fT22 the effect to apply to value 22
     * @param  fT23 the effect to apply to value 23
     * @param  fT24 the effect to apply to value 24
     * @param  fT25 the effect to apply to value 25
     * @param  fT26 the effect to apply to value 26
     * @param  fT27 the effect to apply to value 27
     * @param  fT28 the effect to apply to value 28
     * @param  fT29 the effect to apply to value 29
     * @param  fT30 the effect to apply to value 30
     * @param  fT31 the effect to apply to value 31
     * @param  <E>  the type of the exception
     * 
     * @throws E    if the given effect throws an exception
     */
    <E extends Exception> void matchEffectException(
            final E1E<T1, E> fT1,
            final E1E<T2, E> fT2,
            final E1E<T3, E> fT3,
            final E1E<T4, E> fT4,
            final E1E<T5, E> fT5,
            final E1E<T6, E> fT6,
            final E1E<T7, E> fT7,
            final E1E<T8, E> fT8,
            final E1E<T9, E> fT9,
            final E1E<T10, E> fT10,
            final E1E<T11, E> fT11,
            final E1E<T12, E> fT12,
            final E1E<T13, E> fT13,
            final E1E<T14, E> fT14,
            final E1E<T15, E> fT15,
            final E1E<T16, E> fT16,
            final E1E<T17, E> fT17,
            final E1E<T18, E> fT18,
            final E1E<T19, E> fT19,
            final E1E<T20, E> fT20,
            final E1E<T21, E> fT21,
            final E1E<T22, E> fT22,
            final E1E<T23, E> fT23,
            final E1E<T24, E> fT24,
            final E1E<T25, E> fT25,
            final E1E<T26, E> fT26,
            final E1E<T27, E> fT27,
            final E1E<T28, E> fT28,
            final E1E<T29, E> fT29,
            final E1E<T30, E> fT30,
            final E1E<T31, E> fT31)
            throws E;

    /**
     * A default 31-value sum.
     * 
     * @param <T1>  the type of value 1
     * @param <T2>  the type of value 2
     * @param <T3>  the type of value 3
     * @param <T4>  the type of value 4
     * @param <T5>  the type of value 5
     * @param <T6>  the type of value 6
     * @param <T7>  the type of value 7
     * @param <T8>  the type of value 8
     * @param <T9>  the type of value 9
     * @param <T10> the type of value 10
     * @param <T11> the type of value 11
     * @param <T12> the type of value 12
     * @param <T13> the type of value 13
     * @param <T14> the type of value 14
     * @param <T15> the type of value 15
     * @param <T16> the type of value 16
     * @param <T17> the type of value 17
     * @param <T18> the type of value 18
     * @param <T19> the type of value 19
     * @param <T20> the type of value 20
     * @param <T21> the type of value 21
     * @param <T22> the type of value 22
     * @param <T23> the type of value 23
     * @param <T24> the type of value 24
     * @param <T25> the type of value 25
     * @param <T26> the type of value 26
     * @param <T27> the type of value 27
     * @param <T28> the type of value 28
     * @param <T29> the type of value 29
     * @param <T30> the type of value 30
     * @param <T31> the type of value 31
     */
    abstract class Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> implements S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
    {
        private Default()
        {
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t1    value 1
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t1(
                final T1 t1)
        {
            return new S31T1<>(t1);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t2    value 2
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t2(
                final T2 t2)
        {
            return new S31T2<>(t2);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t3    value 3
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t3(
                final T3 t3)
        {
            return new S31T3<>(t3);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t4    value 4
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t4(
                final T4 t4)
        {
            return new S31T4<>(t4);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t5    value 5
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t5(
                final T5 t5)
        {
            return new S31T5<>(t5);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t6    value 6
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t6(
                final T6 t6)
        {
            return new S31T6<>(t6);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t7    value 7
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t7(
                final T7 t7)
        {
            return new S31T7<>(t7);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t8    value 8
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t8(
                final T8 t8)
        {
            return new S31T8<>(t8);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t9    value 9
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t9(
                final T9 t9)
        {
            return new S31T9<>(t9);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t10   value 10
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t10(
                final T10 t10)
        {
            return new S31T10<>(t10);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t11   value 11
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t11(
                final T11 t11)
        {
            return new S31T11<>(t11);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t12   value 12
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t12(
                final T12 t12)
        {
            return new S31T12<>(t12);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t13   value 13
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t13(
                final T13 t13)
        {
            return new S31T13<>(t13);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t14   value 14
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t14(
                final T14 t14)
        {
            return new S31T14<>(t14);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t15   value 15
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t15(
                final T15 t15)
        {
            return new S31T15<>(t15);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t16   value 16
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t16(
                final T16 t16)
        {
            return new S31T16<>(t16);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t17   value 17
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t17(
                final T17 t17)
        {
            return new S31T17<>(t17);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t18   value 18
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t18(
                final T18 t18)
        {
            return new S31T18<>(t18);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t19   value 19
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t19(
                final T19 t19)
        {
            return new S31T19<>(t19);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t20   value 20
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t20(
                final T20 t20)
        {
            return new S31T20<>(t20);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t21   value 21
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t21(
                final T21 t21)
        {
            return new S31T21<>(t21);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t22   value 22
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t22(
                final T22 t22)
        {
            return new S31T22<>(t22);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t23   value 23
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t23(
                final T23 t23)
        {
            return new S31T23<>(t23);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t24   value 24
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t24(
                final T24 t24)
        {
            return new S31T24<>(t24);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t25   value 25
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t25(
                final T25 t25)
        {
            return new S31T25<>(t25);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t26   value 26
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t26(
                final T26 t26)
        {
            return new S31T26<>(t26);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t27   value 27
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t27(
                final T27 t27)
        {
            return new S31T27<>(t27);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t28   value 28
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t28(
                final T28 t28)
        {
            return new S31T28<>(t28);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t29   value 29
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t29(
                final T29 t29)
        {
            return new S31T29<>(t29);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t30   value 30
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t30(
                final T30 t30)
        {
            return new S31T30<>(t30);
        }

        /**
         * Returns a 31-value sum.
         * 
         * @param  t31   value 31
         * @param  <T1>  the type of value 1
         * @param  <T2>  the type of value 2
         * @param  <T3>  the type of value 3
         * @param  <T4>  the type of value 4
         * @param  <T5>  the type of value 5
         * @param  <T6>  the type of value 6
         * @param  <T7>  the type of value 7
         * @param  <T8>  the type of value 8
         * @param  <T9>  the type of value 9
         * @param  <T10> the type of value 10
         * @param  <T11> the type of value 11
         * @param  <T12> the type of value 12
         * @param  <T13> the type of value 13
         * @param  <T14> the type of value 14
         * @param  <T15> the type of value 15
         * @param  <T16> the type of value 16
         * @param  <T17> the type of value 17
         * @param  <T18> the type of value 18
         * @param  <T19> the type of value 19
         * @param  <T20> the type of value 20
         * @param  <T21> the type of value 21
         * @param  <T22> the type of value 22
         * @param  <T23> the type of value 23
         * @param  <T24> the type of value 24
         * @param  <T25> the type of value 25
         * @param  <T26> the type of value 26
         * @param  <T27> the type of value 27
         * @param  <T28> the type of value 28
         * @param  <T29> the type of value 29
         * @param  <T30> the type of value 30
         * @param  <T31> the type of value 31
         * 
         * @return       a 31-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> S31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> s31t31(
                final T31 t31)
        {
            return new S31T31<>(t31);
        }

        private static final class S31T1<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T1 t1;

            private S31T1(
                    final T1 t1)
            {
                this.t1 = t1;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT1.f(t1);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT1.f(t1);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT1.f(t1);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT1.f(t1);
            }
        }

        private static final class S31T2<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T2 t2;

            private S31T2(
                    final T2 t2)
            {
                this.t2 = t2;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT2.f(t2);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT2.f(t2);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT2.f(t2);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT2.f(t2);
            }
        }

        private static final class S31T3<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T3 t3;

            private S31T3(
                    final T3 t3)
            {
                this.t3 = t3;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT3.f(t3);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT3.f(t3);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT3.f(t3);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT3.f(t3);
            }
        }

        private static final class S31T4<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T4 t4;

            private S31T4(
                    final T4 t4)
            {
                this.t4 = t4;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT4.f(t4);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT4.f(t4);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT4.f(t4);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT4.f(t4);
            }
        }

        private static final class S31T5<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T5 t5;

            private S31T5(
                    final T5 t5)
            {
                this.t5 = t5;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT5.f(t5);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT5.f(t5);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT5.f(t5);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT5.f(t5);
            }
        }

        private static final class S31T6<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T6 t6;

            private S31T6(
                    final T6 t6)
            {
                this.t6 = t6;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT6.f(t6);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT6.f(t6);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT6.f(t6);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT6.f(t6);
            }
        }

        private static final class S31T7<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T7 t7;

            private S31T7(
                    final T7 t7)
            {
                this.t7 = t7;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT7.f(t7);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT7.f(t7);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT7.f(t7);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT7.f(t7);
            }
        }

        private static final class S31T8<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T8 t8;

            private S31T8(
                    final T8 t8)
            {
                this.t8 = t8;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT8.f(t8);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT8.f(t8);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT8.f(t8);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT8.f(t8);
            }
        }

        private static final class S31T9<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T9 t9;

            private S31T9(
                    final T9 t9)
            {
                this.t9 = t9;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT9.f(t9);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT9.f(t9);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT9.f(t9);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT9.f(t9);
            }
        }

        private static final class S31T10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T10 t10;

            private S31T10(
                    final T10 t10)
            {
                this.t10 = t10;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT10.f(t10);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT10.f(t10);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT10.f(t10);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT10.f(t10);
            }
        }

        private static final class S31T11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T11 t11;

            private S31T11(
                    final T11 t11)
            {
                this.t11 = t11;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT11.f(t11);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT11.f(t11);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT11.f(t11);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT11.f(t11);
            }
        }

        private static final class S31T12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T12 t12;

            private S31T12(
                    final T12 t12)
            {
                this.t12 = t12;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT12.f(t12);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT12.f(t12);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT12.f(t12);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT12.f(t12);
            }
        }

        private static final class S31T13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T13 t13;

            private S31T13(
                    final T13 t13)
            {
                this.t13 = t13;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT13.f(t13);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT13.f(t13);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT13.f(t13);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT13.f(t13);
            }
        }

        private static final class S31T14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T14 t14;

            private S31T14(
                    final T14 t14)
            {
                this.t14 = t14;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT14.f(t14);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT14.f(t14);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT14.f(t14);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT14.f(t14);
            }
        }

        private static final class S31T15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T15 t15;

            private S31T15(
                    final T15 t15)
            {
                this.t15 = t15;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT15.f(t15);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT15.f(t15);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT15.f(t15);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT15.f(t15);
            }
        }

        private static final class S31T16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T16 t16;

            private S31T16(
                    final T16 t16)
            {
                this.t16 = t16;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT16.f(t16);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT16.f(t16);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT16.f(t16);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT16.f(t16);
            }
        }

        private static final class S31T17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T17 t17;

            private S31T17(
                    final T17 t17)
            {
                this.t17 = t17;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT17.f(t17);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT17.f(t17);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT17.f(t17);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT17.f(t17);
            }
        }

        private static final class S31T18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T18 t18;

            private S31T18(
                    final T18 t18)
            {
                this.t18 = t18;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT18.f(t18);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT18.f(t18);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT18.f(t18);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT18.f(t18);
            }
        }

        private static final class S31T19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T19 t19;

            private S31T19(
                    final T19 t19)
            {
                this.t19 = t19;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT19.f(t19);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT19.f(t19);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT19.f(t19);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT19.f(t19);
            }
        }

        private static final class S31T20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T20 t20;

            private S31T20(
                    final T20 t20)
            {
                this.t20 = t20;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT20.f(t20);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT20.f(t20);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT20.f(t20);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT20.f(t20);
            }
        }

        private static final class S31T21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T21 t21;

            private S31T21(
                    final T21 t21)
            {
                this.t21 = t21;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT21.f(t21);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT21.f(t21);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT21.f(t21);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT21.f(t21);
            }
        }

        private static final class S31T22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T22 t22;

            private S31T22(
                    final T22 t22)
            {
                this.t22 = t22;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT22.f(t22);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT22.f(t22);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT22.f(t22);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT22.f(t22);
            }
        }

        private static final class S31T23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T23 t23;

            private S31T23(
                    final T23 t23)
            {
                this.t23 = t23;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT23.f(t23);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT23.f(t23);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT23.f(t23);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT23.f(t23);
            }
        }

        private static final class S31T24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T24 t24;

            private S31T24(
                    final T24 t24)
            {
                this.t24 = t24;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT24.f(t24);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT24.f(t24);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT24.f(t24);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT24.f(t24);
            }
        }

        private static final class S31T25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T25 t25;

            private S31T25(
                    final T25 t25)
            {
                this.t25 = t25;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT25.f(t25);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT25.f(t25);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT25.f(t25);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT25.f(t25);
            }
        }

        private static final class S31T26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T26 t26;

            private S31T26(
                    final T26 t26)
            {
                this.t26 = t26;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT26.f(t26);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT26.f(t26);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT26.f(t26);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT26.f(t26);
            }
        }

        private static final class S31T27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T27 t27;

            private S31T27(
                    final T27 t27)
            {
                this.t27 = t27;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT27.f(t27);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT27.f(t27);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT27.f(t27);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT27.f(t27);
            }
        }

        private static final class S31T28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T28 t28;

            private S31T28(
                    final T28 t28)
            {
                this.t28 = t28;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT28.f(t28);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT28.f(t28);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT28.f(t28);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT28.f(t28);
            }
        }

        private static final class S31T29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T29 t29;

            private S31T29(
                    final T29 t29)
            {
                this.t29 = t29;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT29.f(t29);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT29.f(t29);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT29.f(t29);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT29.f(t29);
            }
        }

        private static final class S31T30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T30 t30;

            private S31T30(
                    final T30 t30)
            {
                this.t30 = t30;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT30.f(t30);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT30.f(t30);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT30.f(t30);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT30.f(t30);
            }
        }

        private static final class S31T31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>
        {
            private final T31 t31;

            private S31T31(
                    final T31 t31)
            {
                this.t31 = t31;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5,
                    final F1<T6, R1> fT6,
                    final F1<T7, R1> fT7,
                    final F1<T8, R1> fT8,
                    final F1<T9, R1> fT9,
                    final F1<T10, R1> fT10,
                    final F1<T11, R1> fT11,
                    final F1<T12, R1> fT12,
                    final F1<T13, R1> fT13,
                    final F1<T14, R1> fT14,
                    final F1<T15, R1> fT15,
                    final F1<T16, R1> fT16,
                    final F1<T17, R1> fT17,
                    final F1<T18, R1> fT18,
                    final F1<T19, R1> fT19,
                    final F1<T20, R1> fT20,
                    final F1<T21, R1> fT21,
                    final F1<T22, R1> fT22,
                    final F1<T23, R1> fT23,
                    final F1<T24, R1> fT24,
                    final F1<T25, R1> fT25,
                    final F1<T26, R1> fT26,
                    final F1<T27, R1> fT27,
                    final F1<T28, R1> fT28,
                    final F1<T29, R1> fT29,
                    final F1<T30, R1> fT30,
                    final F1<T31, R1> fT31)
            {
                return fT31.f(t31);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  fT3  the function to apply to value 3
             * @param  fT4  the function to apply to value 4
             * @param  fT5  the function to apply to value 5
             * @param  fT6  the function to apply to value 6
             * @param  fT7  the function to apply to value 7
             * @param  fT8  the function to apply to value 8
             * @param  fT9  the function to apply to value 9
             * @param  fT10 the function to apply to value 10
             * @param  fT11 the function to apply to value 11
             * @param  fT12 the function to apply to value 12
             * @param  fT13 the function to apply to value 13
             * @param  fT14 the function to apply to value 14
             * @param  fT15 the function to apply to value 15
             * @param  fT16 the function to apply to value 16
             * @param  fT17 the function to apply to value 17
             * @param  fT18 the function to apply to value 18
             * @param  fT19 the function to apply to value 19
             * @param  fT20 the function to apply to value 20
             * @param  fT21 the function to apply to value 21
             * @param  fT22 the function to apply to value 22
             * @param  fT23 the function to apply to value 23
             * @param  fT24 the function to apply to value 24
             * @param  fT25 the function to apply to value 25
             * @param  fT26 the function to apply to value 26
             * @param  fT27 the function to apply to value 27
             * @param  fT28 the function to apply to value 28
             * @param  fT29 the function to apply to value 29
             * @param  fT30 the function to apply to value 30
             * @param  fT31 the function to apply to value 31
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2,
                    final F1E<T3, R1, E> fT3,
                    final F1E<T4, R1, E> fT4,
                    final F1E<T5, R1, E> fT5,
                    final F1E<T6, R1, E> fT6,
                    final F1E<T7, R1, E> fT7,
                    final F1E<T8, R1, E> fT8,
                    final F1E<T9, R1, E> fT9,
                    final F1E<T10, R1, E> fT10,
                    final F1E<T11, R1, E> fT11,
                    final F1E<T12, R1, E> fT12,
                    final F1E<T13, R1, E> fT13,
                    final F1E<T14, R1, E> fT14,
                    final F1E<T15, R1, E> fT15,
                    final F1E<T16, R1, E> fT16,
                    final F1E<T17, R1, E> fT17,
                    final F1E<T18, R1, E> fT18,
                    final F1E<T19, R1, E> fT19,
                    final F1E<T20, R1, E> fT20,
                    final F1E<T21, R1, E> fT21,
                    final F1E<T22, R1, E> fT22,
                    final F1E<T23, R1, E> fT23,
                    final F1E<T24, R1, E> fT24,
                    final F1E<T25, R1, E> fT25,
                    final F1E<T26, R1, E> fT26,
                    final F1E<T27, R1, E> fT27,
                    final F1E<T28, R1, E> fT28,
                    final F1E<T29, R1, E> fT29,
                    final F1E<T30, R1, E> fT30,
                    final F1E<T31, R1, E> fT31)
                    throws E
            {
                return fT31.f(t31);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1  the effect to apply to value 1
             * @param fT2  the effect to apply to value 2
             * @param fT3  the effect to apply to value 3
             * @param fT4  the effect to apply to value 4
             * @param fT5  the effect to apply to value 5
             * @param fT6  the effect to apply to value 6
             * @param fT7  the effect to apply to value 7
             * @param fT8  the effect to apply to value 8
             * @param fT9  the effect to apply to value 9
             * @param fT10 the effect to apply to value 10
             * @param fT11 the effect to apply to value 11
             * @param fT12 the effect to apply to value 12
             * @param fT13 the effect to apply to value 13
             * @param fT14 the effect to apply to value 14
             * @param fT15 the effect to apply to value 15
             * @param fT16 the effect to apply to value 16
             * @param fT17 the effect to apply to value 17
             * @param fT18 the effect to apply to value 18
             * @param fT19 the effect to apply to value 19
             * @param fT20 the effect to apply to value 20
             * @param fT21 the effect to apply to value 21
             * @param fT22 the effect to apply to value 22
             * @param fT23 the effect to apply to value 23
             * @param fT24 the effect to apply to value 24
             * @param fT25 the effect to apply to value 25
             * @param fT26 the effect to apply to value 26
             * @param fT27 the effect to apply to value 27
             * @param fT28 the effect to apply to value 28
             * @param fT29 the effect to apply to value 29
             * @param fT30 the effect to apply to value 30
             * @param fT31 the effect to apply to value 31
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7,
                    final E1<T8> fT8,
                    final E1<T9> fT9,
                    final E1<T10> fT10,
                    final E1<T11> fT11,
                    final E1<T12> fT12,
                    final E1<T13> fT13,
                    final E1<T14> fT14,
                    final E1<T15> fT15,
                    final E1<T16> fT16,
                    final E1<T17> fT17,
                    final E1<T18> fT18,
                    final E1<T19> fT19,
                    final E1<T20> fT20,
                    final E1<T21> fT21,
                    final E1<T22> fT22,
                    final E1<T23> fT23,
                    final E1<T24> fT24,
                    final E1<T25> fT25,
                    final E1<T26> fT26,
                    final E1<T27> fT27,
                    final E1<T28> fT28,
                    final E1<T29> fT29,
                    final E1<T30> fT30,
                    final E1<T31> fT31)
            {
                fT31.f(t31);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1  the effect to apply to value 1
             * @param  fT2  the effect to apply to value 2
             * @param  fT3  the effect to apply to value 3
             * @param  fT4  the effect to apply to value 4
             * @param  fT5  the effect to apply to value 5
             * @param  fT6  the effect to apply to value 6
             * @param  fT7  the effect to apply to value 7
             * @param  fT8  the effect to apply to value 8
             * @param  fT9  the effect to apply to value 9
             * @param  fT10 the effect to apply to value 10
             * @param  fT11 the effect to apply to value 11
             * @param  fT12 the effect to apply to value 12
             * @param  fT13 the effect to apply to value 13
             * @param  fT14 the effect to apply to value 14
             * @param  fT15 the effect to apply to value 15
             * @param  fT16 the effect to apply to value 16
             * @param  fT17 the effect to apply to value 17
             * @param  fT18 the effect to apply to value 18
             * @param  fT19 the effect to apply to value 19
             * @param  fT20 the effect to apply to value 20
             * @param  fT21 the effect to apply to value 21
             * @param  fT22 the effect to apply to value 22
             * @param  fT23 the effect to apply to value 23
             * @param  fT24 the effect to apply to value 24
             * @param  fT25 the effect to apply to value 25
             * @param  fT26 the effect to apply to value 26
             * @param  fT27 the effect to apply to value 27
             * @param  fT28 the effect to apply to value 28
             * @param  fT29 the effect to apply to value 29
             * @param  fT30 the effect to apply to value 30
             * @param  fT31 the effect to apply to value 31
             * @param  <E>  the type of the exception
             * 
             * @throws E    if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7,
                    final E1E<T8, E> fT8,
                    final E1E<T9, E> fT9,
                    final E1E<T10, E> fT10,
                    final E1E<T11, E> fT11,
                    final E1E<T12, E> fT12,
                    final E1E<T13, E> fT13,
                    final E1E<T14, E> fT14,
                    final E1E<T15, E> fT15,
                    final E1E<T16, E> fT16,
                    final E1E<T17, E> fT17,
                    final E1E<T18, E> fT18,
                    final E1E<T19, E> fT19,
                    final E1E<T20, E> fT20,
                    final E1E<T21, E> fT21,
                    final E1E<T22, E> fT22,
                    final E1E<T23, E> fT23,
                    final E1E<T24, E> fT24,
                    final E1E<T25, E> fT25,
                    final E1E<T26, E> fT26,
                    final E1E<T27, E> fT27,
                    final E1E<T28, E> fT28,
                    final E1E<T29, E> fT29,
                    final E1E<T30, E> fT30,
                    final E1E<T31, E> fT31)
                    throws E
            {
                fT31.f(t31);
            }
        }
    }
}
