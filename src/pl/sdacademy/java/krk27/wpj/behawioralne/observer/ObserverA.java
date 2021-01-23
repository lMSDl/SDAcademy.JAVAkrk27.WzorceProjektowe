package pl.sdacademy.java.krk27.wpj.behawioralne.observer;

public class ObserverA implements IObserver<Integer> {

    @Override
    public void onNext(Integer value) {
        if (value < 3)
        {
            System.out.println("ObserverA: Reacted to the event.");
        }
    }
}
