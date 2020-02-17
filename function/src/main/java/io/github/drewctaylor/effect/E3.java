package io.github.drewctaylor.effect;

import io.github.drewctaylor.function.F1;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 3-parameter effect.
 * 
 * @param <P1> the type of parameter 1
 * @param <P2> the type of parameter 2
 * @param <P3> the type of parameter 3
 */
@FunctionalInterface
public interface E3<P1, P2, P3>
{
    /**
     * Executes this effect.
     * 
     * @param p1 the value of parameter 1
     * @param p2 the value of parameter 2
     * @param p3 the value of parameter 3
     */
    void f(
            final P1 p1,
            final P2 p2,
            final P3 p3);

    /**
     * Returns a form of the given effect that is of this effect type.
     * 
     * @param  e3                   the given effect
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <P3>                 the type of parameter 3
     * @return                      a form of the given effect that is of this effect type
     * @throws NullPointerException if e3 is null
     */
    static <P1, P2, P3> E3<P1, P2, P3> e3(
            final E3<P1, P2, P3> e3)
    {
        requireNonNull(e3, "e3");
        return e3;
    }

    /**
     * Returns an effect that does nothing.
     * 
     * @param  <P1> the type of parameter 1
     * @param  <P2> the type of parameter 2
     * @param  <P3> the type of parameter 3
     * @return      an effect that does nothing
     */
    static <P1, P2, P3> E3<P1, P2, P3> nop()
    {
        return (
                p1,
                p2,
                p3) ->
        {
        };
    }

    /**
     * Returns a form of this effect with the value of parameter 1 fixed to the given value.
     * 
     * @param  p1 the given value
     * @return    a form of this effect with the value of parameter 1 fixed to the given value
     */
    default E2<P2, P3> a(
            final P1 p1)
    {
        return (
                p2,
                p3) -> f(p1, p2, p3);
    }

    /**
     * Returns a form of this effect where the order of the parameters is reversed.
     * 
     * @return a form of this effect where the order of the parameters is reversed
     */
    default E3<P3, P2, P1> reverse()
    {
        return (
                p3,
                p2,
                p1) -> f(p1, p2, p3);
    }

    /**
     * Returns a curried form of this effect.
     * 
     * @return a curried form of this effect
     */
    default F1<P1, F1<P2, E1<P3>>> curry()
    {
        return p1 -> p2 -> p3 -> f(p1, p2, p3);
    }

    /**
     * Returns an uncurried form of the given effect.
     * 
     * @param  f1                   the given effect
     * @param  <P1>                 the type of parameter 1
     * @param  <P2>                 the type of parameter 2
     * @param  <P3>                 the type of parameter 3
     * @return                      an uncurried form of the given effect
     * @throws NullPointerException if f1 is null
     */
    static <P1, P2, P3> E3<P1, P2, P3> uncurry(
            final F1<P1, F1<P2, E1<P3>>> f1)
    {
        requireNonNull(f1, "f1");
        return (
                p1,
                p2,
                p3) -> f1.f(p1).f(p2).f(p3);
    }
}
