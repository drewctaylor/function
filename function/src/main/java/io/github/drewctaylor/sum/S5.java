package io.github.drewctaylor.sum;

import io.github.drewctaylor.effect.E1;
import io.github.drewctaylor.effect.exception.E1E;
import io.github.drewctaylor.function.F1;
import io.github.drewctaylor.function.exception.F1E;

/**
 * A 5-value sum.
 * 
 * @param <T1> the type of value 1
 * @param <T2> the type of value 2
 * @param <T3> the type of value 3
 * @param <T4> the type of value 4
 * @param <T5> the type of value 5
 */
public interface S5<T1, T2, T3, T4, T5>
{
    /**
     * Return the output of the given function when given the value of this sum as input.
     * 
     * @param  fT1  the function to apply to value 1
     * @param  fT2  the function to apply to value 2
     * @param  fT3  the function to apply to value 3
     * @param  fT4  the function to apply to value 4
     * @param  fT5  the function to apply to value 5
     * @param  <R1> the type of the output value
     * 
     * @return      the output of the given function when given the value of this sum as input
     */
    <R1> R1 match(
            final F1<T1, R1> fT1,
            final F1<T2, R1> fT2,
            final F1<T3, R1> fT3,
            final F1<T4, R1> fT4,
            final F1<T5, R1> fT5);

    /**
     * Return the output of the given function when given the value of this sum as input.
     * 
     * @param  fT1  the function to apply to value 1
     * @param  fT2  the function to apply to value 2
     * @param  fT3  the function to apply to value 3
     * @param  fT4  the function to apply to value 4
     * @param  fT5  the function to apply to value 5
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
            final F1E<T5, R1, E> fT5)
            throws E;

    /**
     * Executes the given effect when given the value of this sum as input.
     * 
     * @param fT1 the effect to apply to value 1
     * @param fT2 the effect to apply to value 2
     * @param fT3 the effect to apply to value 3
     * @param fT4 the effect to apply to value 4
     * @param fT5 the effect to apply to value 5
     */
    void matchEffect(
            final E1<T1> fT1,
            final E1<T2> fT2,
            final E1<T3> fT3,
            final E1<T4> fT4,
            final E1<T5> fT5);

    /**
     * Executes the given effect when given the value of this sum as input.
     * 
     * @param  fT1 the effect to apply to value 1
     * @param  fT2 the effect to apply to value 2
     * @param  fT3 the effect to apply to value 3
     * @param  fT4 the effect to apply to value 4
     * @param  fT5 the effect to apply to value 5
     * @param  <E> the type of the exception
     * 
     * @throws E   if the given effect throws an exception
     */
    <E extends Exception> void matchEffectException(
            final E1E<T1, E> fT1,
            final E1E<T2, E> fT2,
            final E1E<T3, E> fT3,
            final E1E<T4, E> fT4,
            final E1E<T5, E> fT5)
            throws E;

    /**
     * A default 5-value sum.
     * 
     * @param <T1> the type of value 1
     * @param <T2> the type of value 2
     * @param <T3> the type of value 3
     * @param <T4> the type of value 4
     * @param <T5> the type of value 5
     */
    abstract class Default<T1, T2, T3, T4, T5> implements S5<T1, T2, T3, T4, T5>
    {
        private Default()
        {
        }

        /**
         * Returns a 5-value sum.
         * 
         * @param  t1   value 1
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * @param  <T4> the type of value 4
         * @param  <T5> the type of value 5
         * 
         * @return      a 5-value sum
         */
        public static final <T1, T2, T3, T4, T5> S5<T1, T2, T3, T4, T5> s5t1(
                final T1 t1)
        {
            return new S5T1<>(t1);
        }

        /**
         * Returns a 5-value sum.
         * 
         * @param  t2   value 2
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * @param  <T4> the type of value 4
         * @param  <T5> the type of value 5
         * 
         * @return      a 5-value sum
         */
        public static final <T1, T2, T3, T4, T5> S5<T1, T2, T3, T4, T5> s5t2(
                final T2 t2)
        {
            return new S5T2<>(t2);
        }

        /**
         * Returns a 5-value sum.
         * 
         * @param  t3   value 3
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * @param  <T4> the type of value 4
         * @param  <T5> the type of value 5
         * 
         * @return      a 5-value sum
         */
        public static final <T1, T2, T3, T4, T5> S5<T1, T2, T3, T4, T5> s5t3(
                final T3 t3)
        {
            return new S5T3<>(t3);
        }

        /**
         * Returns a 5-value sum.
         * 
         * @param  t4   value 4
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * @param  <T4> the type of value 4
         * @param  <T5> the type of value 5
         * 
         * @return      a 5-value sum
         */
        public static final <T1, T2, T3, T4, T5> S5<T1, T2, T3, T4, T5> s5t4(
                final T4 t4)
        {
            return new S5T4<>(t4);
        }

        /**
         * Returns a 5-value sum.
         * 
         * @param  t5   value 5
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * @param  <T4> the type of value 4
         * @param  <T5> the type of value 5
         * 
         * @return      a 5-value sum
         */
        public static final <T1, T2, T3, T4, T5> S5<T1, T2, T3, T4, T5> s5t5(
                final T5 t5)
        {
            return new S5T5<>(t5);
        }

        private static final class S5T1<T1, T2, T3, T4, T5> extends Default<T1, T2, T3, T4, T5>
        {
            private final T1 t1;

            private S5T1(
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
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5)
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
                    final F1E<T5, R1, E> fT5)
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
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5)
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
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5)
                    throws E
            {
                fT1.f(t1);
            }
        }

        private static final class S5T2<T1, T2, T3, T4, T5> extends Default<T1, T2, T3, T4, T5>
        {
            private final T2 t2;

            private S5T2(
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
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5)
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
                    final F1E<T5, R1, E> fT5)
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
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5)
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
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5)
                    throws E
            {
                fT2.f(t2);
            }
        }

        private static final class S5T3<T1, T2, T3, T4, T5> extends Default<T1, T2, T3, T4, T5>
        {
            private final T3 t3;

            private S5T3(
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
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5)
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
                    final F1E<T5, R1, E> fT5)
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
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5)
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
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5)
                    throws E
            {
                fT3.f(t3);
            }
        }

        private static final class S5T4<T1, T2, T3, T4, T5> extends Default<T1, T2, T3, T4, T5>
        {
            private final T4 t4;

            private S5T4(
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
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5)
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
                    final F1E<T5, R1, E> fT5)
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
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5)
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
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5)
                    throws E
            {
                fT4.f(t4);
            }
        }

        private static final class S5T5<T1, T2, T3, T4, T5> extends Default<T1, T2, T3, T4, T5>
        {
            private final T5 t5;

            private S5T5(
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
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2,
                    final F1<T3, R1> fT3,
                    final F1<T4, R1> fT4,
                    final F1<T5, R1> fT5)
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
                    final F1E<T5, R1, E> fT5)
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
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2,
                    final E1<T3> fT3,
                    final E1<T4> fT4,
                    final E1<T5> fT5)
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
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2,
                    final E1E<T3, E> fT3,
                    final E1E<T4, E> fT4,
                    final E1E<T5, E> fT5)
                    throws E
            {
                fT5.f(t5);
            }
        }
    }
}
