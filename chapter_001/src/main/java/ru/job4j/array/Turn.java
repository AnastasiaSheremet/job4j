package ru.job4j.array;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class Turn {
     /**
     * The method should turn the array backwards.
     * @param array array.
     * @return array.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }
        return array;
    }
}
