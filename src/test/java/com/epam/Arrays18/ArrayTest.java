package com.epam.Arrays18;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static com.epam.Arrays18.Array.getSymbols;
import static com.epam.Arrays18.Array2.getWordByIndex;
import static com.epam.Arrays18.Array3.printWordOne;
import static com.epam.Arrays18.Array4.evenElementsInArray;
import static org.junit.Assert.assertEquals;

public class ArrayTest {
    @Test
    public void testGetSymbols() {
        char[][] testArray = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };
        assertEquals("acgi", getSymbols(testArray));
        testArray = new char[][]{
                "ab".toCharArray(),
                "cd".toCharArray()
        };
        assertEquals("abcd", getSymbols(testArray));
        testArray = new char[][]{
                "abc".toCharArray(),
                "d".toCharArray(),
                "efg".toCharArray()
        };
        assertEquals("aceg", getSymbols(testArray));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCornerElements_oneDimArray() {
        getSymbols(new char[][]{"abc".toCharArray()});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCornerElements_triangleArray() {
        getSymbols(new char[][]{
                "abc".toCharArray(),
                "c".toCharArray()
        });
    }

    @Test
    public void testGetWordByIndex() {
        char[][] testArray = {"dog".toCharArray(), "cat".toCharArray(), "wolf".toCharArray()};
        assertEquals("cat", getWordByIndex(testArray, 2, 0, 1));
    }

    @Test
    public void testPrintWordOne() {
        char[][] array = {
                "a b c".toCharArray(),
                " d e ".toCharArray(),
                "f g h".toCharArray(),
                " i j ".toCharArray(),
                "k l m".toCharArray()};
        assertEquals("abcdefghijklm", printWordOne(array));
        assertEquals("afkdibglejchm", printWordOne(array));
    }

    @Test
    public void testEvenElementsInArray() {
        char[][] testArray = {"ABCD".toCharArray(), "EFGH".toCharArray()};
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("AC", "EG"));
        assertEquals(expected, evenElementsInArray(testArray));
    }

}