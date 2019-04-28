package ru.job4j.array;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class Square {
    /**
     * Method calculate .
     * @param bound is array length.
     * @return rst.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= rst.length; i++) {
            rst[i - 1] = (int) Math.pow(i, 2);
        }
        return rst;
    }
}
