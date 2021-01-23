package pl.sdacademy.java.krk27.wpj.behawioralne.observer;

public interface ISubject<T> {

    void subscribe(IObserver<T> observer);
    void unsubscribe(IObserver<T> observer);

}
