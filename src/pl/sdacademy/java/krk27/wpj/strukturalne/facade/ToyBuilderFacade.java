package pl.sdacademy.java.krk27.wpj.strukturalne.facade;

import pl.sdacademy.java.krk27.wpj.konstrukcyjne.builder.BaseBuilder;
import pl.sdacademy.java.krk27.wpj.konstrukcyjne.builder.Toy;

public class ToyBuilderFacade extends BaseBuilder<Toy, Toy> {

    public ToyBuilderFacade() {
        super(new Toy());
    }

    protected ToyBuilderFacade(Toy toy) {
        super(toy);
    }

    public final ToyManufacturerInfoBuilder ManufacturerInfo = new ToyManufacturerInfoBuilder(object);
    public final ToyPropertiesBuilder Properties = new ToyPropertiesBuilder(object);

    @Override
    public Toy build() {
        return object;
    }
}
