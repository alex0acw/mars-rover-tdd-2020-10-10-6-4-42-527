package com.afs.tdd;

public enum Direction {
    EAST(1, 0),
    SOUTH(0, -1),
    WEST(-1, 0),
    NORTH(0, 1);
    public final int deltaX;
    public final int deltaY;

    Direction(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public Direction turnLeft() {
        return Direction.values()[((this.ordinal() - 1 + Direction.values().length) % Direction.values().length)];
    }

    public Direction turnRight() {
        return Direction.values()[((this.ordinal() + 1) % Direction.values().length)];
    }

}
