package io.github.drewctaylor.function.test;

import io.github.drewctaylor.function.F1;
import io.github.drewctaylor.function.F2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

final class FunctionTest
{
    @Test
    void testThen()
    {
        final F1<String, Integer> length = String::length;
        final F1<String, Boolean> nonEmpty = length.then(i -> i > 0);
        assertFalse(nonEmpty.f(""));
        assertTrue(nonEmpty.f("abc"));
    }

    @Test
    void testC()
    {
        final F1<String, Integer> constant0a = F1.constant(0);
        final F1<String, Integer> constant0b = F1.c(0);
        assertEquals(0, constant0a.f("abc"));
        assertEquals(0, constant0b.f("abc"));
    }

    @Test
    void testId()
    {
        final F1<Integer, Integer> id1 = F1.identity();
        final F1<Integer, Integer> id2 = F1.c();
        assertEquals(1, id1.f(1));
        assertEquals(1, id2.f(1));
    }

    @Test
    void testA()
    {
        final F2<String, Character, Integer> indexOf = (
                string,
                character) -> string.indexOf(String.valueOf(character));
        final F1<Character, Integer> alphabetIndexOf = indexOf.a("abcdefghijklmnopqrstuvwxyz");
        assertEquals(0, alphabetIndexOf.f('a'));
        assertEquals(1, alphabetIndexOf.f('b'));
    }

    @Test
    void testReverse()
    {
        final F2<String, Character, Boolean> contains1 = (
                s,
                c) -> s.contains(String.valueOf(c));
        final F2<Character, String, Boolean> contains2 = contains1.reverse();
        assertTrue(contains1.f("abc", 'a'));
        assertTrue(contains2.f('a', "abc"));
    }

    @Test
    void testCurry()
    {
        final F2<String, Character, Boolean> contains1 = (
                s,
                c) -> s.contains(String.valueOf(c));
        final F1<String, F1<Character, Boolean>> contains2 = contains1.curry();
        assertTrue(contains1.f("abc", 'a'));
        assertTrue(contains2.f("abc").f('a'));
    }

    @Test
    void testUncurry()
    {
        final F1<String, F1<Character, Boolean>> contains1 = s -> c -> s.contains(String.valueOf(c));
        final F2<String, Character, Boolean> contains2 = F2.uncurry(contains1);
        assertTrue(contains1.f("abc").f('a'));
        assertTrue(contains2.f("abc", 'a'));
    }

}
