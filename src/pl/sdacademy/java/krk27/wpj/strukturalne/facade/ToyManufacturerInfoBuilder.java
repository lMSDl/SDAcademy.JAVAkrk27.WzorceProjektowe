package pl.sdacademy.java.krk27.wpj.strukturalne.facade;

import pl.sdacademy.java.krk27.wpj.konstrukcyjne.builder.Toy;

public class ToyManufacturerInfoBuilder extends ToyBuilderFacade {
    ToyManufacturerInfoBuilder(Toy object) {
        super(object);
    }

    public ToyManufacturerInfoBuilder withMadeOf(final String madeOf) {
        object.setMadeOf(madeOf);
        return this;
    }

    public ToyManufacturerInfoBuilder withMinAge(final int age) {
        object.setMinAge(age);
        return this;
    }
}
