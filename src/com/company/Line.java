package com.company;

public class Line {
    private Point begin;
    private Point end;

    public Line(int x1, int y1, int x2, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public Line (Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public Point getEnd() {
        return end;
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public String toString() {
        return "Line from " + begin + " to " + end;
    }

    public double getLength() {
        return begin.distance(end);
    }
}
