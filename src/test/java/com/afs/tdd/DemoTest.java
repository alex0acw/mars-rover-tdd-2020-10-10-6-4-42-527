package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_mars_rover_return_0_1_N_when_move_forward() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, 'N');

        //when
        GeoInfo actual = marsRover.executeCommands("M");

        //then
        assertEquals('N', actual.getHeading());
        assertEquals(0, actual.getX());
        assertEquals(1, actual.getY());
    }

    @Test
    void should_mars_rover_return_0_0_E_when_turn_right() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, 'N');

        //when
        GeoInfo actual = marsRover.executeCommands("R");

        //then
        assertEquals('E', actual.getHeading());
        assertEquals(0, actual.getX());
        assertEquals(0, actual.getY());
    }
}
