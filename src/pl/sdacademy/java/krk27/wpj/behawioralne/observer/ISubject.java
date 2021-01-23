package pl.sdacademy.java.krk27.wpj.behawioralne.observer;

public interface ISubject<T> {

    void subsctibe(IObserver<T> observer);
    void unsubsctibe(IObserver<T> observer);

}
