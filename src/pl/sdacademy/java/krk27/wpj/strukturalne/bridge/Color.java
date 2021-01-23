package pl.sdacademy.java.krk27.wpj.strukturalne.bridge;

public abstract class Color {

    public abstract String getColor();

    @Override
    public String toString() {
        return getColor();
    }
}
