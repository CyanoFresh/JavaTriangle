package com.cyanofresh.models;

import com.cyanofresh.controllers.Controller;

public class Triangle {
    public Point A;
    public Point B;
    public Point C;

    private Edge AB;
    private Edge AC;
    private Edge BC;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;

        Edge AB = new Edge(A, B);
        Edge AC = new Edge(A, C);
        Edge BC = new Edge(B, C);

        this.setAB(AB);
        this.setAC(AC);
        this.setBC(BC);

        if (Controller.getS(this) <= 0) {
            throw new RuntimeException("Points are at one line");
        }
    }

    public Edge getAB() {
        return AB;
    }

    public void setAB(Edge AB) {
        this.AB = AB;
    }

    public Edge getAC() {
        return AC;
    }

    public void setAC(Edge AC) {
        this.AC = AC;
    }

    public Edge getBC() {
        return BC;
    }

    public void setBC(Edge BC) {
        this.BC = BC;
    }
}
