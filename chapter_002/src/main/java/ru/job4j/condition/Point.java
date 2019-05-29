package ru.job4j.condition;

/**
 * Calculating distance between points.
 */
public class Point {
    private Integer x;
    private Integer y;
    private Integer z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }


    /**
     * Distance between points.
     * @param that point.
     * @return distance between points.
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    /**
     * Distance between points 3d.
     * @param that point.
     * @return distance between points 3d.
     */
    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
    }

    /**
     * Method shows information about points.
     */
    public void info() {
        if (z  == null) {
            System.out.println(String.format("Point[%s, %s]", this.x, this.y));
        } else {
            System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
        }
    }
}