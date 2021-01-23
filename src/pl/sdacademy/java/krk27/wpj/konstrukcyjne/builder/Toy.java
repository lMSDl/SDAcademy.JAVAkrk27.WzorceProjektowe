package pl.sdacademy.java.krk27.wpj.konstrukcyjne.builder;

import java.awt.*;

public class Toy {
    private String name;
    private String type;
    private String madeOf;
    private int minAge;
    private Color color;

    public Toy() {

    }

    public Toy(String name, String type, String madeOf, int minAge, Color color) {
        this.name = name;
        this.type = type;
        this.madeOf = madeOf;
        this.minAge = minAge;
        this.color = color;
    }

    Toy(final String name, final String type, final String madeOf) {
        this.name = name;
        this.type = type;
        this.madeOf = madeOf;
    }

//    Toy(final String name, final String madeOf) {
//        this.name = name;
//        this.madeOf = madeOf;
//    }
//
//    Toy(final String name, final String type) {
//        this.name = name;
//        this.type = type;
//    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(final String madeOf) {
        this.madeOf = madeOf;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
