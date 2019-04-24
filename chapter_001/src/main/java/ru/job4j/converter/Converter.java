package ru.job4j.converter;

/**
 * Currency converter.
 */
public class Converter {

    /**
     * Convert rubles into euro.
     * @param value rubles.
     * @return euro.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Convert rubles into dollars.
     * @param value rubles.
     * @return dollars.
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Convert euro into rubles.
     * @param value euro.
     * @return dollars.
     */
    public int euroToRuble(int value) {
        return value * 70;
    }

    /**
     * Convert dollars into rubles.
     * @param value dollars.
     * @return dollars.
     */
    public int dollarsToRuble(int value) {
        return value * 60;
    }
}