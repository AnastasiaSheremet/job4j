package ru.job4j.condition;

/**
 * Calculating distance between points.
 */
public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Distance between points.
     * @param that point.
     * @return distance between points.
     */
    public double distance(Point that) {
       return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}