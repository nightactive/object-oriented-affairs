package com.company;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (filled) return "Color of shape is " + color + " and it filled";
        else return "Color of shape is " + color + " and it doesn't filled";
    }

    public double getArea() {
        System.err.println("Error: unknown shape");
        return 0;
    }

    //I should realize Interface but it's example "How to NOT to do"
}
