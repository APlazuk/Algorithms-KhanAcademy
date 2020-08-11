import java.util.Arrays;

public class QuickSortWithMedian {

    public static void main(String[] args) {
        int[] actual = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};

        quickSort(actual, 0, actual.length -1);
        System.out.println(Arrays.toString(actual));
    }
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = start;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] <= array[end]) {
                swap(array, j, pivot);
                pivot++;
            }
        }
        swap(array, end, pivot);
        return pivot;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
