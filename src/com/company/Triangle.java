package com.company;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
        super();
        base = 1.0;
        height = 1.0;
    }

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    public Triangle(String color, boolean filled, double base, double height) {
        super(color, filled);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle's area is " + getArea() + ". " + super.toString();
    }

    @Override
    public double getArea() {
        return (height * base) / 2.0;
    }
}
