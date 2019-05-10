package ru.job4j.condition;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class Triangle {

    /**
     * The method of calculating the perimeter by the length of the sides.
     *
     * Formula.
     *
     * (a + b + c) / 2
     *
     * @param a distance between a and b
     * @param b distance between a and c
     * @param c distance between b and c
     * @return perimeter.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * The method should calculate the area of the triangle..
     *
     * Formula.
     *
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * where √ - square root, to extract the root, use the Math.sqrt () method.
     *
     * @return If the treangle exists Return treangle area, else return -1.
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point(x1, y1).distance(new Point(x2, y2));
        double b = new Point(x2, y2).distance(new Point(x3, y3));
        double c = new Point(x3, y3).distance(new Point(x1, y1));
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            // Write the formula for treangle area.
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * The method checks whether it is possible to construct a triangle with such lengths of the sides.

     * @param a Distance between a and b.
     * @param b Distance between a and c.
     * @param c Distance between b and c.
     * @return true or false
     */
    private boolean exist(double a, double c, double b) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        }
        return false;
    }
}