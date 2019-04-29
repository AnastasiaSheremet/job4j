package ru.job4j.array;

/**
 * Bubble sort.
 */
public class BubbleSort {
    /**
     * Check that word starts with prefix.
     * @param array that should be sorted.
     * @return sorted array.
     */
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
