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
        System.out.println("________________________________");

        // test line
        Line l1 = new Line(new Point(5,3), new Point(9,-5));
        System.out.println(l1);
        System.out.println(l1.getLength());

        l1.setEndXY(92,17);
        l1.setBegin(p1);
        System.out.println(l1.getLength());
        //___________________________________________________________________________________
        System.out.println("________________________________");

        // test circle
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(1,2,3.3);
        System.out.println(c2);

        Circle c3 = new Circle(new Point(23, 51), 17.3);
        System.out.println(c3);

        System.out.println(c3.distance(c1));
        //___________________________________________________________________________________
        System.out.println("________________________________");

        // test cylinder
        Cylinder cy1 = new Cylinder();
        System.out.println(cy1);

        Cylinder cy2 = new Cylinder(5.0, 2.0);
        System.out.println(cy2);
        //___________________________________________________________________________________
        System.out.println("________________________________");

        // test Point3D
        Point3D p3d = new Point3D(5, 4, 1);
        System.out.println(p3d);
        System.out.println(p3d.getX());
        System.out.println(p3d.getY());
        System.out.println(p3d.getZ());
        System.out.println(p3d.getXYZ()[0] + " " + p3d.getXYZ()[1] + " " + p3d.getXYZ()[2]);
        p3d.setXYZ(9,8,7);
        System.out.println(p3d);
        System.out.println(p3d.distance());
        System.out.println(p3d.distance(new Point3D(73, 15, 32)));
    }
}
