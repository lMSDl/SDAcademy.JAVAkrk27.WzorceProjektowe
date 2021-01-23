package pl.sdacademy.java.krk27.wpj.konstrukcyjne.builder;

public class ToyBuilder extends BaseToyBuilder<ToyBuilder, Toy> {

    @Override
    public Toy build() {
        //return new Toy(name, type, madeOf, minAge, color);
        return object;
    }
}
