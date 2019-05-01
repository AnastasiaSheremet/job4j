package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static  org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * Tests ArrayDuplicate
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"1", "2", "1", "3", "2", "3"};
        String[] expect = {"1", "2", "3"};
        ArrayDuplicate dupl = new ArrayDuplicate();
        assertThat(dupl.remove(input), arrayContainingInAnyOrder(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate1() {
        String[] input = {"1", "1", "1", "1", "1", "1"};
        String[] expect = {"1"};
        ArrayDuplicate dupl = new ArrayDuplicate();
        assertThat(dupl.remove(input), arrayContainingInAnyOrder(expect));
    }
}