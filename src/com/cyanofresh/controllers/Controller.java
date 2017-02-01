package com.cyanofresh.controllers;

import com.cyanofresh.models.Edge;
import com.cyanofresh.models.Triangle;

public class Controller {
    public static double getEdgeLength(Edge edge) {
        return Math.sqrt(Math.pow((edge.getB().getX() - edge.getA().getX()), 2) + Math.pow((edge.getB().getY() - edge.getA().getY()), 2));
    }

    public static boolean getIsEqualTriangle(Triangle triangle) {
        return triangle.getAB().getLength() == triangle.getAC().getLength()
                && triangle.getAC().getLength() == triangle.getBC().getLength()
                && triangle.getBC().getLength() == triangle.getAC().getLength();
    }

    public static boolean getIsIsoscelesTriangle(Triangle triangle) {
        return triangle.getAB().getLength() == triangle.getBC().getLength()
                || triangle.getAB().getLength() == triangle.getAC().getLength()
                || triangle.getBC().getLength() == triangle.getAC().getLength();
    }

    public static double getS(Triangle triangle) {
        double p = getP(triangle) / 2;
        return Math.sqrt(p * (p - triangle.getAB().getLength()) * (p - triangle.getAC().getLength()) * (p - triangle.getBC().getLength()));
    }

    public static double getP(Triangle triangle) {
        return triangle.getAC().getLength() + triangle.getAB().getLength() + triangle.getBC().getLength();
    }
}
