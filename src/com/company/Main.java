package com.company;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle("green", true, 4,5);
        // Okay but the only methods I can call is the methods that Shape contains

        Rectangle trueRectangle = new Rectangle(12.0, 5.0);
        // Now I can get length, width, can set length, width and also I can get perimeter
        System.out.println(trueRectangle.getLength());
        System.out.println(trueRectangle.getWidth());
        trueRectangle.setWidth(10.0);
        System.out.println(trueRectangle);

        Shape triangle = new Triangle(7.0, 15.0);
        // Same picture

        Shape shape = new Shape();
        System.out.println(shape);
        System.out.println(shape.getArea());

        Shape square = new Square(12.0);
        // I can't do like that:
        // square.setSide(2.0);
        // because Shape haven't setSide method

        Square trueSquare = new Square(10.0);
        trueSquare.setSide(15.0);
        System.out.println(trueSquare);
    }
}
