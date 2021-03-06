import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1,-5,4,10,2};

        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {

            int key = array[i];
            int j = 0;

            for (j = i-1; (j >= 0) && (array[j] > key); j--) {
                array[j + 1] = array[j];
            }

            array[j + 1] = key;
        }
    }
}