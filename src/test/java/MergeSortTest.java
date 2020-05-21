import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] actual = {14, 7, 3, 12, 9, 11, 6, 2};
        int[] expected = {2, 3, 6, 7, 9, 11, 12, 14};
        MergeSort.mergeSort(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }
}