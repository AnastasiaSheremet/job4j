package ru.job4j.calculate;
/**
 * Calculating the ideal weight programm.
 */
public class Fit {

    /**
     * Man's ideal weight.
     * @param height Height.
     * @return ideal weight.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Woman's ideal weihht.
     * @param height Height.
     * @return ideal weight.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}