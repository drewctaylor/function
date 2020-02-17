package io.github.drewctaylor.effect.exception;

import io.github.drewctaylor.function.F1;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 5-parameter effect that may throw an exception.
 * 
 * @param <P1> the type of parameter 1
 * @param <P2> the type of parameter 2
 * @param <P3> the type of parameter 3
 * @param <P4> the type of parameter 4
 * @param <P5> the type of parameter 5
 * @param <E>  the type of the exception
 */
@FunctionalInterface
public interface E5E<P1, P2, P3, P4, P5, E extends Exception>
{
    /**
     * Executes this effect.
     * 
     * @param  p1 the value of parameter 1
     * @param  p2 the value of parameter 2
     * @param  p3 the value of parameter 3
     * @param  p4 the value of parameter 4
     * @param  p5 the value of parameter 5
     * @throws E  the exception
     */
    void f(
            final P1 p1,
            final P2 p2,
            final P3 p3,
            final P4 p4,
            final P5 p5)
            throws E;

    /**
     * Returns a form of the given effect that is of this effect type.
     * 
     * @param  e5e                  the given effect
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <P3>                 the type of parameter 3
     * @param  <P4>                 the type of parameter 4
     * @param  <P5>                 the type of parameter 5
     * @param  <E>                  the type of the exception
     * @return                      a form of the given effect that is of this effect type
     * @throws NullPointerException if e5e is null
     */
    static <P1, P2, P3, P4, P5, E extends Exception> E5E<P1, P2, P3, P4, P5, E> e5e(
            final E5E<P1, P2, P3, P4, P5, E> e5e)
    {
        requireNonNull(e5e, "e5e");
        return e5e;
    }

    /**
     * Returns an effect that does nothing.
     * 
     * @param  <P1> the type of parameter 1
     * @param  <P2> the type of parameter 2
     * @param  <P3> the type of parameter 3
     * @param  <P4> the type of parameter 4
     * @param  <P5> the type of parameter 5
     * @param  <E>  the type of the exception
     * @return      an effect that does nothing
     */
    static <P1, P2, P3, P4, P5, E extends Exception> E5E<P1, P2, P3, P4, P5, E> nop()
    {
        return (
                p1,
                p2,
                p3,
                p4,
                p5) ->
        {
        };
    }

    /**
     * Returns a form of this effect with the value of parameter 1 fixed to the given value.
     * 
     * @param  p1 the given value
     * @return    a form of this effect with the value of parameter 1 fixed to the given value
     */
    default E4E<P2, P3, P4, P5, E> a(
            final P1 p1)
    {
        return (
                p2,
                p3,
                p4,
                p5) -> f(p1, p2, p3, p4, p5);
    }

    /**
     * Returns a form of this effect where the order of the parameters is reversed.
     * 
     * @return a form of this effect where the order of the parameters is reversed
     */
    default E5E<P5, P4, P3, P2, P1, E> reverse()
    {
        return (
                p5,
                p4,
                p3,
                p2,
                p1) -> f(p1, p2, p3, p4, p5);
    }

    /**
     * Returns a curried form of this effect.
     * 
     * @return a curried form of this effect
     */
    default F1<P1, F1<P2, F1<P3, F1<P4, E1E<P5, E>>>>> curry()
    {
        return p1 -> p2 -> p3 -> p4 -> p5 -> f(p1, p2, p3, p4, p5);
    }

    /**
     * Returns an uncurried form of the given effect.
     * 
     * @param  f1                   the given effect
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <P3>                 the type of parameter 3
     * @param  <P4>                 the type of parameter 4
     * @param  <P5>                 the type of parameter 5
     * @param  <E>                  the type of the exception
     * @return                      an uncurried form of the given effect
     * @throws NullPointerException if f1 is null
     */
    static <P1, P2, P3, P4, P5, E extends Exception> E5E<P1, P2, P3, P4, P5, E> uncurry(
            final F1<P1, F1<P2, F1<P3, F1<P4, E1E<P5, E>>>>> f1)
    {
        requireNonNull(f1, "f1");
        return (
                p1,
                p2,
                p3,
                p4,
                p5) -> f1.f(p1).f(p2).f(p3).f(p4).f(p5);
    }

    /**
     * Returns an effect that throws the given exception
     * 
     * @param  e                    the given exception
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <P3>                 the type of parameter 3
     * @param  <P4>                 the type of parameter 4
     * @param  <P5>                 the type of parameter 5
     * @param  <E>                  the type of the exception
     * @return                      an effect that throws the given exception
     * @throws NullPointerException if e is null
     */
    static <P1, P2, P3, P4, P5, E extends Exception> E5E<P1, P2, P3, P4, P5, E> e(
            final E e)
    {
        requireNonNull(e, "e");
        return (
                p1,
                p2,
                p3,
                p4,
                p5) ->
        {
            throw e;
        };
    }
}
