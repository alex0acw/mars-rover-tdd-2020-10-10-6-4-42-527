package com.afs.tdd;

import com.afs.tdd.RoverCommands.ForwardCommand;
import com.afs.tdd.RoverCommands.LeftTurnCommand;
import com.afs.tdd.RoverCommands.RightTurnCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_mars_rover_return_0_1_N_when_move_forward_from_heading_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        ForwardCommand forwardCommand = new ForwardCommand(marsRover);
        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();
        roverCommandInvoker.appendCommand(forwardCommand);

        //when
        roverCommandInvoker.execute();

        //then
        assertEquals(Direction.NORTH, marsRover.getGeoInfo().heading);
        assertEquals(0, marsRover.getGeoInfo().x);
        assertEquals(1, marsRover.getGeoInfo().y);
    }

    @Test
    void should_mars_rover_return_1_0_E_when_move_forward_from_heading_E() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);
        ForwardCommand forwardCommand = new ForwardCommand(marsRover);
        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();
        roverCommandInvoker.appendCommand(forwardCommand);

        //when
        roverCommandInvoker.execute();

        //then
        assertEquals(Direction.EAST, marsRover.getGeoInfo().heading);
        assertEquals(1, marsRover.getGeoInfo().x);
        assertEquals(0, marsRover.getGeoInfo().y);
    }

    @Test
    void should_mars_rover_return_0_minus1_S_when_move_forward_from_heading_S() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);
        ForwardCommand forwardCommand = new ForwardCommand(marsRover);
        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();
        roverCommandInvoker.appendCommand(forwardCommand);


        //when
        roverCommandInvoker.execute();

        //then
        assertEquals(Direction.SOUTH, marsRover.getGeoInfo().heading);
        assertEquals(0, marsRover.getGeoInfo().x);
        assertEquals(-1, marsRover.getGeoInfo().y);
    }

    @Test
    void should_mars_rover_return_minus1_0_E_when_move_forward_from_heading_W() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);
        ForwardCommand forwardCommand = new ForwardCommand(marsRover);
        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();
        roverCommandInvoker.appendCommand(forwardCommand);


        //when
        roverCommandInvoker.execute();

        //then
        assertEquals(Direction.WEST, marsRover.getGeoInfo().heading);
        assertEquals(-1, marsRover.getGeoInfo().x);
        assertEquals(0, marsRover.getGeoInfo().y);
    }

    @Test
    void should_mars_rover_return_0_0_E_when_turn_right_from_heading_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        RightTurnCommand rightTurnCommand = new RightTurnCommand(marsRover);
        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();
        roverCommandInvoker.appendCommand(rightTurnCommand);


        //when
        roverCommandInvoker.execute();

        //then
        assertEquals(Direction.EAST, marsRover.getGeoInfo().heading);
        assertEquals(0, marsRover.getGeoInfo().x);
        assertEquals(0, marsRover.getGeoInfo().y);
    }

    @Test
    void should_mars_rover_return_0_0_S_when_turn_right_from_heading_E() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);
        RightTurnCommand rightTurnCommand = new RightTurnCommand(marsRover);
        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();
        roverCommandInvoker.appendCommand(rightTurnCommand);

        //when
        roverCommandInvoker.execute();

        //then
        assertEquals(Direction.SOUTH, marsRover.getGeoInfo().heading);
        assertEquals(0, marsRover.getGeoInfo().x);
        assertEquals(0, marsRover.getGeoInfo().y);
    }

    @Test
    void should_mars_rover_return_0_0_W_when_turn_right_from_heading_S() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);
        RightTurnCommand rightTurnCommand = new RightTurnCommand(marsRover);
        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();
        roverCommandInvoker.appendCommand(rightTurnCommand);

        //when
        roverCommandInvoker.execute();

        //then
        assertEquals(Direction.WEST, marsRover.getGeoInfo().heading);
        assertEquals(0, marsRover.getGeoInfo().x);
        assertEquals(0, marsRover.getGeoInfo().y);
    }

    @Test
    void should_mars_rover_return_0_0_N_when_turn_right_from_heading_W() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);
        RightTurnCommand rightTurnCommand = new RightTurnCommand(marsRover);
        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();
        roverCommandInvoker.appendCommand(rightTurnCommand);

        //when
        roverCommandInvoker.execute();

        //then
        assertEquals(Direction.NORTH, marsRover.getGeoInfo().heading);
        assertEquals(0, marsRover.getGeoInfo().x);
        assertEquals(0, marsRover.getGeoInfo().y);
    }

    @Test
    void should_mars_rover_return_0_0_W_when_turn_left_from_heading_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        LeftTurnCommand leftTurnCommand = new LeftTurnCommand(marsRover);
        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();
        roverCommandInvoker.appendCommand(leftTurnCommand);

        //when
        roverCommandInvoker.execute();

        //then
        assertEquals(Direction.WEST, marsRover.getGeoInfo().heading);
        assertEquals(0, marsRover.getGeoInfo().x);
        assertEquals(0, marsRover.getGeoInfo().y);
    }

    @Test
    void should_mars_rover_return_0_0_N_when_turn_left_from_heading_E() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.EAST);
        LeftTurnCommand leftTurnCommand = new LeftTurnCommand(marsRover);
        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();
        roverCommandInvoker.appendCommand(leftTurnCommand);

        //when
        roverCommandInvoker.execute();

        //then
        assertEquals(Direction.NORTH, marsRover.getGeoInfo().heading);
        assertEquals(0, marsRover.getGeoInfo().x);
        assertEquals(0, marsRover.getGeoInfo().y);
    }

    @Test
    void should_mars_rover_return_0_0_E_when_turn_left_from_heading_S() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.SOUTH);
        LeftTurnCommand leftTurnCommand = new LeftTurnCommand(marsRover);
        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();
        roverCommandInvoker.appendCommand(leftTurnCommand);

        //when
        roverCommandInvoker.execute();

        //then
        assertEquals(Direction.EAST, marsRover.getGeoInfo().heading);
        assertEquals(0, marsRover.getGeoInfo().x);
        assertEquals(0, marsRover.getGeoInfo().y);
    }

    @Test
    void should_mars_rover_return_0_0_S_when_turn_left_from_heading_W() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.WEST);
        LeftTurnCommand leftTurnCommand = new LeftTurnCommand(marsRover);
        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();
        roverCommandInvoker.appendCommand(leftTurnCommand);

        //when
        roverCommandInvoker.execute();

        //then
        assertEquals(Direction.SOUTH, marsRover.getGeoInfo().heading);
        assertEquals(0, marsRover.getGeoInfo().x);
        assertEquals(0, marsRover.getGeoInfo().y);
    }

    @Test
    void should_mars_rover_return_1_1_E_when_execute_MRM_given_heading_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.NORTH);
        ForwardCommand forwardCommand = new ForwardCommand(marsRover);
        RightTurnCommand rightTurnCommand = new RightTurnCommand(marsRover);
        RoverCommandInvoker roverCommandInvoker = new RoverCommandInvoker();
        roverCommandInvoker.appendCommand(forwardCommand);
        roverCommandInvoker.appendCommand(rightTurnCommand);
        roverCommandInvoker.appendCommand(forwardCommand);

        //when
        roverCommandInvoker.execute();

        //then
        assertEquals(Direction.EAST, marsRover.getGeoInfo().heading);
        assertEquals(1, marsRover.getGeoInfo().x);
        assertEquals(1, marsRover.getGeoInfo().y);
    }
}
