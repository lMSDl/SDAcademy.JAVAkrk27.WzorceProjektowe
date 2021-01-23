package pl.sdacademy.java.krk27.wpj.behawioralne.strategy;

public class DivideStrategy implements ICalcStrategy {
    @Override
    public float calculate(float a, float b) {
        return a / b;
    }
}
