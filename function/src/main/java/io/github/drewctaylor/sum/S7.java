package io.github.drewctaylor.sum;

import io.github.drewctaylor.effect.E1;
import io.github.drewctaylor.effect.exception.E1E;
import io.github.drewctaylor.function.F1;
import io.github.drewctaylor.function.exception.F1E;

/**
 * A 7-value sum.
 * 
 * @param <T1> the type of value 1
 * @param <T2> the type of value 2
 * @param <T3> the type of value 3
 * @param <T4> the type of value 4
 * @param <T5> the type of value 5
 * @param <T6> the type of value 6
 * @param <T7> the type of value 7
 */
public interface S7<T1, T2, T3, T4, T5, T6, T7>
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
            final F1<T7, R1> fT7);

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
            final F1E<T7, R1, E> fT7)
            throws E;

    /**
     * Executes the given effect when given the value of this sum as input.
     * 
     * @param fT1 the effect to apply to value 1
     * @param fT2 the effect to apply to value 2
     * @param fT3 the effect to apply to value 3
     * @param fT4 the effect to apply to value 4
     * @param fT5 the effect to apply to value 5
     * @param fT6 the effect to apply to value 6
     * @param fT7 the effect to apply to value 7
     */
    void matchEffect(
            final E1<T1> fT1,
            final E1<T2> fT2,
            final E1<T3> fT3,
            final E1<T4> fT4,
            final E1<T5> fT5,
            final E1<T6> fT6,
            final E1<T7> fT7);

    /**
     * Executes the given effect when given the value of this sum as input.
     * 
     * @param  fT1 the effect to apply to value 1
     * @param  fT2 the effect to apply to value 2
     * @param  fT3 the effect to apply to value 3
     * @param  fT4 the effect to apply to value 4
     * @param  fT5 the effect to apply to value 5
     * @param  fT6 the effect to apply to value 6
     * @param  fT7 the effect to apply to value 7
     * @param  <E> the type of the exception
     * 
     * @throws E   if the given effect throws an exception
     */
    <E extends Exception> void matchEffectException(
            final E1E<T1, E> fT1,
            final E1E<T2, E> fT2,
            final E1E<T3, E> fT3,
            final E1E<T4, E> fT4,
            final E1E<T5, E> fT5,
            final E1E<T6, E> fT6,
            final E1E<T7, E> fT7)
            throws E;

    /**
     * A default 7-value sum.
     * 
     * @param <T1> the type of value 1
     * @param <T2> the type of value 2
     * @param <T3> the type of value 3
     * @param <T4> the type of value 4
     * @param <T5> the type of value 5
     * @param <T6> the type of value 6
     * @param <T7> the type of value 7
     */
    abstract class Default<T1, T2, T3, T4, T5, T6, T7> implements S7<T1, T2, T3, T4, T5, T6, T7>
    {
        private Default()
        {
        }

        /**
         * Returns a 7-value sum.
         * 
         * @param  t1   value 1
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * @param  <T4> the type of value 4
         * @param  <T5> the type of value 5
         * @param  <T6> the type of value 6
         * @param  <T7> the type of value 7
         * 
         * @return      a 7-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7> S7<T1, T2, T3, T4, T5, T6, T7> s7t1(
                final T1 t1)
        {
            return new S7T1<>(t1);
        }

        /**
         * Returns a 7-value sum.
         * 
         * @param  t2   value 2
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * @param  <T4> the type of value 4
         * @param  <T5> the type of value 5
         * @param  <T6> the type of value 6
         * @param  <T7> the type of value 7
         * 
         * @return      a 7-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7> S7<T1, T2, T3, T4, T5, T6, T7> s7t2(
                final T2 t2)
        {
            return new S7T2<>(t2);
        }

        /**
         * Returns a 7-value sum.
         * 
         * @param  t3   value 3
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * @param  <T4> the type of value 4
         * @param  <T5> the type of value 5
         * @param  <T6> the type of value 6
         * @param  <T7> the type of value 7
         * 
         * @return      a 7-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7> S7<T1, T2, T3, T4, T5, T6, T7> s7t3(
                final T3 t3)
        {
            return new S7T3<>(t3);
        }

        /**
         * Returns a 7-value sum.
         * 
         * @param  t4   value 4
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * @param  <T4> the type of value 4
         * @param  <T5> the type of value 5
         * @param  <T6> the type of value 6
         * @param  <T7> the type of value 7
         * 
         * @return      a 7-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7> S7<T1, T2, T3, T4, T5, T6, T7> s7t4(
                final T4 t4)
        {
            return new S7T4<>(t4);
        }

        /**
         * Returns a 7-value sum.
         * 
         * @param  t5   value 5
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * @param  <T4> the type of value 4
         * @param  <T5> the type of value 5
         * @param  <T6> the type of value 6
         * @param  <T7> the type of value 7
         * 
         * @return      a 7-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7> S7<T1, T2, T3, T4, T5, T6, T7> s7t5(
                final T5 t5)
        {
            return new S7T5<>(t5);
        }

        /**
         * Returns a 7-value sum.
         * 
         * @param  t6   value 6
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * @param  <T4> the type of value 4
         * @param  <T5> the type of value 5
         * @param  <T6> the type of value 6
         * @param  <T7> the type of value 7
         * 
         * @return      a 7-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7> S7<T1, T2, T3, T4, T5, T6, T7> s7t6(
                final T6 t6)
        {
            return new S7T6<>(t6);
        }

        /**
         * Returns a 7-value sum.
         * 
         * @param  t7   value 7
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * @param  <T4> the type of value 4
         * @param  <T5> the type of value 5
         * @param  <T6> the type of value 6
         * @param  <T7> the type of value 7
         * 
         * @return      a 7-value sum
         */
        public static final <T1, T2, T3, T4, T5, T6, T7> S7<T1, T2, T3, T4, T5, T6, T7> s7t7(
                final T7 t7)
        {
            return new S7T7<>(t7);
        }

        private static final class S7T1<T1, T2, T3, T4, T5, T6, T7> extends Default<T1, T2, T3, T4, T5, T6, T7>
        {
            private final T1 t1;

            private S7T1(
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
                    final F1<T7, R1> fT7)
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
                    final F1E<T7, R1, E> fT7)
                    throws E
            {
                return fT1.f(t1);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1 the effect to apply to value 1
             * @param fT2 the effect to apply to value 2
             * @param fT3 the effect to apply to value 3
             * @param fT4 the effect to apply to value 4
             * @param fT5 the effect to apply to value 5
             * @param fT6 the effect to apply to value 6
             * @param fT7 the effect to apply to value 7
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7)
            {
                fT1.f(t1);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1 the effect to apply to value 1
             * @param  fT2 the effect to apply to value 2
             * @param  fT3 the effect to apply to value 3
             * @param  fT4 the effect to apply to value 4
             * @param  fT5 the effect to apply to value 5
             * @param  fT6 the effect to apply to value 6
             * @param  fT7 the effect to apply to value 7
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7)
                    throws E
            {
                fT1.f(t1);
            }
        }

        private static final class S7T2<T1, T2, T3, T4, T5, T6, T7> extends Default<T1, T2, T3, T4, T5, T6, T7>
        {
            private final T2 t2;

            private S7T2(
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
                    final F1<T7, R1> fT7)
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
                    final F1E<T7, R1, E> fT7)
                    throws E
            {
                return fT2.f(t2);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1 the effect to apply to value 1
             * @param fT2 the effect to apply to value 2
             * @param fT3 the effect to apply to value 3
             * @param fT4 the effect to apply to value 4
             * @param fT5 the effect to apply to value 5
             * @param fT6 the effect to apply to value 6
             * @param fT7 the effect to apply to value 7
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7)
            {
                fT2.f(t2);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1 the effect to apply to value 1
             * @param  fT2 the effect to apply to value 2
             * @param  fT3 the effect to apply to value 3
             * @param  fT4 the effect to apply to value 4
             * @param  fT5 the effect to apply to value 5
             * @param  fT6 the effect to apply to value 6
             * @param  fT7 the effect to apply to value 7
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7)
                    throws E
            {
                fT2.f(t2);
            }
        }

        private static final class S7T3<T1, T2, T3, T4, T5, T6, T7> extends Default<T1, T2, T3, T4, T5, T6, T7>
        {
            private final T3 t3;

            private S7T3(
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
                    final F1<T7, R1> fT7)
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
                    final F1E<T7, R1, E> fT7)
                    throws E
            {
                return fT3.f(t3);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1 the effect to apply to value 1
             * @param fT2 the effect to apply to value 2
             * @param fT3 the effect to apply to value 3
             * @param fT4 the effect to apply to value 4
             * @param fT5 the effect to apply to value 5
             * @param fT6 the effect to apply to value 6
             * @param fT7 the effect to apply to value 7
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7)
            {
                fT3.f(t3);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1 the effect to apply to value 1
             * @param  fT2 the effect to apply to value 2
             * @param  fT3 the effect to apply to value 3
             * @param  fT4 the effect to apply to value 4
             * @param  fT5 the effect to apply to value 5
             * @param  fT6 the effect to apply to value 6
             * @param  fT7 the effect to apply to value 7
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7)
                    throws E
            {
                fT3.f(t3);
            }
        }

        private static final class S7T4<T1, T2, T3, T4, T5, T6, T7> extends Default<T1, T2, T3, T4, T5, T6, T7>
        {
            private final T4 t4;

            private S7T4(
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
                    final F1<T7, R1> fT7)
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
                    final F1E<T7, R1, E> fT7)
                    throws E
            {
                return fT4.f(t4);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1 the effect to apply to value 1
             * @param fT2 the effect to apply to value 2
             * @param fT3 the effect to apply to value 3
             * @param fT4 the effect to apply to value 4
             * @param fT5 the effect to apply to value 5
             * @param fT6 the effect to apply to value 6
             * @param fT7 the effect to apply to value 7
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7)
            {
                fT4.f(t4);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1 the effect to apply to value 1
             * @param  fT2 the effect to apply to value 2
             * @param  fT3 the effect to apply to value 3
             * @param  fT4 the effect to apply to value 4
             * @param  fT5 the effect to apply to value 5
             * @param  fT6 the effect to apply to value 6
             * @param  fT7 the effect to apply to value 7
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7)
                    throws E
            {
                fT4.f(t4);
            }
        }

        private static final class S7T5<T1, T2, T3, T4, T5, T6, T7> extends Default<T1, T2, T3, T4, T5, T6, T7>
        {
            private final T5 t5;

            private S7T5(
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
                    final F1<T7, R1> fT7)
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
                    final F1E<T7, R1, E> fT7)
                    throws E
            {
                return fT5.f(t5);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1 the effect to apply to value 1
             * @param fT2 the effect to apply to value 2
             * @param fT3 the effect to apply to value 3
             * @param fT4 the effect to apply to value 4
             * @param fT5 the effect to apply to value 5
             * @param fT6 the effect to apply to value 6
             * @param fT7 the effect to apply to value 7
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7)
            {
                fT5.f(t5);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1 the effect to apply to value 1
             * @param  fT2 the effect to apply to value 2
             * @param  fT3 the effect to apply to value 3
             * @param  fT4 the effect to apply to value 4
             * @param  fT5 the effect to apply to value 5
             * @param  fT6 the effect to apply to value 6
             * @param  fT7 the effect to apply to value 7
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7)
                    throws E
            {
                fT5.f(t5);
            }
        }

        private static final class S7T6<T1, T2, T3, T4, T5, T6, T7> extends Default<T1, T2, T3, T4, T5, T6, T7>
        {
            private final T6 t6;

            private S7T6(
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
                    final F1<T7, R1> fT7)
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
                    final F1E<T7, R1, E> fT7)
                    throws E
            {
                return fT6.f(t6);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1 the effect to apply to value 1
             * @param fT2 the effect to apply to value 2
             * @param fT3 the effect to apply to value 3
             * @param fT4 the effect to apply to value 4
             * @param fT5 the effect to apply to value 5
             * @param fT6 the effect to apply to value 6
             * @param fT7 the effect to apply to value 7
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7)
            {
                fT6.f(t6);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1 the effect to apply to value 1
             * @param  fT2 the effect to apply to value 2
             * @param  fT3 the effect to apply to value 3
             * @param  fT4 the effect to apply to value 4
             * @param  fT5 the effect to apply to value 5
             * @param  fT6 the effect to apply to value 6
             * @param  fT7 the effect to apply to value 7
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7)
                    throws E
            {
                fT6.f(t6);
            }
        }

        private static final class S7T7<T1, T2, T3, T4, T5, T6, T7> extends Default<T1, T2, T3, T4, T5, T6, T7>
        {
            private final T7 t7;

            private S7T7(
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
                    final F1<T7, R1> fT7)
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
                    final F1E<T7, R1, E> fT7)
                    throws E
            {
                return fT7.f(t7);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1 the effect to apply to value 1
             * @param fT2 the effect to apply to value 2
             * @param fT3 the effect to apply to value 3
             * @param fT4 the effect to apply to value 4
             * @param fT5 the effect to apply to value 5
             * @param fT6 the effect to apply to value 6
             * @param fT7 the effect to apply to value 7
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5,
                    final E1<T6> fT6,
                    final E1<T7> fT7)
            {
                fT7.f(t7);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1 the effect to apply to value 1
             * @param  fT2 the effect to apply to value 2
             * @param  fT3 the effect to apply to value 3
             * @param  fT4 the effect to apply to value 4
             * @param  fT5 the effect to apply to value 5
             * @param  fT6 the effect to apply to value 6
             * @param  fT7 the effect to apply to value 7
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5,
                    final E1E<T6, E> fT6,
                    final E1E<T7, E> fT7)
                    throws E
            {
                fT7.f(t7);
            }
        }
    }
}
