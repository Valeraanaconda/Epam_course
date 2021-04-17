package com.epam.yazepchic.jwd.data.model;

public class Point {
    private int X;
    private int Y;

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Point() {
    }

    public Point(int x, int y) {
        X = x;
        Y = y;
    }

    public static Point getPoint(int x, int y) {
        return new Point(x, y);
    }

    public static Point getRandomPoint(int min, int max) {
        return new Point(min + (int) (Math.random() * max), min + (int) (Math.random() * max));
    }



    public static Point getRandomPointInArray(Point[] arr) {
        int max = arr.length;
        max--;
        return arr[(int) (Math.random() * ++max)];
    }

    @Override
    public String toString() {
        return "Point{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}
