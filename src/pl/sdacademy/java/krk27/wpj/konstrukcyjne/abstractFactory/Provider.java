package pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory;

import pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models.ICar;
import pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models.Type;

public class Provider {

    public ICarFactory createFactory(final String carType) {
        switch (carType) {
            case "AUDI_A4":
                return new AudiFactory();
            case "TOYOTA_COROLLA":
                return new ToyotaFactory();
        }
        throw new UnsupportedOperationException("Cannot produce factory for this car type");
    }

    public ICar createFactory(final String carType, Type type) {
        ICarFactory factory = createFactory(carType);
        switch (type){

            case SEDAN -> {
                return factory.createSedan();
            }
            case HATCHBACK -> {
                return factory.createHatchback();
            }
            case COMBI -> {
                return factory.createCombi();
            }
        }

        return null;
    }
}
