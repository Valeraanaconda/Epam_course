package com.epam.yazepchic.jwd.domain.manager;

import com.epam.yazepchic.jwd.data.model.Point;

public interface FigureManager {

    boolean triangleExistenceCheck(Point a, Point b, Point c);

    boolean squareExistenceCheck(Point a, Point b, Point c,Point d);

}
