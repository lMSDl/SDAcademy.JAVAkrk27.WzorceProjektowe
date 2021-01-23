package pl.sdacademy.java.krk27.wpj.behawioralne.state;

public class IdleState extends State {
    @Override
    public void smallCoffee() {
        System.out.println("IdleState: make small coffee");
        machine.transitionTo(new WorkingState(10));
    }

    @Override
    public void largeCoffee() {
        System.out.println("IdleState: make large coffee");
        machine.transitionTo(new WorkingState(15));

    }
}
