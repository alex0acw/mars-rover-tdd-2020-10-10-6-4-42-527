package com.afs.tdd;

public class GeoInfo {
    private int x;
    private int y;
    private char heading;

    public GeoInfo(int x, int y, char heading) {
        this.x = x;
        this.y = y;
        this.heading = heading;
    }

    public GeoInfo(GeoInfo other) {
        this.x = other.x;
        this.y = other.y;
        this.heading = other.heading;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getHeading() {
        return heading;
    }

    public void setHeading(char heading) {
        this.heading = heading;
    }
}
