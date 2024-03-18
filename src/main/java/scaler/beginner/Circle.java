package scaler.beginner;

import java.awt.Point;

public class Circle extends Point {
    public double radius;

    public double diameter() {
        return Math.PI * radius * radius;
    }

}
