package io.github.drewctaylor.product;

import io.github.drewctaylor.effect.E2;
import io.github.drewctaylor.effect.exception.E2E;
import io.github.drewctaylor.function.F2;
import io.github.drewctaylor.function.exception.F2E;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 2-value product.
 * 
 * @param <T1> the type of value 1
 * @param <T2> the type of value 2
 */
public interface P2<T1, T2>
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
            final F2<T1, T2, R1> f);

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
            final F2E<T1, T2, R1, E> f)
            throws E;

    /**
     * Executes the given effect when given the values of this product as input.
     * 
     * @param f the given effect
     */
    void matchEffect(
            final E2<T1, T2> f);

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
            final E2E<T1, T2, E> f)
            throws E;

    /**
     * A default 2-value product.
     * 
     * @param <T1> the type of value 1
     * @param <T2> the type of value 2
     */
    final class Default<T1, T2> implements P2<T1, T2>
    {
        private final T1 v1;

        private final T2 v2;

        private Default(
                final T1 v1,
                final T2 v2)
        {
            this.v1 = v1;
            this.v2 = v2;
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
         * Returns the output of the given function when given the values of this product as input.
         * 
         * @param  f    the given function
         * @param  <R1> the type of the output value
         * 
         * @return      return the output of the given function when given the values of this product as input
         */
        public <R1> R1 match(
                final F2<T1, T2, R1> f)
        {
            requireNonNull(f, "f");

            return f.f(v1, v2);
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
                final F2E<T1, T2, R1, E> f)
                throws E
        {
            requireNonNull(f, "f");

            return f.f(v1, v2);
        }

        /**
         * Executes the given effect when given the values of this product as input.
         * 
         * @param f the given effect
         */
        public void matchEffect(
                final E2<T1, T2> f)
        {
            requireNonNull(f, "f");

            f.f(v1, v2);
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
                final E2E<T1, T2, E> f)
                throws E
        {
            requireNonNull(f, "f");

            f.f(v1, v2);
        }

        /**
         * Returns a 2-value product.
         * 
         * @param  v1   value 1
         * @param  v2   value 2
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * 
         * @return      a 2-value product
         */
        public static <T1, T2> P2<T1, T2> p(
                final T1 v1,
                final T2 v2)
        {
            return new Default<>(v1, v2);
        }

        /**
         * Returns a form of this product where the order of values is reversed.
         * 
         * @return a form of this product where the order of values is reversed
         */
        public P2<T2, T1> reverse()
        {
            return P2.reverse(this, Default::new);
        }
    }
}
