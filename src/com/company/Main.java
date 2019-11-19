package com.company;

public class Main {

    public static void main(String[] args) {
        // test point
	    Point p1 = new Point(1,2);
	    System.out.println(p1);

	    Point p2 = new Point();
	    System.out.println(p2);

	    // test getters
	    System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.getXY()[0] + " " + p1.getXY()[1]);

        // test setters
        p2.setX(5);
        p2.setY(13);
        System.out.println(p2);
        p2.setXY(7, 12);
        System.out.println(p2);

        // test distance-methods
        System.out.println("Distance from (0, 0) to " + p2
                            + " is " + Math.round(p2.distance() * 100.0) / 100.0);
        System.out.println("Distance from" + p1 + " to " + p2
                            + " is " + Math.round(p2.distance(p1) * 100.0) / 100.0);
        System.out.println("Distance from (10, 10) to " + p2
                            + " is " + Math.round(p2.distance(10,10) * 100.0) / 100.0);

        //___________________________________________________________________________________
        // test line
        Line l1 = new Line(new Point(5,3), new Point(9,-5));
        System.out.println(l1);
        System.out.println(l1.getLength());

        l1.setEndXY(92,17);
        l1.setBegin(p1);
        System.out.println(l1.getLength());
    }
}
