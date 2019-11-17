package com.company;

public class Circle {
    // const
    public static final double DEFAULT_RADIUS = 1.0;
    public static final String DEFAULT_COLOR = "Red";

    // private
    private double radius;
    private String color;

    // default constructor (overloaded)
    public Circle() {
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }

    // method overloading
    public Circle(double radius) {
        this.radius = radius;
        this.color = DEFAULT_COLOR;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // getters
    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    // setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // description
    public String toString() {
        return "Radius is " + radius
                +";\nArea is " + getArea()
                + ";\nColor is " + color + ".";
    }

    // public methods
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
