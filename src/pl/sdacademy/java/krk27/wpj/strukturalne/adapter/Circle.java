package pl.sdacademy.java.krk27.wpj.strukturalne.adapter;

public class Circle implements ICircle{

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
