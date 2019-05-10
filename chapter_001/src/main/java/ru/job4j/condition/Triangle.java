package ru.job4j.condition;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * The method of calculating the perimeter by the length of the sides.
     *
     * Formula.
     *
     * (a + b + c) / 2
     *
     * @param a distance between first and second
     * @param b distance between first and third
     * @param c distance between second and third
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
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            // Write the formula for treangle area.
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * The method checks whether it is possible to construct a triangle with such lengths of the sides.

     * @param a Distance between first and second.
     * @param b Distance between fist and third.
     * @param c Distance between second and third.
     * @return true or false
     */
    private boolean exist(double a, double c, double b) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        }
        return false;
    }
}