package Pairprogram;
import java.awt.Color;

public class Ball {

    // fields
    private Color color;

    //constructors
    public Ball(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public String toString() {
        return color.toString();
    }
}
