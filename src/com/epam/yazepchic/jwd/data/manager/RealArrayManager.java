package com.epam.yazepchic.jwd.data.manager;

import com.epam.yazepchic.jwd.data.model.Line;
import com.epam.yazepchic.jwd.data.model.Point;
import com.epam.yazepchic.jwd.data.model.Square;
import com.epam.yazepchic.jwd.data.model.Triangle;
import com.epam.yazepchic.jwd.domain.manager.ArrayManager;

public class RealArrayManager implements ArrayManager {

    @Override
    public Point[] fillPointsArray(Point[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Point.getRandomPoint(-15, 40);
        }
        return arr;
    }

    @Override
    public Line[] fillLineArray(Line[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Line(Point.getRandomPoint(-15, 20), Point.getRandomPoint(-15, 40));
        }
        return arr;
    }

    @Override
    public Triangle[] fillTriangleArray(Triangle[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Triangle(Point.getRandomPoint(-15, 20), Point.getRandomPoint(-15, 40),Point.getRandomPoint(-15, 60));
        }
        return arr;
    }

    @Override
    public Square[] fillSquareArray(Square[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Square(Point.getRandomPoint(-15, 20), Point.getRandomPoint(-15, 40),Point.getRandomPoint(-15, 60),Point.getRandomPoint(-15, 60));
        }
        return arr;
    }
}
