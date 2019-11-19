package com.company;

public class Point {
    public static final int DEFAULT_X = 0;
    public static final int DEFAULT_Y = 0;

    private int x, y;

    public Point() {
        this.x = DEFAULT_X;
        this.y = DEFAULT_Y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getXY() {
        int[] results = new int[2];
        results[0] = x;
        results[1] = y;
        return results;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(Point another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    // distance between dot and (0, 0)
    public double distance() {
        return Math.sqrt(x*x + y*y);
    }
}
