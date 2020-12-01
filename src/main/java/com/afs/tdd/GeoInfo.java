package com.afs.tdd;

public class GeoInfo {
    public final int x;
    public final int y;
    public final Direction heading;

    public GeoInfo(int x, int y, Direction heading) {
        this.x = x;
        this.y = y;
        this.heading = heading;
    }

    public GeoInfo(GeoInfo other) {
        this.x = other.x;
        this.y = other.y;
        this.heading = other.heading;
    }

    public GeoInfo moveForward() {
        return new GeoInfo(
                this.x + this.heading.deltaX,
                this.y + this.heading.deltaY,
                this.heading);
    }

    public GeoInfo turnLeft() {
        return new GeoInfo(this.x, this.y, this.heading.turnLeft());
    }

    public GeoInfo turnRight() {
        return new GeoInfo(this.x, this.y, this.heading.turnRight());
    }

}
