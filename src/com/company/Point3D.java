package com.company;
import java.util.Arrays;

public class Point3D extends Point {
    private int z;

    public Point3D() {
        super();
        z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public int[] getXYZ() {
        int[] results = Arrays.copyOf(super.getXY(),3);
        results[2] = z;
        return results;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D (" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }

    // between point and (0, 0, 0)
    public double distance() {
        return Math.sqrt(this.getX()*this.getX() + this.getY()*this.getY() + z*z);
    }

    // between points
    public double distance(Point3D another) {
        int xDiff = this.getX() - another.getX();
        int yDiff = this.getY() - another.getY();
        int zDiff = this.z - another.z;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff + zDiff*zDiff);
    }
}
