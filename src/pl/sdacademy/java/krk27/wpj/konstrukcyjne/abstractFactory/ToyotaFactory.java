package pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory;

import pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models.ICar;
import pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models.ToyotaCorollaCombi;
import pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models.ToyotaCorollaHatchback;
import pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models.ToyotaCorollaSedan;

public class ToyotaFactory implements ICarFactory {

    @Override
    public ICar createSedan() {
        return new ToyotaCorollaSedan();
    }

    @Override
    public ICar createCombi() {
        return new ToyotaCorollaCombi();
    }

    @Override
    public ICar createHatchback() {
        return new ToyotaCorollaHatchback();
    }
}
