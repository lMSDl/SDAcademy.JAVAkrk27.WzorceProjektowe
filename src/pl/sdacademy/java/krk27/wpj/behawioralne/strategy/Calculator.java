package pl.sdacademy.java.krk27.wpj.behawioralne.strategy;

public class Calculator {

    private float a;
    private float b;
    private float result;
    private ICalcStrategy strategy;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getResult() {
        return result;
    }

    public void setStrategy(ICalcStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculate() {
        result = strategy.calculate(a, b);
    }
}
