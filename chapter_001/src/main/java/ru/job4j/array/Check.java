package ru.job4j.array;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class Check {
    /**
     * The method should check if all array elements are true or false.
     * @param data array.
     * @return result.
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == data [i + 1]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
