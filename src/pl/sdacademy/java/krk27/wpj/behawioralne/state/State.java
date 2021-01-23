package pl.sdacademy.java.krk27.wpj.behawioralne.state;

public abstract class State implements IState {

    protected IMachine machine;

    @Override
    public void setContext(IMachine machine) {
        this.machine = machine;
    }

    public abstract void smallCoffee();
    public abstract void largeCoffee();
}
