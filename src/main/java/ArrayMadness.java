import java.util.Arrays;

public class ArrayMadness {
    public static int[] createArrayWithFirstTenOddNumbers() {
        int[] array = new int[10];
        int x = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = x;
            x = x + 2;
        }
        System.out.println("The first ten odd numbers are " + Arrays.toString(array));

        return array;
    }

    public static int[] replaceMaxAndMinElementsInArray(int[] array) {
        int max = array[0];
        int min = array[0];
        int elementMax = 0;
        int elementMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                elementMax = i;
            }
            if (min > array[i]) {
                min = array[i];
                elementMin = i;
            }
        }
        array[elementMin] = max;
        array[elementMax] = min;

        return array;
    }

    public static double calculateArithmeticAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }
}
