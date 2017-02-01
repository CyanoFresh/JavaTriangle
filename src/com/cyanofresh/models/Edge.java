package com.cyanofresh.models;

import com.cyanofresh.controllers.Controller;

public class Edge {
    private Point A;
    private Point B;
    private double length;

    public Edge(Point A, Point B) {
        this.setPoints(A, B);
        this.calculateLength();
    }

    public void setPoints(Point A, Point B) {
        this.setA(A);
        this.setB(B);
    }

    public Point getA() {
        return this.A;
    }

    public void setA(Point a) {
        this.A = a;
    }

    public Point getB() {
        return this.B;
    }

    public void setB(Point B) {
        this.B = B;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void calculateLength() {
        this.length = Controller.getEdgeLength(this);
    }
}
