package ru.job4j.array;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class FindLoop {
    /**
     * Method finds array element.
     * @param data array.
     * @param el arry element.
     * @return rst.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // if there is no such element in array then return -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
