package com.afs.tdd;

public class MarsRover {
    private GeoInfo geoInfo;

    public MarsRover(int xCoordinate, int yCoordinate, Direction heading) {
        this.geoInfo = new GeoInfo(xCoordinate, yCoordinate, heading);
    }

    public void moveForward() {
        this.geoInfo = this.geoInfo.moveForward();
    }

    public void turnLeft() {
        this.geoInfo = this.geoInfo.turnLeft();
    }

    public void turnRight() {
        this.geoInfo = this.geoInfo.turnRight();
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }
}
