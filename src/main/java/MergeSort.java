import com.github.javaparser.ast.stmt.WhileStmt;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {14, 7, 3, 12, 9, 11, 6, 2};

       mergeSort(array, 0, array.length-1);
        System.out.println(("Array after sorting: " + Arrays.toString(array)));
    }


    public static void mergeSort(int[] array, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);

            merge(array, start, mid, end);
        }
    }

    public static void merge(int[] array, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] lowHalf = new int[n1];
        int[] highHalf = new int[n2];

      int k = start;

        for (int i = 0; k <= mid; i++, k++) {
            lowHalf[i] = array[k];
        }
        for (int j = 0; k <= end; j++, k++) {
            highHalf[j] = array[k];
        }


        int i = 0, j = 0;
        k = start;

        while (i < n1 && j < n2) {
            if (lowHalf[i] > highHalf[j]) {
                array[k] = highHalf[j];
                j++;
            } else {
                array[k] = lowHalf[i];
                i++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = lowHalf[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = highHalf[j];
            j++;
            k++;
        }
    }
}