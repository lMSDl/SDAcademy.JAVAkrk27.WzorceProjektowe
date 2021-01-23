package pl.sdacademy.java.krk27.wpj.behawioralne.state;

public class HeatingUpState extends State {

    public HeatingUpState() {
        new Thread(() -> {
            try {
                Thread.sleep(5000);
                machine.transitionTo(new IdleState());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    @Override
    public void smallCoffee() {
        System.out.println("HeatingUpState: I am heating up, try later!");
    }

    @Override
    public void largeCoffee() {
        System.out.println("HeatingUpState: I am heating up, try later!");
    }
}
