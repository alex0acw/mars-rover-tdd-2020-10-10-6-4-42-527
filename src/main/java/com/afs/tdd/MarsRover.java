package com.afs.tdd;

public class MarsRover {
    private GeoInfo geoInfo;

    public MarsRover(int xCoordinate, int yCoordinate, char headingChar) {
        this.geoInfo = new GeoInfo(xCoordinate, yCoordinate, Direction.fromShorthand(headingChar));

    }

    public GeoInfo executeCommands(String commands) {
        for (char command : commands.toCharArray()) {
            this.executeCommand(command);
        }
        return this.geoInfo;
    }

    public void executeCommand(char command) {
        if (command == 'M') {
            this.geoInfo = this.geoInfo.moveForward();
        } else if (command == 'R') {
            this.geoInfo = this.geoInfo.turnRight();
        } else if (command == 'L') {
            this.geoInfo = this.geoInfo.turnLeft();
        }
    }

}
