package pl.sdacademy.java.krk27.wpj.behawioralne.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Subject implements ISubject<Integer> {

    public Subject()
    {
        observers = new ArrayList<IObserver<Integer>>();
    }

    private List<IObserver<Integer>> observers;

    public void someBusinessLogic()
    {
        System.out.println("\nSubject: I'm doing something important.");
        int index = new Random().nextInt(10);

        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Subject: My state has just changed to: " + index);

        notify(index);
    }

    private void notify(int value)
    {
        observers.stream().forEach(x -> x.onNext(value));
    }

    @Override
    public void subscribe(IObserver<Integer> observer) {
        if(!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void unsubscribe(IObserver<Integer> observer) {
        observers.remove(observer);
    }
}
