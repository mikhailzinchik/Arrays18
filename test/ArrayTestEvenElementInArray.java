import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static com.epam.Arrays18.Array4.evenElementsInArray;
import static org.junit.Assert.assertEquals;

public class ArrayTestEvenElementInArray {
    @Test
    public void testEvenElementsInArray() {
        char[][] testArray = {"ABCD".toCharArray(), "EFGH".toCharArray()};
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("AC", "EG"));
        assertEquals(expected, evenElementsInArray(testArray));
    }
}

