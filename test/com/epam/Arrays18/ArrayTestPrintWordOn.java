package com.epam.Arrays18;

import org.junit.Test;

import static com.epam.Arrays18.Array3.printWordOne;
import static org.junit.Assert.assertEquals;

public class ArrayTestPrintWordOn {
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
}
