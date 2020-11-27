package com.afs.tdd;

public class MarsRover {
    private GeoInfo geoInfo;

    public MarsRover(int xCoordinate, int yCoordinate, char heading) {
        this.geoInfo = new GeoInfo(xCoordinate, yCoordinate, heading);

    }

    public GeoInfo executeCommands(String commands) {
        for (char command : commands.toCharArray()) {
            this.executeCommand(command);
        }
        return this.geoInfo;
    }

    public void executeCommand(char command) {
        switch (command) {
            case 'M':
                this.geoInfo = moveForward(this.geoInfo);
                break;
            case 'R':
            case 'L':
                this.geoInfo = turn(this.geoInfo, command);
                break;
        }
    }

    private static GeoInfo turn(GeoInfo previousState, char turnCommand) {
        GeoInfo newGeoInfo = new GeoInfo(previousState);
        switch (turnCommand) {
            case 'L':
                switch (newGeoInfo.getHeading()) {
                    case 'N':
                        newGeoInfo.setHeading('W');
                        break;
                    case 'E':
                        newGeoInfo.setHeading('N');
                        break;
                    case 'S':
                        newGeoInfo.setHeading('E');
                        break;
                    case 'W':
                        newGeoInfo.setHeading('S');
                        break;
                }
                break;
            case 'R':
                switch (newGeoInfo.getHeading()) {
                    case 'N':
                        newGeoInfo.setHeading('E');
                        break;
                    case 'E':
                        newGeoInfo.setHeading('S');
                        break;
                    case 'S':
                        newGeoInfo.setHeading('W');
                        break;
                    case 'W':
                        newGeoInfo.setHeading('N');
                        break;
                }
                break;
        }
        return newGeoInfo;
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
