package com.afs.tdd;

public class MarsRover {
    private GeoInfo geoInfo;

    public MarsRover(int xCoordinate, int yCoordinate, char heading) {
        this.geoInfo = new GeoInfo(xCoordinate, yCoordinate, heading);

    }

    public GeoInfo executeCommands(String commands) {
        return new GeoInfo(0, 0, 'N');
    }

}
