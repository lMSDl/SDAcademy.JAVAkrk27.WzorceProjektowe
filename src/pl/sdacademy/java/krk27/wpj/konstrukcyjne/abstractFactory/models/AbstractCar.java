package pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models;

public abstract class AbstractCar implements ICar {

    @Override
    public String toString() {
        return "Car: " + getProducer() + " " + getModelName() + " " + getType() + " has " + getCylindersNum() + " cylinders" +
                " and engine: " + getEngineVolume() + " and trunk with size " + getTrunkSize() + " litres";
    }
}
