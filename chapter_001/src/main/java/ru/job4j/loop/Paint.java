package ru.job4j.loop;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * Method method paints a pyramid.
     * @param height pyramid height.
     * @return screen.toString().
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int width= 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
 }