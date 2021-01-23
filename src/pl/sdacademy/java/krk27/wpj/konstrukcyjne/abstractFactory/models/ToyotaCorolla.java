package pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models;

public abstract class ToyotaCorolla extends AbstractCar {
    @Override
    public String getModelName() {
        return "Corolla";
    }

    @Override
    public String getProducer() {
        return "Toyota";
    }
}
