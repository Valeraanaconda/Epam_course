package com.epam.yazepchic.jwd.data.manager;

import com.epam.yazepchic.jwd.data.model.Point;
import com.epam.yazepchic.jwd.domain.manager.FigureManager;


public class RealFigureManager implements FigureManager {

    @Override
    public boolean triangleExistenceCheck(Point a, Point b, Point c) {
        int A, B, C;
        A = findSideLength(a, b);
        B = findSideLength(a, c);
        C = findSideLength(b, c);

        if (A + B > C && A + C > B && B + C > A) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean squareExistenceCheck(Point a, Point b, Point c, Point d) {
        int A, B, C, D;
        A = findSideLength(a, b);
        B = findSideLength(b, c);
        C = findSideLength(c, d);
        D = findSideLength(a, d);

        if (A == B && B == C && C == D && D == A) {
            return true;
        } else {
            return false;
        }
    }

    private int findSideLength(Point a, Point b) {
        return (int) (Math.sqrt((Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2))));
    }
}


