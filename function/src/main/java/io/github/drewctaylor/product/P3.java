package io.github.drewctaylor.product;

import io.github.drewctaylor.effect.E3;
import io.github.drewctaylor.effect.exception.E3E;
import io.github.drewctaylor.function.F3;
import io.github.drewctaylor.function.exception.F3E;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 3-value product.
 * 
 * @param <T1> the type of value 1
 * @param <T2> the type of value 2
 * @param <T3> the type of value 3
 */
public interface P3<T1, T2, T3>
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
            final F3<T1, T2, T3, R1> f);

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
            final F3E<T1, T2, T3, R1, E> f)
            throws E;

    /**
     * Executes the given effect when given the values of this product as input.
     * 
     * @param f the given effect
     */
    void matchEffect(
            final E3<T1, T2, T3> f);

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
            final E3E<T1, T2, T3, E> f)
            throws E;

    /**
     * A default 3-value product.
     * 
     * @param <T1> the type of value 1
     * @param <T2> the type of value 2
     * @param <T3> the type of value 3
     */
    final class Default<T1, T2, T3> implements P3<T1, T2, T3>
    {
        private final T1 v1;

        private final T2 v2;

        private final T3 v3;

        private Default(
                final T1 v1,
                final T2 v2,
                final T3 v3)
        {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
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
         * Returns the output of the given function when given the values of this product as input.
         * 
         * @param  f    the given function
         * @param  <R1> the type of the output value
         * 
         * @return      return the output of the given function when given the values of this product as input
         */
        public <R1> R1 match(
                final F3<T1, T2, T3, R1> f)
        {
            requireNonNull(f, "f");

            return f.f(v1, v2, v3);
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
                final F3E<T1, T2, T3, R1, E> f)
                throws E
        {
            requireNonNull(f, "f");

            return f.f(v1, v2, v3);
        }

        /**
         * Executes the given effect when given the values of this product as input.
         * 
         * @param f the given effect
         */
        public void matchEffect(
                final E3<T1, T2, T3> f)
        {
            requireNonNull(f, "f");

            f.f(v1, v2, v3);
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
                final E3E<T1, T2, T3, E> f)
                throws E
        {
            requireNonNull(f, "f");

            f.f(v1, v2, v3);
        }

        /**
         * Returns a 3-value product.
         * 
         * @param  v1   value 1
         * @param  v2   value 2
         * @param  v3   value 3
         * @param  <T1> the type of value 1
         * @param  <T2> the type of value 2
         * @param  <T3> the type of value 3
         * 
         * @return      a 3-value product
         */
        public static <T1, T2, T3> P3<T1, T2, T3> p(
                final T1 v1,
                final T2 v2,
                final T3 v3)
        {
            return new Default<>(v1, v2, v3);
        }

        /**
         * Returns a form of this product where the order of values is reversed.
         * 
         * @return a form of this product where the order of values is reversed
         */
        public P3<T3, T2, T1> reverse()
        {
            return P3.reverse(this, Default::new);
        }
    }
}
