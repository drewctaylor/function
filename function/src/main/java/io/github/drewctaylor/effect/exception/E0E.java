package io.github.drewctaylor.effect.exception;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 0-parameter effect that may throw an exception.
 * 
 * @param <E> the type of the exception
 */
@FunctionalInterface
public interface E0E<E extends Exception>
{
    /**
     * Executes this effect.
     * 
     * @throws E the exception
     */
    void f()
            throws E;

    /**
     * Returns a form of the given effect that is of this effect type.
     * 
     * @param  e0e                  the given effect
     * @param  <E>                  the type of the exception
     * 
     * @return                      a form of the given effect that is of this effect type
     * 
     * @throws NullPointerException if e0e is null
     */
    static <E extends Exception> E0E<E> e0e(
            final E0E<E> e0e)
    {
        requireNonNull(e0e, "e0e");
        return e0e;
    }

    /**
     * Returns an effect that does nothing.
     * 
     * @param  <E> the type of the exception
     * 
     * @return     an effect that does nothing
     */
    static <E extends Exception> E0E<E> nop()
    {
        return () ->
        {
        };
    }

    /**
     * Returns an effect that throws the given exception.
     * 
     * @param  e                    the given exception
     * @param  <E>                  the type of the exception
     * 
     * @return                      an effect that throws the given exception
     * 
     * @throws NullPointerException if e is null
     */
    static <E extends Exception> E0E<E> e(
            final E e)
    {
        requireNonNull(e, "e");
        return () ->
        {
            throw e;
        };
    }
}
