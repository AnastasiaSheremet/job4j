package ru.job4j.calculate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculate {

    public List<Double> calcRange(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (int index = start; index != end; index++) {
            result.add(func.apply((double) index));
        }
        return result;
    }
}
