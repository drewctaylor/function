package io.github.drewctaylor.effect;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 0-parameter effect.
 */
@FunctionalInterface
public interface E0
{
    /**
     * Executes this effect.
     */
    void f();

    /**
     * Returns a form of the given effect that is of this effect type.
     * 
     * @param  e0                   the given effect
     * 
     * @return                      a form of the given effect that is of this effect type
     * 
     * @throws NullPointerException if e0 is null
     */
    static E0 e0(
            final E0 e0)
    {
        requireNonNull(e0, "e0");
        return e0;
    }

    /**
     * Returns an effect that does nothing.
     * 
     * @return an effect that does nothing
     */
    static E0 nop()
    {
        return () ->
        {
        };
    }
}
