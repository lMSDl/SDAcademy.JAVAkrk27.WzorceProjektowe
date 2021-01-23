package pl.sdacademy.java.krk27.wpj.behawioralne.observer;

public class ObserverB implements IObserver<Integer> {
    @Override
    public void onNext(Integer value) {
        if (value == 0 || value >= 2)
        {
            System.out.println("ObserverB: Reacted to the event.");
        }
    }
}
