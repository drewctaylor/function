package io.github.drewctaylor.product;

import io.github.drewctaylor.effect.E24;
import io.github.drewctaylor.effect.exception.E24E;
import io.github.drewctaylor.function.F24;
import io.github.drewctaylor.function.exception.F24E;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 24-value product.
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
 */
public interface P24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24>
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
            final F24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R1> f);

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
            final F24E<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R1, E> f)
            throws E;

    /**
     * Executes the given effect when given the values of this product as input.
     * 
     * @param f the given effect
     */
    void matchEffect(
            final E24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> f);

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
            final E24E<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, E> f)
            throws E;

    /**
     * A default 24-value product.
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
     */
    final class Default<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> implements P24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24>
    {
        private final T1 v1;

        private final T2 v2;

        private final T3 v3;

        private final T4 v4;

        private final T5 v5;

        private final T6 v6;

        private final T7 v7;

        private final T8 v8;

        private final T9 v9;

        private final T10 v10;

        private final T11 v11;

        private final T12 v12;

        private final T13 v13;

        private final T14 v14;

        private final T15 v15;

        private final T16 v16;

        private final T17 v17;

        private final T18 v18;

        private final T19 v19;

        private final T20 v20;

        private final T21 v21;

        private final T22 v22;

        private final T23 v23;

        private final T24 v24;

        private Default(
                final T1 v1,
                final T2 v2,
                final T3 v3,
                final T4 v4,
                final T5 v5,
                final T6 v6,
                final T7 v7,
                final T8 v8,
                final T9 v9,
                final T10 v10,
                final T11 v11,
                final T12 v12,
                final T13 v13,
                final T14 v14,
                final T15 v15,
                final T16 v16,
                final T17 v17,
                final T18 v18,
                final T19 v19,
                final T20 v20,
                final T21 v21,
                final T22 v22,
                final T23 v23,
                final T24 v24)
        {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
            this.v4 = v4;
            this.v5 = v5;
            this.v6 = v6;
            this.v7 = v7;
            this.v8 = v8;
            this.v9 = v9;
            this.v10 = v10;
            this.v11 = v11;
            this.v12 = v12;
            this.v13 = v13;
            this.v14 = v14;
            this.v15 = v15;
            this.v16 = v16;
            this.v17 = v17;
            this.v18 = v18;
            this.v19 = v19;
            this.v20 = v20;
            this.v21 = v21;
            this.v22 = v22;
            this.v23 = v23;
            this.v24 = v24;
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
         * Returns value 7.
         * 
         * @return return value 7
         */
        public T7 v7()
        {
            return v7;
        }

        /**
         * Returns value 8.
         * 
         * @return return value 8
         */
        public T8 v8()
        {
            return v8;
        }

        /**
         * Returns value 9.
         * 
         * @return return value 9
         */
        public T9 v9()
        {
            return v9;
        }

        /**
         * Returns value 10.
         * 
         * @return return value 10
         */
        public T10 v10()
        {
            return v10;
        }

        /**
         * Returns value 11.
         * 
         * @return return value 11
         */
        public T11 v11()
        {
            return v11;
        }

        /**
         * Returns value 12.
         * 
         * @return return value 12
         */
        public T12 v12()
        {
            return v12;
        }

        /**
         * Returns value 13.
         * 
         * @return return value 13
         */
        public T13 v13()
        {
            return v13;
        }

        /**
         * Returns value 14.
         * 
         * @return return value 14
         */
        public T14 v14()
        {
            return v14;
        }

        /**
         * Returns value 15.
         * 
         * @return return value 15
         */
        public T15 v15()
        {
            return v15;
        }

        /**
         * Returns value 16.
         * 
         * @return return value 16
         */
        public T16 v16()
        {
            return v16;
        }

        /**
         * Returns value 17.
         * 
         * @return return value 17
         */
        public T17 v17()
        {
            return v17;
        }

        /**
         * Returns value 18.
         * 
         * @return return value 18
         */
        public T18 v18()
        {
            return v18;
        }

        /**
         * Returns value 19.
         * 
         * @return return value 19
         */
        public T19 v19()
        {
            return v19;
        }

        /**
         * Returns value 20.
         * 
         * @return return value 20
         */
        public T20 v20()
        {
            return v20;
        }

        /**
         * Returns value 21.
         * 
         * @return return value 21
         */
        public T21 v21()
        {
            return v21;
        }

        /**
         * Returns value 22.
         * 
         * @return return value 22
         */
        public T22 v22()
        {
            return v22;
        }

        /**
         * Returns value 23.
         * 
         * @return return value 23
         */
        public T23 v23()
        {
            return v23;
        }

        /**
         * Returns value 24.
         * 
         * @return return value 24
         */
        public T24 v24()
        {
            return v24;
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
                final F24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R1> f)
        {
            requireNonNull(f, "f");

            return f.f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24);
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
                final F24E<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R1, E> f)
                throws E
        {
            requireNonNull(f, "f");

            return f.f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24);
        }

        /**
         * Executes the given effect when given the values of this product as input.
         * 
         * @param f the given effect
         */
        public void matchEffect(
                final E24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> f)
        {
            requireNonNull(f, "f");

            f.f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24);
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
                final E24E<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, E> f)
                throws E
        {
            requireNonNull(f, "f");

            f.f(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24);
        }

        /**
         * Returns a 24-value product.
         * 
         * @param  v1    value 1
         * @param  v2    value 2
         * @param  v3    value 3
         * @param  v4    value 4
         * @param  v5    value 5
         * @param  v6    value 6
         * @param  v7    value 7
         * @param  v8    value 8
         * @param  v9    value 9
         * @param  v10   value 10
         * @param  v11   value 11
         * @param  v12   value 12
         * @param  v13   value 13
         * @param  v14   value 14
         * @param  v15   value 15
         * @param  v16   value 16
         * @param  v17   value 17
         * @param  v18   value 18
         * @param  v19   value 19
         * @param  v20   value 20
         * @param  v21   value 21
         * @param  v22   value 22
         * @param  v23   value 23
         * @param  v24   value 24
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
         * 
         * @return       a 24-value product
         */
        public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p(
                final T1 v1,
                final T2 v2,
                final T3 v3,
                final T4 v4,
                final T5 v5,
                final T6 v6,
                final T7 v7,
                final T8 v8,
                final T9 v9,
                final T10 v10,
                final T11 v11,
                final T12 v12,
                final T13 v13,
                final T14 v14,
                final T15 v15,
                final T16 v16,
                final T17 v17,
                final T18 v18,
                final T19 v19,
                final T20 v20,
                final T21 v21,
                final T22 v22,
                final T23 v23,
                final T24 v24)
        {
            return new Default<>(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24);
        }

        /**
         * Returns a form of this product where the order of values is reversed.
         * 
         * @return a form of this product where the order of values is reversed
         */
        public P24<T24, T23, T22, T21, T20, T19, T18, T17, T16, T15, T14, T13, T12, T11, T10, T9, T8, T7, T6, T5, T4, T3, T2, T1> reverse()
        {
            return P24.reverse(this, Default::new);
        }
    }
}
