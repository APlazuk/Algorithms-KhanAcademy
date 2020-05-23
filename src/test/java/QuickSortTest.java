import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] actual = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        int[] expected = {2,3,5,6,7,9,10,11,12,14};
        QuickSort.quickSort(actual, 0, actual.length -1);
        assertArrayEquals(expected, actual);
    }
}