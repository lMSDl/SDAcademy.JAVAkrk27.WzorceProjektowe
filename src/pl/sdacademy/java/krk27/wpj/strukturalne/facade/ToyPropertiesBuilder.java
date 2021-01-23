package pl.sdacademy.java.krk27.wpj.strukturalne.facade;

import pl.sdacademy.java.krk27.wpj.konstrukcyjne.builder.Toy;

import java.awt.*;

public class ToyPropertiesBuilder extends ToyBuilderFacade {

    ToyPropertiesBuilder(Toy object) {
        super(object);
    }

    public ToyPropertiesBuilder withName(final String name) {
        object.setName(name);
        return this;
    }

    public ToyPropertiesBuilder withType(final String type) {
        object.setName(type);
        return this;
    }

    public ToyPropertiesBuilder withColor(Color color) {
        object.setColor(color);
        return this;
    }
}
