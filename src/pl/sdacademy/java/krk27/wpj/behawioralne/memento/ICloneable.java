package pl.sdacademy.java.krk27.wpj.behawioralne.memento;

public interface ICloneable<T> extends Cloneable {

    T shallowClone();
}
