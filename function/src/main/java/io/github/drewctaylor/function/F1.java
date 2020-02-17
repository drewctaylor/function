package io.github.drewctaylor.function;

import java.util.function.Function;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 1-parameter function.
 * 
 * @param <P1> the type of parameter 1
 * @param <R1> the type of the output value
 */
@FunctionalInterface
public interface F1<P1, R1> extends Function<P1, R1>
{
    /**
     * Returns the output value of this function.
     * 
     * @param  p1 the value of parameter 1
     * @return    the output value of this function
     */
    R1 f(
            final P1 p1);

    /**
     * Returns a form of the given function that is of this function type.
     * 
     * @param  f1                   the given function
     * @param  <P1>                 the type of parameter 1
     * @param  <R1>                 the type of the output value
     * @return                      a form of the given function that is of this function type
     * @throws NullPointerException if f1 is null
     */
    static <P1, R1> F1<P1, R1> f1(
            final F1<P1, R1> f1)
    {
        requireNonNull(f1, "f1");
        return f1;
    }

    /**
     * Returns a function that returns its first parameter value as its output value.
     * 
     * @param  <P1> the type of parameter 1
     * @return      a function that returns its first parameter value as its output value
     */
    static <P1> F1<P1, P1> c()
    {
        return (
                p1) -> p1;
    }

    /**
     * Returns a function that returns its first parameter value as its output value.
     * 
     * @param  <P1> the type of parameter 1
     * @return      a function that returns its first parameter value as its output value
     */
    static <P1> F1<P1, P1> identity()
    {
        return (
                p1) -> p1;
    }

    /**
     * Returns a form of this function with the value of parameter 1 fixed to the given value.
     * 
     * @param  p1 the given value
     * @return    a form of this function with the value of parameter 1 fixed to the given value
     */
    default F0<R1> a(
            final P1 p1)
    {
        return () -> f(p1);
    }

    /**
     * Returns a function that is the given function composed with this function.
     * 
     * @param  f1                   the given function
     * @param  <R2>                 the type of the output value
     * @return                      a function that is the given function composed with this function
     * @throws NullPointerException if f1 is null
     */
    default <R2> F1<P1, R2> then(
            final F1<R1, R2> f1)
    {
        requireNonNull(f1, "f1");
        return (
                p1) -> f1.f(f(p1));
    }

    /**
     * Returns a function that returns the given value as its output value.
     * 
     * @param  r1   the given value
     * @param  <P1> the type of parameter 1
     * @param  <R1> the type of the output value
     * @return      a function that returns the given value as its output value
     */
    static <P1, R1> F1<P1, R1> c(
            final R1 r1)
    {
        return (
                p1) -> r1;
    }

    /**
     * Returns a function that returns the given value as its output value.
     * 
     * @param  r1   the given value
     * @param  <P1> the type of parameter 1
     * @param  <R1> the type of the output value
     * @return      a function that returns the given value as its output value
     */
    static <P1, R1> F1<P1, R1> constant(
            final R1 r1)
    {
        return (
                p1) -> r1;
    }

    @Override
    default R1 apply(
            final P1 p1)
    {
        return f(p1);
    }
}
