package ru.job4j.loop;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     * Method counts sum of even elements.
     * @param start, finish.
     * @return sum.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
         }
        return sum;
    }
}