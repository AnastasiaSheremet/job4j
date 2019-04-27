package ru.job4j.loop;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class Board {
    /**
     * Method Should paint chess board.
     * @param width board width.
     * @param height board height.
     * @return result.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // condition check what to write space or X.
                // Above in the assignment, we defined the pattern when it is necessary to insert X.
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // add newline translation.
            screen.append(ln);
        }
        return screen.toString();
    }
}
