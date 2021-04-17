package com.epam.yazepchic.jwd.app;

import com.epam.yazepchic.jwd.data.manager.RealArrayManager;
import com.epam.yazepchic.jwd.data.manager.RealFigureManager;
import com.epam.yazepchic.jwd.data.model.Line;
import com.epam.yazepchic.jwd.data.model.Point;
import com.epam.yazepchic.jwd.data.model.Square;
import com.epam.yazepchic.jwd.data.model.Triangle;
import com.epam.yazepchic.jwd.domain.manager.FigureManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;


public class Main {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(Main.class);


    public static void main(String[] args) {
        Point[] points = new Point[4];
        Line[] lines = new Line[2];
        Triangle[] triangles = new Triangle[2];
        Square[] squares = new Square[1];

        RealArrayManager arrayManager = new RealArrayManager();
        FigureManager figureManager = new RealFigureManager();

        points = arrayManager.fillPointsArray(points);
        lines = arrayManager.fillLineArray(lines);
        triangles = arrayManager.fillTriangleArray(triangles);
        squares = arrayManager.fillSquareArray(squares);

        checkAndShowArrays(points,lines,triangles,squares,figureManager);


    }

    public static void checkAndShowArrays(Point[] points, Line[] lines, Triangle[] triangles, Square[] squares, FigureManager figureManager) {
        showPointArray(points);
        showLineArray(lines);
        checkTriangles(triangles,figureManager);
        checkSquare(squares,figureManager);
    }
    public static void checkTriangles(Triangle[] triangles,FigureManager figureManager)
    {
        for (Triangle triangle : triangles) {
            if (figureManager.triangleExistenceCheck(triangle.getA(), triangle.getB(), triangle.getC())) {
                logTriangleExists(triangle);
            } else {
               logTriangleIsNotExists(triangle);
            }
        }
    }
    public static void checkSquare(Square[] squares,FigureManager figureManager)
    {
        for (Square square : squares) {
            if(figureManager.squareExistenceCheck(square.getA(), square.getB(), square.getC(), square.getD())){
                logSquareExists(square);
            } else {
                logSquareIsNotExists(square);
            }
        }
   }




    public static void showPointArray(Point[] arr) {
        int i = 0;
        do {
            LOGGER.info(arr[i].toString());
            i++;
        }
        while (i < arr.length);
    }


    public static void showLineArray(Line[] arr) {
        for (Line line : arr) {
            LOGGER.info(line.toString());
        }
    }


    public static void logTriangleExists(Triangle triangle) {
        LOGGER.info(triangle.toString());
    }


    public static void logTriangleIsNotExists(Triangle triangle) {
        LOGGER.error("Triangle: " + triangle.toString() + " is not exists");
    }


    public static void logSquareExists(Square square) {
        LOGGER.info(square.toString());
    }

    public static void logSquareIsNotExists(Square square) {
        LOGGER.error("Square: " + square.toString() + " is not exists");
    }
}
