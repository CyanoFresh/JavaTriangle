package com.cyanofresh;

import com.cyanofresh.models.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.println("Введите x для т. А:");
//        int AX = in.nextInt();
//        System.out.println("Введите y для т. А:");
//        int AY = in.nextInt();
//        System.out.println("Введите x для т. B:");
//        int BX = in.nextInt();
//        System.out.println("Введите y для т. B:");
//        int BY = in.nextInt();
//        System.out.println("Введите x для т. C:");
//        int CX = in.nextInt();
//        System.out.println("Введите y для т. C:");
//        int CY = in.nextInt();

        Point A = new Point(0, 0);
        Point B = new Point(0, 1);
        Point C = new Point(1, 0);

        Triangle triangle = new Triangle(A, B, C);

        System.out.println("A(" + triangle.A.getX() + ", " + triangle.A.getY() + ");");
        System.out.println("B(" + triangle.B.getX() + ", " + triangle.B.getY() + ");");
        System.out.println("C(" + triangle.C.getX() + ", " + triangle.C.getY() + ");");

        displayTriangleType(triangle);
    }

    private static void displayTriangleType(Triangle triangle) {
        double ABLength = getEdgeLength(triangle.A, triangle.B);
        double BCLength = getEdgeLength(triangle.B, triangle.C);
        double ACLength = getEdgeLength(triangle.A, triangle.C);

        if (ABLength == BCLength && ABLength == ACLength && ACLength == BCLength) {
            System.out.println("Равносторонний");
        }

        System.out.println(getAngleBetweenEdges(triangle.A, triangle.B));
    }

    private static double getEdgeLength(Point A, Point B) {
        return Math.sqrt(Math.pow((B.getX() - A.getX()), 2) + Math.pow((B.getY() - A.getY()), 2));
    }

    private static double getAngleBetweenEdges(Point A, Point B) {
        double scalar = A.getX() * B.getX() + A.getY() * B.getY();

        double moduleA = Math.sqrt(Math.pow(A.getX(), 2) + Math.pow(A.getY(), 2));
        double moduleB = Math.sqrt(Math.pow(B.getX(), 2) + Math.pow(B.getY(), 2));
        System.out.println(moduleA);
        System.out.println(moduleB);

        double cos = scalar / (moduleA * moduleB);

        System.out.println(cos);

        return Math.acos(cos);
    }
}
