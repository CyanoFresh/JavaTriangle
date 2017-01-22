package com.cyanofresh.models;

import com.cyanofresh.models.Point;

public class Triangle {
    public Point A;
    public Point B;
    public Point C;

    public static int TYPE_TRIANGLE = 1;
    public static int TYPE_RECTANGLE = 2;
    public static int TYPE_EQUILATERAL = 3;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
}
