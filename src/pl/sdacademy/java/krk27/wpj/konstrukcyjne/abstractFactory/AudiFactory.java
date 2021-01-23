package pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory;

import pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models.*;

public class AudiFactory implements ICarFactory {

    @Override
    public ICar createSedan() {
        return new AudiA4Sedan();
    }

    @Override
    public ICar createCombi() {
        return new AudiA4Combi();
    }

    @Override
    public ICar createHatchback() {
        return new AudiA4Hatchback();
    }
}
