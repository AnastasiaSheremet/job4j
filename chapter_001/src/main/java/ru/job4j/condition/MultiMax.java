package ru.job4j.condition;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class MultiMax {
    /**
     * Find maximum of three values.
     * @param first, second, third.
     * @return result.
     */
    public int max(int first, int second, int third) {
        int result = (first >= second) ? first : second;
        return (result >= third) ? result : third;
    }
}
