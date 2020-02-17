package io.github.drewctaylor.effect.exception;

import static io.github.drewctaylor.require.Require.requireNonNull;

/**
 * A 1-parameter effect that may throw an exception.
 * 
 * @param <P1> the type of parameter 1
 * @param <E>  the type of the exception
 */
@FunctionalInterface
public interface E1E<P1, E extends Exception>
{
    /**
     * Executes this effect.
     * 
     * @param  p1 the value of parameter 1
     * @throws E  the exception
     */
    void f(
            final P1 p1)
            throws E;

    /**
     * Returns a form of the given effect that is of this effect type.
     * 
     * @param  e1e                  the given effect
     * @param  <P1>                 the type of parameter 1
     * @param  <E>                  the type of the exception
     * @return                      a form of the given effect that is of this effect type
     * @throws NullPointerException if e1e is null
     */
    static <P1, E extends Exception> E1E<P1, E> e1e(
            final E1E<P1, E> e1e)
    {
        requireNonNull(e1e, "e1e");
        return e1e;
    }

    /**
     * Returns an effect that does nothing.
     * 
     * @param  <P1> the type of parameter 1
     * @param  <E>  the type of the exception
     * @return      an effect that does nothing
     */
    static <P1, E extends Exception> E1E<P1, E> nop()
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
     * @return    a form of this effect with the value of parameter 1 fixed to the given value
     */
    default E0E<E> a(
            final P1 p1)
    {
        return () -> f(p1);
    }

    /**
     * Returns an effect that throws the given exception
     * 
     * @param  e                    the given exception
     * @param  <P1>                 the type of parameter 1
     * @param  <E>                  the type of the exception
     * @return                      an effect that throws the given exception
     * @throws NullPointerException if e is null
     */
    static <P1, E extends Exception> E1E<P1, E> e(
            final E e)
    {
        requireNonNull(e, "e");
        return (
                p1) ->
        {
            throw e;
        };
    }
}
