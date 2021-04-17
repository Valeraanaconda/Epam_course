package com.epam.yazepchic.jwd.data.model;

public class Triangle {
    private Point A;
    private Point B;
    private Point C;

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Point getC() {
        return C;
    }

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }

    public static Triangle getTriangle(Point a, Point b, Point c) {
        return new Triangle(a, b, c);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }
}
