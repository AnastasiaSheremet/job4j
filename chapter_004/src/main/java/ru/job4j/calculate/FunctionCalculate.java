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

    public List<Double> calcLine(int start, int end, double n, double c) {
        return calcRange(start, end, x -> n * x + c);
    }

    public List<Double> calcSqr(int start, int end) {
        return calcRange(start, end, x -> Math.pow(x, 2));
    }

    public List<Double> calcLog(int start, int end) {
        return calcRange(start, end, x -> Math.log(x));
    }
}
