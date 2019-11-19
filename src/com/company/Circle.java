package com.company;

public class Circle {
    private Point center;
    private double radius;

    public Circle() {
        center = new Point(0,0);
        radius = 1.0;
    }

    public Circle(int xCenter, int yCenter, double radius) {
        center = new Point(xCenter, yCenter);
        this.radius = radius;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // getters
    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    // setters

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    public String toString() {
        return "Circle with center in " + center + " has radius: " + radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getCircumference() {
        return Math.PI*radius*2;
    }

    public double distance(Circle another) {
        return center.distance(another.getCenter()) - radius - another.getRadius();
    }
}
