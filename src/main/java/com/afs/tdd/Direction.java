package com.afs.tdd;

public enum Direction {
    EAST('E', 1, 0),
    SOUTH('S', 0, -1),
    WEST('W', -1, 0),
    NORTH('N', 0, 1);
    public final char shortHand;
    public final int deltaX;
    public final int deltaY;

    Direction(char shortHand, int deltaX, int deltaY) {
        this.shortHand = shortHand;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public static Direction fromShorthand(char directionShorthand) {
        for (Direction direction : Direction.values()) {
            if (direction.shortHand == directionShorthand)
                return direction;
        }
        throw new IllegalArgumentException(String.format("Cannot convert %c to a %s enum.", directionShorthand, Direction.class.getName()));
    }

    public Direction turnLeft() {
        return Direction.values()[((this.ordinal() - 1 + Direction.values().length) % Direction.values().length)];
    }

    public Direction turnRight() {
        return Direction.values()[((this.ordinal() + 1) % Direction.values().length)];
    }

}
