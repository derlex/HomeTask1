public class ArrayMadness {
    public static int[] createArrayWithFirstTenOddNumbers() {
        int[] array = new int[10];
        int x = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = x;
            x = x + 2;
        }

        return array;
    }
}
