package pl.sdacademy.java.krk27.wpj.behawioralne.memento;

import java.util.Date;

public class Memento<T extends ICloneable<T>> {

    private T state;
    private Date date;

    public Memento(T state) {
        this.state = state.shallowClone();
        this.date = new Date();
    }

    public T getState() {
        return state;
    }

    public Date getDate() {
        return date;
    }
}
