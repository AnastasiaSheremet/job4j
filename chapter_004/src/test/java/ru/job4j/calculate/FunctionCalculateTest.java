package ru.job4j.calculate;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FunctionCalculateTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = new FunctionCalculate().calcRange(5, 8, x -> x + 1);
        List<Double> expected = new ArrayList<>(Arrays.asList(6D, 7D, 8D));
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquateResults() {
        List<Double> result = new FunctionCalculate().calcRange(1, 4, x -> Math.pow(x, 2));
        List<Double> expected = new ArrayList<>(Arrays.asList(1D, 4D, 9D));
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogFunctionThenLogResults() {
        List<Double> result = new FunctionCalculate().calcRange(1, 2, Math::log);
        List<Double> expected = new ArrayList<>(Arrays.asList(0D));
        assertThat(result, is(expected));
    }
}

