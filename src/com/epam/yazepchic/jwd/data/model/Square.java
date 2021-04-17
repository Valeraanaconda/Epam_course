package com.epam.yazepchic.jwd.data.model;

public class Square {
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Point getC() {
        return C;
    }

    public Point getD() {
        return D;
    }

    public Square(Point a, Point b, Point c, Point d) {
        A = a;
        B = b;
        C = c;
        D = d;
    }

    public static Square getSquare(Point a, Point b, Point c, Point d) {
        return new Square(a, b, c, d);
    }

    @Override
    public String toString() {
        return "Square{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                ", D=" + D +
                '}';
    }
}
