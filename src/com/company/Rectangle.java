package com.company;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        super();
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle's area is " + getArea() +
                ", perimeter is " + getPerimeter() +
                ". Color is " + this.getColor() +
                "; filled: " + this.isFilled();
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }
}
