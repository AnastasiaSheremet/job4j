package ru.job4j.calculate;

/**
 * This class provides simple calculator
 *@author Anastasia Sheremet
 *@since 2019.04.24
 *@version $Id$
 */
public class Calculator {
    /**
     * Method add.
     * @param first, second.
     * @return first + second.
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Method subtract.
     * @param first, second.
     * @return first - second.
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Method div.
     * @param first, second.
     * @return first / second.
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     * Method multiple.
     * @param first, second.
     * @return first * second.
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}
