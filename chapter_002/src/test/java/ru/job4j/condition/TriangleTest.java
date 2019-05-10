package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;


public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Create triangle object.
        Point first = new Point(0, 0);
        Point second = new Point(0, 3);
        Point third = new Point(4, 0);
        Triangle triangle = new Triangle(first, second, third);
        // Calculate the area.
        double result = triangle.area();
        // Check the expected result.
        double expected = 6D;
        //Check the result and expected values.
        assertThat(result, closeTo(expected, 0.1));
    }
}