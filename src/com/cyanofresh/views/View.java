package com.cyanofresh.views;

import com.cyanofresh.controllers.Controller;
import com.cyanofresh.models.Triangle;

public class View {
    public static void displayTriangleCoordinates(Triangle triangle) {
        System.out.println("A(" + triangle.A.getX() + ", " + triangle.A.getY() + ");");
        System.out.println("B(" + triangle.B.getX() + ", " + triangle.B.getY() + ");");
        System.out.println("C(" + triangle.C.getX() + ", " + triangle.C.getY() + ");");
        System.out.println();
    }

    public static void displayTriangleEdgeLengths(Triangle triangle) {
        System.out.println("AB = " + triangle.getAB().getLength());
        System.out.println("AC = " + triangle.getAC().getLength());
        System.out.println("BC = " + triangle.getBC().getLength());
        System.out.println();
    }

    public static void displayTriangleType(Triangle triangle) {
        if (Controller.getIsEqualTriangle(triangle)) {
            System.out.println("Equal triangle");
        }

        if (Controller.getIsIsoscelesTriangle(triangle)) {
            System.out.println("Isosceles triangle");
        }

        System.out.println();
    }

    public static void displayTriangleP(double P) {
        System.out.println("P = " + P);
        System.out.println();
    }

    public static void displayTriangleS(double S) {
        System.out.println("S = " + S);
        System.out.println();
    }
}
