package ru.job4j.array;

/**
 * Multiple table.
 */
public class Matrix {
    /**
     * Create a 2d array which presents multiple table.
     * @param size array length.
     * @return table.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 1; i < size + 1; i++) {
            for (int j = 1; j < size + 1; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }
        return table;
    }
}
