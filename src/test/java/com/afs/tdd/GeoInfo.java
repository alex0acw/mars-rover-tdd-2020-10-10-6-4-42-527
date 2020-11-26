package com.afs.tdd;

public class GeoInfo {
    private int xCoordinate;
    private int yCoordinate;
    private char heading;

    public GeoInfo(int xCoordinate, int yCoordinate, char heading) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.heading = heading;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public char getHeading() {
        return heading;
    }

    public void setHeading(char heading) {
        this.heading = heading;
    }
}
