package pl.sdacademy.java.krk27.wpj.behawioralne.strategy;

public class PlusStrategy implements ICalcStrategy {
    @Override
    public float calculate(float a, float b) {
        return a + b;
    }
}
