package pl.sdacademy.java.krk27.wpj.behawioralne.memento;

public interface IRestorable<T> extends ICloneable<T> {

    void restore(T state);

}
