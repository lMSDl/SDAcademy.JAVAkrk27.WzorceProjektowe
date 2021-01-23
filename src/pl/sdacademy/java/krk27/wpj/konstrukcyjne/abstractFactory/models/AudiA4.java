package pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models;

public abstract class AudiA4 extends AbstractCar {
    @Override
    public String getModelName() {
        return "A4";
    }

    @Override
    public String getProducer() {
        return "Audi";
    }
}
