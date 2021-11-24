package io.github.drewctaylor.sum;

import io.github.drewctaylor.effect.E1;
import io.github.drewctaylor.effect.exception.E1E;
import io.github.drewctaylor.function.F1;
import io.github.drewctaylor.function.exception.F1E;

/**
 * A 17-value sum.
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
 */
public interface S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
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
            final F1<T17, R1> fT17);

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
            final F1E<T17, R1, E> fT17)
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
            final E1<T17> fT17);

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
            final E1E<T17, E> fT17)
            throws E;

    /**
     * A default 17-value sum.
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
     */
    abstract class Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> implements S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
    {
        private Default()
        {
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t1(
                final T1 t1)
        {
            return new S17T1<>(t1);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t2(
                final T2 t2)
        {
            return new S17T2<>(t2);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t3(
                final T3 t3)
        {
            return new S17T3<>(t3);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t4(
                final T4 t4)
        {
            return new S17T4<>(t4);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t5(
                final T5 t5)
        {
            return new S17T5<>(t5);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t6(
                final T6 t6)
        {
            return new S17T6<>(t6);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t7(
                final T7 t7)
        {
            return new S17T7<>(t7);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t8(
                final T8 t8)
        {
            return new S17T8<>(t8);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t9(
                final T9 t9)
        {
            return new S17T9<>(t9);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t10(
                final T10 t10)
        {
            return new S17T10<>(t10);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t11(
                final T11 t11)
        {
            return new S17T11<>(t11);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t12(
                final T12 t12)
        {
            return new S17T12<>(t12);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t13(
                final T13 t13)
        {
            return new S17T13<>(t13);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t14(
                final T14 t14)
        {
            return new S17T14<>(t14);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t15(
                final T15 t15)
        {
            return new S17T15<>(t15);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t16(
                final T16 t16)
        {
            return new S17T16<>(t16);
        }

        /**
         * Returns a 17-value sum.
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
         * 
         * @return       a 17-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> S17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> s17t17(
                final T17 t17)
        {
            return new S17T17<>(t17);
        }

        private static final class S17T1<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T1 t1;

            private S17T1(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT1.f(t1);
            }
        }

        private static final class S17T2<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T2 t2;

            private S17T2(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT2.f(t2);
            }
        }

        private static final class S17T3<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T3 t3;

            private S17T3(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT3.f(t3);
            }
        }

        private static final class S17T4<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T4 t4;

            private S17T4(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT4.f(t4);
            }
        }

        private static final class S17T5<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T5 t5;

            private S17T5(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT5.f(t5);
            }
        }

        private static final class S17T6<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T6 t6;

            private S17T6(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT6.f(t6);
            }
        }

        private static final class S17T7<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T7 t7;

            private S17T7(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT7.f(t7);
            }
        }

        private static final class S17T8<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T8 t8;

            private S17T8(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT8.f(t8);
            }
        }

        private static final class S17T9<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T9 t9;

            private S17T9(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT9.f(t9);
            }
        }

        private static final class S17T10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T10 t10;

            private S17T10(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT10.f(t10);
            }
        }

        private static final class S17T11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T11 t11;

            private S17T11(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT11.f(t11);
            }
        }

        private static final class S17T12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T12 t12;

            private S17T12(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT12.f(t12);
            }
        }

        private static final class S17T13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T13 t13;

            private S17T13(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT13.f(t13);
            }
        }

        private static final class S17T14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T14 t14;

            private S17T14(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT14.f(t14);
            }
        }

        private static final class S17T15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T15 t15;

            private S17T15(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT15.f(t15);
            }
        }

        private static final class S17T16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T16 t16;

            private S17T16(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT16.f(t16);
            }
        }

        private static final class S17T17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> extends Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>
        {
            private final T17 t17;

            private S17T17(
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
                    final F1<T17, R1> fT17)
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
                    final F1E<T17, R1, E> fT17)
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
                    final E1<T17> fT17)
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
                    final E1E<T17, E> fT17)
                    throws E
            {
                fT17.f(t17);
            }
        }
    }
}
