import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMadnessTest {
    @Test
    public void createArrayWithFirstTenOddNumbersTest() throws Exception {
        int[] actualArray = ArrayMadness.createArrayWithFirstTenOddNumbers();
        int[] expectedArray = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void replaceMaxAndMinElementsInArrayTest() throws Exception {
        int[] actualArray = new int[]{3,-7,0,6,9,10,20};
        int[] expectedArray = new int[]{3,20,0,6,9,10,-7};
        int[] replacedArray = ArrayMadness.replaceMaxAndMinElementsInArray(actualArray);
        assertArrayEquals(expectedArray, replacedArray);
    }

    @Test
    public void calculateArithmeticAverageTest() throws Exception {
        int[] actualArray = new int[]{1,2,3,4};
        double expectedArithmeticAverage = 2.5;
        double actualArithmeticAverage = ArrayMadness.calculateArithmeticAverage(actualArray);
        assertEquals(expectedArithmeticAverage, actualArithmeticAverage, 0);
    }
}
