package com.afs.tdd;

import java.util.ArrayList;
import java.util.List;

public class RoverCommandInvoker {
    private final List<RoverCommand> roverCommands;

    public RoverCommandInvoker() {
        roverCommands = new ArrayList<>();
    }

    public void appendCommand(RoverCommand roverCommand) {
        this.roverCommands.add(roverCommand);
    }

    public void execute() {
        for (RoverCommand roverCommand : this.roverCommands) {
            roverCommand.execute();
        }
    }

}
