import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {1,-5,4,10,2};

        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        int min;
        for (int i = 0; i < array.length; i++) {
            min = indexOfMinimum(array, i);
            swap(array, i, min);
        }
    }

    private static int indexOfMinimum(int[] array, int startIndex) {

        int minValue = array[startIndex];
        int minIndex = startIndex;

        for(int i = minIndex + 1; i < array.length; i++){
            if (array[i] < minValue){
                minIndex = i;
                minValue = array[i];
            }
        }
        return minIndex;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];

        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
