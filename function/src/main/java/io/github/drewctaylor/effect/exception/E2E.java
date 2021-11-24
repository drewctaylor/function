package io.github.drewctaylor.effect.exception;

import io.github.drewctaylor.function.F1;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 2-parameter effect that may throw an exception.
 * 
 * @param <P1> the type of parameter 1
 * @param <P2> the type of parameter 2
 * @param <E>  the type of the exception
 */
@FunctionalInterface
public interface E2E<P1, P2, E extends Exception>
{
    /**
     * Executes this effect.
     * 
     * @param  p1 the value of parameter 1
     * @param  p2 the value of parameter 2
     * 
     * @throws E  the exception
     */
    void f(
            final P1 p1,
            final P2 p2)
            throws E;

    /**
     * Returns a form of the given effect that is of this effect type.
     * 
     * @param  e2e                  the given effect
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <E>                  the type of the exception
     * 
     * @return                      a form of the given effect that is of this effect type
     * 
     * @throws NullPointerException if e2e is null
     */
    static <P1, P2, E extends Exception> E2E<P1, P2, E> e2e(
            final E2E<P1, P2, E> e2e)
    {
        requireNonNull(e2e, "e2e");
        return e2e;
    }

    /**
     * Returns an effect that does nothing.
     * 
     * @param  <P1> the type of parameter 1
     * @param  <P2> the type of parameter 2
     * @param  <E>  the type of the exception
     * 
     * @return      an effect that does nothing
     */
    static <P1, P2, E extends Exception> E2E<P1, P2, E> nop()
    {
        return (
                p1,
                p2) ->
        {
        };
    }

    /**
     * Returns a form of this effect with the value of parameter 1 fixed to the given value.
     * 
     * @param  p1 the given value
     * 
     * @return    a form of this effect with the value of parameter 1 fixed to the given value
     */
    default E1E<P2, E> a(
            final P1 p1)
    {
        return (
                p2) -> f(p1, p2);
    }

    /**
     * Returns a form of this effect where the order of the parameters is reversed.
     * 
     * @return a form of this effect where the order of the parameters is reversed
     */
    default E2E<P2, P1, E> reverse()
    {
        return (
                p2,
                p1) -> f(p1, p2);
    }

    /**
     * Returns a curried form of this effect.
     * 
     * @return a curried form of this effect
     */
    default F1<P1, E1E<P2, E>> curry()
    {
        return p1 -> p2 -> f(p1, p2);
    }

    /**
     * Returns an uncurried form of the given effect.
     * 
     * @param  f1                   the given effect
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <E>                  the type of the exception
     * 
     * @return                      an uncurried form of the given effect
     * 
     * @throws NullPointerException if f1 is null
     */
    static <P1, P2, E extends Exception> E2E<P1, P2, E> uncurry(
            final F1<P1, E1E<P2, E>> f1)
    {
        requireNonNull(f1, "f1");
        return (
                p1,
                p2) -> f1.f(p1).f(p2);
    }

    /**
     * Returns an effect that throws the given exception.
     * 
     * @param  e                    the given exception
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <E>                  the type of the exception
     * 
     * @return                      an effect that throws the given exception
     * 
     * @throws NullPointerException if e is null
     */
    static <P1, P2, E extends Exception> E2E<P1, P2, E> e(
            final E e)
    {
        requireNonNull(e, "e");
        return (
                p1,
                p2) ->
        {
            throw e;
        };
    }
}
