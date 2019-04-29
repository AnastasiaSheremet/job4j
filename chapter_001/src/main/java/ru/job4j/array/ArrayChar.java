package ru.job4j.array;

import java.sql.Array;

/**
 * Wrap over string.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Check that word starts with prefix.
     * @param prefix prefix.
     * @return if the word starts with prefix.
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (data[i] != value[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
