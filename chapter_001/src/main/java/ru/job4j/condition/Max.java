package ru.job4j.condition;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class Max {

    /**
     * Find maximum.
     * @param left, right.
     * @return max.
     */
    public int max(int left, int right) {
        int maximum = left >= right ? left : right;
        return maximum;
    }
}
