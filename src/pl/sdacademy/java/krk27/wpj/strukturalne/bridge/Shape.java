package pl.sdacademy.java.krk27.wpj.strukturalne.bridge;

public abstract class Shape {

    private Color color; //bridge

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return (color != null ? color.getColor() : "") + getClass().getSimpleName();
    }
}
