package com.company;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square's area is " + super.getArea() +
                ", perimeter is " + super.getPerimeter() +
                ". Color is " + this.getColor() +
                "; filled: " + this.isFilled();
    }
}
