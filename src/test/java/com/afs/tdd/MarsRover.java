package com.afs.tdd;

public class MarsRover {
    private GeoInfo geoInfo;

    public MarsRover(int xCoordinate, int yCoordinate, char heading) {
        this.geoInfo = new GeoInfo(xCoordinate, yCoordinate, heading);

    }

    public GeoInfo executeCommands(String commands) {
        for (char command : commands.toCharArray()) {
            this.geoInfo = this.executeCommand(command);
        }
        return this.geoInfo;
    }

    public GeoInfo executeCommand(char command) {
        switch (command) {
            case 'M':
                this.geoInfo = moveForward(this.geoInfo);
                break;
        }
        return this.geoInfo;
    }

    static private GeoInfo moveForward(GeoInfo previousState) {
        GeoInfo newGeoInfo = new GeoInfo(previousState);
        switch (previousState.getHeading()) {
            case 'N':
                newGeoInfo.setY(newGeoInfo.getY() + 1);
                break;
            case 'E':
                newGeoInfo.setX(newGeoInfo.getX() + 1);
                break;
            case 'S':
                newGeoInfo.setY(newGeoInfo.getY() - 1);
                break;
            case 'W':
                newGeoInfo.setX(newGeoInfo.getX() - 1);
                break;
        }
        return newGeoInfo;
    }

}
