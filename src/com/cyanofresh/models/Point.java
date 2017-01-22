package com.cyanofresh.models;

public class Point {
    protected int y;
    protected int x;

    public Point(int x, int y) {
        this.setCoordinates(x, y);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCoordinates(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
}
