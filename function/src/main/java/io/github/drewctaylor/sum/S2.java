package io.github.drewctaylor.sum;

import io.github.drewctaylor.effect.E1;
import io.github.drewctaylor.effect.exception.E1E;
import io.github.drewctaylor.function.F1;
import io.github.drewctaylor.function.exception.F1E;

/**
 * A 2-value sum.
 * 
 * @param <T1> the type of value 1
 * @param <T2> the type of value 2
 */
public interface S2<T1, T2>
{
    /**
     * Return the output of the given function when given the value of this sum as input.
     * 
     * @param  fT1  the function to apply to value 1
     * @param  fT2  the function to apply to value 2
     * @param  <R1> the type of the output value
     * 
     * @return      the output of the given function when given the value of this sum as input
     */
    <R1> R1 match(
            final F1<T1, R1> fT1,
            final F1<T2, R1> fT2);

    /**
     * Return the output of the given function when given the value of this sum as input.
     * 
     * @param  fT1  the function to apply to value 1
     * @param  fT2  the function to apply to value 2
     * @param  <R1> the type of the output value
     * @param  <E>  the type of the exception
     * 
     * @return      the output of the given function when given the value of this sum as input
     * 
     * @throws E    if the given function throws an exception
     */
    <R1, E extends Exception> R1 matchException(
            final F1E<T1, R1, E> fT1,
            final F1E<T2, R1, E> fT2)
            throws E;

    /**
     * Executes the given effect when given the value of this sum as input.
     * 
     * @param fT1 the effect to apply to value 1
     * @param fT2 the effect to apply to value 2
     */
    void matchEffect(
            final E1<T1> fT1,
            final E1<T2> fT2);

    /**
     * Executes the given effect when given the value of this sum as input.
     * 
     * @param  fT1 the effect to apply to value 1
     * @param  fT2 the effect to apply to value 2
     * @param  <E> the type of the exception
     * 
     * @throws E   if the given effect throws an exception
     */
    <E extends Exception> void matchEffectException(
            final E1E<T1, E> fT1,
            final E1E<T2, E> fT2)
            throws E;

    /**
     * A default 2-value sum.
     * 
     * @param <T1> the type of value 1
     * @param <T2> the type of value 2
     */
    abstract class Default<T1, T2> implements S2<T1, T2>
    {
        private Default()
        {
        }

        /**
         * Returns a 2-value sum.
         * 
         * @param  t1   value 1
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * 
         * @return      a 2-value sum
         */
        public static final <T1, T2> S2<T1, T2> s2t1(
                final T1 t1)
        {
            return new S2T1<>(t1);
        }

        /**
         * Returns a 2-value sum.
         * 
         * @param  t2   value 2
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * 
         * @return      a 2-value sum
         */
        public static final <T1, T2> S2<T1, T2> s2t2(
                final T2 t2)
        {
            return new S2T2<>(t2);
        }

        private static final class S2T1<T1, T2> extends Default<T1, T2>
        {
            private final T1 t1;

            private S2T1(
                    final T1 t1)
            {
                this.t1 = t1;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2)
            {
                return fT1.f(t1);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2)
                    throws E
            {
                return fT1.f(t1);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1 the effect to apply to value 1
             * @param fT2 the effect to apply to value 2
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2)
            {
                fT1.f(t1);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1 the effect to apply to value 1
             * @param  fT2 the effect to apply to value 2
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2)
                    throws E
            {
                fT1.f(t1);
            }
        }

        private static final class S2T2<T1, T2> extends Default<T1, T2>
        {
            private final T2 t2;

            private S2T2(
                    final T2 t2)
            {
                this.t2 = t2;
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  <R1> the type of the output value
             * 
             * @return      the output of the given function when given the value of this sum as input
             */
            public <R1> R1 match(
                    final F1<T1, R1> fT1,
                    final F1<T2, R1> fT2)
            {
                return fT2.f(t2);
            }

            /**
             * Return the output of the given function when given the value of this sum as input.
             * 
             * @param  fT1  the function to apply to value 1
             * @param  fT2  the function to apply to value 2
             * @param  <R1> the type of the output value
             * @param  <E>  the type of the exception
             * 
             * @return      the output of the given function when given the value of this sum as input
             * 
             * @throws E    if the given function throws an exception
             */
            public <R1, E extends Exception> R1 matchException(
                    final F1E<T1, R1, E> fT1,
                    final F1E<T2, R1, E> fT2)
                    throws E
            {
                return fT2.f(t2);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param fT1 the effect to apply to value 1
             * @param fT2 the effect to apply to value 2
             */
            public void matchEffect(
                    final E1<T1> fT1,
                    final E1<T2> fT2)
            {
                fT2.f(t2);
            }

            /**
             * Executes the given effect when given the value of this sum as input.
             * 
             * @param  fT1 the effect to apply to value 1
             * @param  fT2 the effect to apply to value 2
             * @param  <E> the type of the exception
             * 
             * @throws E   if the given effect throws an exception
             */
            public <E extends Exception> void matchEffectException(
                    final E1E<T1, E> fT1,
                    final E1E<T2, E> fT2)
                    throws E
            {
                fT2.f(t2);
            }
        }
    }
}
