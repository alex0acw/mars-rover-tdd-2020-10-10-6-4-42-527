package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_mars_rover_return_0_1_N_when_move_forward_from_heading_N() {
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
    void should_mars_rover_return_1_0_E_when_move_forward_from_heading_E() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, 'E');

        //when
        GeoInfo actual = marsRover.executeCommands("M");

        //then
        assertEquals('E', actual.getHeading());
        assertEquals(1, actual.getX());
        assertEquals(0, actual.getY());
    }

    @Test
    void should_mars_rover_return_0_minus1_S_when_move_forward_from_heading_S() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, 'S');

        //when
        GeoInfo actual = marsRover.executeCommands("M");

        //then
        assertEquals('S', actual.getHeading());
        assertEquals(0, actual.getX());
        assertEquals(-1, actual.getY());
    }

    @Test
    void should_mars_rover_return_minus1_0_E_when_move_forward_from_heading_W() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, 'W');

        //when
        GeoInfo actual = marsRover.executeCommands("M");

        //then
        assertEquals('W', actual.getHeading());
        assertEquals(-1, actual.getX());
        assertEquals(0, actual.getY());
    }

    @Test
    void should_mars_rover_return_0_0_E_when_turn_right_from_heading_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, 'N');

        //when
        GeoInfo actual = marsRover.executeCommands("R");

        //then
        assertEquals('E', actual.getHeading());
        assertEquals(0, actual.getX());
        assertEquals(0, actual.getY());
    }

    @Test
    void should_mars_rover_return_0_0_S_when_turn_right_from_heading_E() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, 'E');

        //when
        GeoInfo actual = marsRover.executeCommands("R");

        //then
        assertEquals('S', actual.getHeading());
        assertEquals(0, actual.getX());
        assertEquals(0, actual.getY());
    }

    @Test
    void should_mars_rover_return_0_0_W_when_turn_right_from_heading_S() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, 'S');

        //when
        GeoInfo actual = marsRover.executeCommands("R");

        //then
        assertEquals('W', actual.getHeading());
        assertEquals(0, actual.getX());
        assertEquals(0, actual.getY());
    }

    @Test
    void should_mars_rover_return_0_0_N_when_turn_right_from_heading_W() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, 'W');

        //when
        GeoInfo actual = marsRover.executeCommands("R");

        //then
        assertEquals('N', actual.getHeading());
        assertEquals(0, actual.getX());
        assertEquals(0, actual.getY());
    }

    @Test
    void should_mars_rover_return_0_0_W_when_turn_left_from_heading_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, 'N');

        //when
        GeoInfo actual = marsRover.executeCommands("L");

        //then
        assertEquals('W', actual.getHeading());
        assertEquals(0, actual.getX());
        assertEquals(0, actual.getY());
    }

    @Test
    void should_mars_rover_return_0_0_N_when_turn_left_from_heading_E() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, 'E');

        //when
        GeoInfo actual = marsRover.executeCommands("L");

        //then
        assertEquals('N', actual.getHeading());
        assertEquals(0, actual.getX());
        assertEquals(0, actual.getY());
    }

    @Test
    void should_mars_rover_return_0_0_E_when_turn_left_from_heading_S() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, 'S');

        //when
        GeoInfo actual = marsRover.executeCommands("L");

        //then
        assertEquals('E', actual.getHeading());
        assertEquals(0, actual.getX());
        assertEquals(0, actual.getY());
    }

    @Test
    void should_mars_rover_return_0_0_S_when_turn_left_from_heading_W() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, 'W');

        //when
        GeoInfo actual = marsRover.executeCommands("L");

        //then
        assertEquals('S', actual.getHeading());
        assertEquals(0, actual.getX());
        assertEquals(0, actual.getY());
    }
}
