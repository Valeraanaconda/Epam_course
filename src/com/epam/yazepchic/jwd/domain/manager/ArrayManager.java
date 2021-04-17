package com.epam.yazepchic.jwd.domain.manager;

import com.epam.yazepchic.jwd.data.model.Line;
import com.epam.yazepchic.jwd.data.model.Point;
import com.epam.yazepchic.jwd.data.model.Square;
import com.epam.yazepchic.jwd.data.model.Triangle;

public interface ArrayManager {
    Point[] fillPointsArray(Point[] arr);
    Line[] fillLineArray(Line[] arr);
    Triangle[] fillTriangleArray(Triangle[] arr);
    Square[] fillSquareArray(Square[] arr);
}
