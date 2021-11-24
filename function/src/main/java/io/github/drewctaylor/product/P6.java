package io.github.drewctaylor.product;

import io.github.drewctaylor.effect.E6;
import io.github.drewctaylor.effect.exception.E6E;
import io.github.drewctaylor.function.F6;
import io.github.drewctaylor.function.exception.F6E;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 6-value product.
 * 
 * @param <T1> the type of value 1
 * @param <T2> the type of value 2
 * @param <T3> the type of value 3
 * @param <T4> the type of value 4
 * @param <T5> the type of value 5
 * @param <T6> the type of value 6
 */
public interface P6<T1, T2, T3, T4, T5, T6>
{
    /**
     * Returns the output of the given function when given the values of this product as input.
     * 
     * @param  f    the given function
     * @param  <R1> the type of the output value
     * 
     * @return      return the output of the given function when given the values of this product as input
     */
    <R1> R1 match(
            final F6<T1, T2, T3, T4, T5, T6, R1> f);

    /**
     * Returns the output of the given function when given the values of this product as input.
     * 
     * @param  f                              the given function
     * @param  <R1>                           the type of the output value
     * @param  <E>                            the type of the exception
     * 
     * @return                                return the output of the given function when given the values of this product
     *                                        as input
     * 
     * @throws java.lang.NullPointerException if the given function is null
     * @throws E                              if the given function throws an exception
     */
    <R1, E extends Exception> R1 matchException(
            final F6E<T1, T2, T3, T4, T5, T6, R1, E> f)
            throws E;

    /**
     * Executes the given effect when given the values of this product as input.
     * 
     * @param f the given effect
     */
    void matchEffect(
            final E6<T1, T2, T3, T4, T5, T6> f);

    /**
     * Executes the given effect when given the values of this product as input.
     * 
     * @param  f                              the given effect
     * @param  <E>                            the type of the exception
     * 
     * @throws java.lang.NullPointerException if the given effect is null
     * @throws E                              if the given effect throws an exception
     */
    <E extends Exception> void matchEffectException(
            final E6E<T1, T2, T3, T4, T5, T6, E> f)
            throws E;

    /**
     * A default 6-value product.
     * 
     * @param <T1> the type of value 1
     * @param <T2> the type of value 2
     * @param <T3> the type of value 3
     * @param <T4> the type of value 4
     * @param <T5> the type of value 5
     * @param <T6> the type of value 6
     */
    final class Default<T1, T2, T3, T4, T5, T6> implements P6<T1, T2, T3, T4, T5, T6>
    {
        private final T1 v1;

        private final T2 v2;

        private final T3 v3;

        private final T4 v4;

        private final T5 v5;

        private final T6 v6;

        private Default(
                final T1 v1,
                final T2 v2,
                final T3 v3,
                final T4 v4,
                final T5 v5,
                final T6 v6)
        {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
            this.v4 = v4;
            this.v5 = v5;
            this.v6 = v6;
        }

        /**
         * Returns value 1.
         * 
         * @return return value 1
         */
        public T1 v1()
        {
            return v1;
        }

        /**
         * Returns value 2.
         * 
         * @return return value 2
         */
        public T2 v2()
        {
            return v2;
        }

        /**
         * Returns value 3.
         * 
         * @return return value 3
         */
        public T3 v3()
        {
            return v3;
        }

        /**
         * Returns value 4.
         * 
         * @return return value 4
         */
        public T4 v4()
        {
            return v4;
        }

        /**
         * Returns value 5.
         * 
         * @return return value 5
         */
        public T5 v5()
        {
            return v5;
        }

        /**
         * Returns value 6.
         * 
         * @return return value 6
         */
        public T6 v6()
        {
            return v6;
        }

        /**
         * Returns the output of the given function when given the values of this product as input.
         * 
         * @param  f    the given function
         * @param  <R1> the type of the output value
         * 
         * @return      return the output of the given function when given the values of this product as input
         */
        public <R1> R1 match(
                final F6<T1, T2, T3, T4, T5, T6, R1> f)
        {
            requireNonNull(f, "f");

            return f.f(v1, v2, v3, v4, v5, v6);
        }

        /**
         * Returns the output of the given function when given the values of this product as input.
         * 
         * @param  f                              the given function
         * @param  <R1>                           the type of the output value
         * @param  <E>                            the type of the exception
         * 
         * @return                                return the output of the given function when given the values of this product
         *                                        as input
         * 
         * @throws java.lang.NullPointerException if the given function is null
         * @throws E                              if the given function throws an exception
         */
        public <R1, E extends Exception> R1 matchException(
                final F6E<T1, T2, T3, T4, T5, T6, R1, E> f)
                throws E
        {
            requireNonNull(f, "f");

            return f.f(v1, v2, v3, v4, v5, v6);
        }

        /**
         * Executes the given effect when given the values of this product as input.
         * 
         * @param f the given effect
         */
        public void matchEffect(
                final E6<T1, T2, T3, T4, T5, T6> f)
        {
            requireNonNull(f, "f");

            f.f(v1, v2, v3, v4, v5, v6);
        }

        /**
         * Executes the given effect when given the values of this product as input.
         * 
         * @param  f                              the given effect
         * @param  <E>                            the type of the exception
         * 
         * @throws java.lang.NullPointerException if the given effect is null
         * @throws E                              if the given effect throws an exception
         */
        public <E extends Exception> void matchEffectException(
                final E6E<T1, T2, T3, T4, T5, T6, E> f)
                throws E
        {
            requireNonNull(f, "f");

            f.f(v1, v2, v3, v4, v5, v6);
        }

        /**
         * Returns a 6-value product.
         * 
         * @param  v1   value 1
         * @param  v2   value 2
         * @param  v3   value 3
         * @param  v4   value 4
         * @param  v5   value 5
         * @param  v6   value 6
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * @param  <T4> the type of value 4
         * @param  <T5> the type of value 5
         * @param  <T6> the type of value 6
         * 
         * @return      a 6-value product
         */
        public static <T1, T2, T3, T4, T5, T6> P6<T1, T2, T3, T4, T5, T6> p(
                final T1 v1,
                final T2 v2,
                final T3 v3,
                final T4 v4,
                final T5 v5,
                final T6 v6)
        {
            return new Default<>(v1, v2, v3, v4, v5, v6);
        }

        /**
         * Returns a form of this product where the order of values is reversed.
         * 
         * @return a form of this product where the order of values is reversed
         */
        public P6<T6, T5, T4, T3, T2, T1> reverse()
        {
            return P6.reverse(this, Default::new);
        }
    }
}
