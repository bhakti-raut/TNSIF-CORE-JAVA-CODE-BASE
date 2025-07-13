package com.tnsif.day7.overriding;

public class Point {
    private float x;
    private float y;

    public Point(){
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Point(float x, float y) {
        super();
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point [x=" + x + ", y=" + y +  "]";
    }

}
