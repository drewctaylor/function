package io.github.drewctaylor.effect;

import java.util.function.Consumer;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 1-parameter effect.
 * 
 * @param <P1> the type of parameter 1
 */
@FunctionalInterface
public interface E1<P1> extends Consumer<P1>
{
    /**
     * Executes this effect.
     * 
     * @param p1 the value of parameter 1
     */
    void f(
            final P1 p1);

    /**
     * Returns a form of the given effect that is of this effect type.
     * 
     * @param  e1                   the given effect
     * @param  <P1>                 the type of parameter 1
     * 
     * @return                      a form of the given effect that is of this effect type
     * 
     * @throws NullPointerException if e1 is null
     */
    static <P1> E1<P1> e1(
            final E1<P1> e1)
    {
        requireNonNull(e1, "e1");
        return e1;
    }

    /**
     * Returns an effect that does nothing.
     * 
     * @param  <P1> the type of parameter 1
     * 
     * @return      an effect that does nothing
     */
    static <P1> E1<P1> nop()
    {
        return (
                p1) ->
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
    default E0 a(
            final P1 p1)
    {
        return () -> f(p1);
    }

    @Override
    default void accept(
            final P1 p1)
    {
        f(p1);
    }
}
