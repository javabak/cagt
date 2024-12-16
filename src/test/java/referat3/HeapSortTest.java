package referat3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HeapSortTest {

    @Test
    public void testHeapSortWithPositiveNumbers() {
        HeapSort heapSort = new HeapSort();
        int[] arr = {12, 11, 13, 5, 6, 7};
        heapSort.heapSort(arr);
        int[] expected = {5, 6, 7, 11, 12, 13};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testHeapSortWithNegativeNumbers() {
        HeapSort heapSort = new HeapSort();
        int[] arr = {-12, -11, -13, -5, -6, -7};
        heapSort.heapSort(arr);
        int[] expected = {-13, -12, -11, -7, -6, -5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testHeapSortWithEmptyArray() {
        HeapSort heapSort = new HeapSort();
        int[] arr = {};
        heapSort.heapSort(arr);
        int[] expected = {};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testHeapSortWithSortedArray() {
        HeapSort heapSort = new HeapSort();
        int[] arr = {1, 2, 3, 4, 5};
        heapSort.heapSort(arr);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testHeapSortWithIdenticalElements() {
        HeapSort heapSort = new HeapSort();
        int[] arr = {5, 5, 5, 5, 5};
        heapSort.heapSort(arr);
        int[] expected = {5, 5, 5, 5, 5};
        assertArrayEquals(expected, arr);
    }
}
