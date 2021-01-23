package pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory;

import pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models.ICar;

public interface ICarFactory {
    ICar createSedan();
    ICar createCombi();
    ICar createHatchback();
}
