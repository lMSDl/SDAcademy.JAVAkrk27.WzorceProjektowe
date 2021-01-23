package pl.sdacademy.java.krk27.wpj.behawioralne.state;

public class CoffeeMachine implements IMachine {

    private State state;

    public CoffeeMachine() {
        transitionTo(new HeatingUpState());
    }

    @Override
    public void transitionTo(State state) {
        System.out.println("CoffeeMachine: Transition to " + state.getClass().getSimpleName());
        if(this.state != null)
            this.state.setContext(null);
        this.state = state;
        if(this.state != null)
            this.state.setContext(this);
    }

    public void smallCoffee() {
        state.smallCoffee();
    }

    public void largeCoffee() {
        state.largeCoffee();
    }
}
