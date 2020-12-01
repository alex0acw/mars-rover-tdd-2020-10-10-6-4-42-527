package com.afs.tdd.RoverCommands;

import com.afs.tdd.MarsRover;
import com.afs.tdd.RoverCommand;

public class ForwardCommand implements RoverCommand {
    private final MarsRover marsRover;

    public ForwardCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        this.marsRover.moveForward();
    }
}
