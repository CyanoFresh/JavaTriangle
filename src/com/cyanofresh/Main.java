package com.cyanofresh;

import com.cyanofresh.controllers.*;
import com.cyanofresh.models.*;
import com.cyanofresh.views.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите x для т. А:");
        int AX = in.nextInt();
        System.out.println("Введите y для т. А:");
        int AY = in.nextInt();
        System.out.println("Введите x для т. B:");
        int BX = in.nextInt();
        System.out.println("Введите y для т. B:");
        int BY = in.nextInt();
        System.out.println("Введите x для т. C:");
        int CX = in.nextInt();
        System.out.println("Введите y для т. C:");
        int CY = in.nextInt();

        Point A = new Point(0, 0);
        Point B = new Point(1, 0);
        Point C = new Point(2, 0);

        Triangle triangle = new Triangle(A, B, C);

        View.displayTriangleCoordinates(triangle);
        View.displayTriangleEdgeLengths(triangle);
        View.displayTriangleType(triangle);
        View.displayTriangleP(Controller.getP(triangle));
        View.displayTriangleS(Controller.getS(triangle));
    }
}
