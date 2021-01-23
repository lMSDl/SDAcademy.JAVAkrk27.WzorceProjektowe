package pl.sdacademy.java.krk27.wpj.behawioralne.state;

import java.awt.*;

public class WorkingState extends State {

    private Thread workingThread;

    public WorkingState(int wokringTime) {
        workingThread = new Thread(() -> {
            try {
                Thread.sleep(wokringTime * 1000);
            } catch (InterruptedException e) {
                System.out.println("WorkingState: process cancelled");
            }
            machine.transitionTo(new IdleState());
        });
        workingThread.start();
    }


    @Override
    public void smallCoffee() {
        workingThread.interrupt();
    }

    @Override
    public void largeCoffee() {
        workingThread.interrupt();
    }
}
