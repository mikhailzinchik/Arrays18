package com.epam.Arrays18;

import org.junit.Test;
import static com.epam.Arrays18.Array2.getWordByIndex;
import static org.junit.Assert.assertEquals;

public class ArrayTestGetWordByIndex {

    @Test
    public void testGetWordByIndex() {
        char[][] testArray = {"dog".toCharArray(), "cat".toCharArray(), "wolf".toCharArray()};
        assertEquals("cat", getWordByIndex(testArray, 2, 0, 1));
    }

}