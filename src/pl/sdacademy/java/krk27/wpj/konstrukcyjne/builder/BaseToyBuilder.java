package pl.sdacademy.java.krk27.wpj.konstrukcyjne.builder;

import java.awt.*;

public abstract class BaseToyBuilder<T extends BaseToyBuilder, TResult> extends BaseBuilder<Toy, TResult> {
    /*protected String name;
    protected String type;
    protected String madeOf;
    protected int minAge;
    protected Color color;*/

    public BaseToyBuilder() {
        super(new Toy());
    }

    public T withName(final String name) {
        //this.name = name;
        object.setName(name);
        return (T) this;
    }

    public T withType(final String type) {
        //this.type = type;
        object.setName(type);
        return (T) this;
    }

    public T withMadeOf(final String madeOf) {
        //this.madeOf = madeOf;
        object.setName(madeOf);
        return (T) this;
    }

    public T withMinAge(int minAge) {
        //this.minAge = minAge;
        object.setMinAge(minAge);
        return (T) this;
    }

    public T withColor(Color color) {
        //this.color = color;
        object.setColor(color);
        return (T) this;
    }
}
