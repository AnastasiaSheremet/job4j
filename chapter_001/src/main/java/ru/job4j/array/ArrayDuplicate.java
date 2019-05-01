package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {
    /**
     * Method removes duplicates from array.
     * @param array array with duplicates.
     * @return array without duplicates.
     */
    public String[] remove(String[] array) {
        int duplicate = array.length;
        for (int i = 0; i < duplicate; i++) {
            for (int j = i + 1; j < duplicate; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[duplicate - 1];
                    duplicate--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, duplicate);
    }
}
