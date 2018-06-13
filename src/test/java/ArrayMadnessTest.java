import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayMadnessTest {
    @Test
    public void createArrayWithFirstTenOddNumbersTest() throws Exception {
        int[] array = ArrayMadness.createArrayWithFirstTenOddNumbers();
        assertEquals(true, Arrays.equals(array, new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19}));
    }

    @Test
    public void replaceMaxAndMinElementsInArrayTest() throws Exception {
        int[] actualArray = new int[]{3,-7,0,6,9};
        int[] expectedArray = new int[]{3,9,0,6,-7};
        int[] replacedArray = ArrayMadness.replaceMaxAndMinElementsInArray(actualArray);
        assertArrayEquals(expectedArray, replacedArray);
    }
}
