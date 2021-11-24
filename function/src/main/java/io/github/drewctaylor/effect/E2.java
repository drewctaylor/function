package io.github.drewctaylor.effect;

import io.github.drewctaylor.function.F1;

import java.util.function.BiConsumer;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 2-parameter effect.
 * 
 * @param <P1> the type of parameter 1
 * @param <P2> the type of parameter 2
 */
@FunctionalInterface
public interface E2<P1, P2> extends BiConsumer<P1, P2>
{
    /**
     * Executes this effect.
     * 
     * @param p1 the value of parameter 1
     * @param p2 the value of parameter 2
     */
    void f(
            final P1 p1,
            final P2 p2);

    /**
     * Returns a form of the given effect that is of this effect type.
     * 
     * @param  e2                   the given effect
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * 
     * @return                      a form of the given effect that is of this effect type
     * 
     * @throws NullPointerException if e2 is null
     */
    static <P1, P2> E2<P1, P2> e2(
            final E2<P1, P2> e2)
    {
        requireNonNull(e2, "e2");
        return e2;
    }

    /**
     * Returns an effect that does nothing.
     * 
     * @param  <P1> the type of parameter 1
     * @param  <P2> the type of parameter 2
     * 
     * @return      an effect that does nothing
     */
    static <P1, P2> E2<P1, P2> nop()
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
    default E1<P2> a(
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
    default E2<P2, P1> reverse()
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
    default F1<P1, E1<P2>> curry()
    {
        return p1 -> p2 -> f(p1, p2);
    }

    /**
     * Returns an uncurried form of the given effect.
     * 
     * @param  f1                   the given effect
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * 
     * @return                      an uncurried form of the given effect
     * 
     * @throws NullPointerException if f1 is null
     */
    static <P1, P2> E2<P1, P2> uncurry(
            final F1<P1, E1<P2>> f1)
    {
        requireNonNull(f1, "f1");
        return (
                p1,
                p2) -> f1.f(p1).f(p2);
    }

    @Override
    default void accept(
            final P1 p1,
            final P2 p2)
    {
        f(p1, p2);
    }
}
