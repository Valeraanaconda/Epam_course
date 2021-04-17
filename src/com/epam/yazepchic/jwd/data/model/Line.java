package com.epam.yazepchic.jwd.data.model;

public class Line {
    private Point A;
    private Point B;

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Line(Point a, Point b) {
        A = a;
        B = b;
    }

    public static Line getLine(Point a, Point b) {
        return new Line(a, b);
    }

    @Override
    public String toString() {
        return "Line{" +
                "A=" + A +
                ", B=" + B +
                '}';
    }
}
