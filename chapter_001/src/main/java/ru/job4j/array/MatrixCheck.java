package ru.job4j.array;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    /**
     * Method checks the matrix diagonal elements equality.
     * @param data array 2d.
     * @return result.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length; j++) {
                if (((data[i][i] != data[data.length - 1][data.length - 1]) || (data[data.length - i - 1][i] != data[0][data.length - 1]))) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
