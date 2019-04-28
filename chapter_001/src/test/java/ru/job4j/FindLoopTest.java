package ru.job4j;

import org.junit.Test;
import ru.job4j.array.FindLoop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas7ThenNo() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 8, 1};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
