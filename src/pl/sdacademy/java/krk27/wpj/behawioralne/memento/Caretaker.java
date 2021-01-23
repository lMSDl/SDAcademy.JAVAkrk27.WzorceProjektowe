package pl.sdacademy.java.krk27.wpj.behawioralne.memento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Caretaker<T extends IRestorable<T>> {

    private T originator;
    private List<Memento<T>> mementos = new ArrayList<>();

    public Caretaker(T originator) {
        this.originator = originator;
    }

    public void save() {
        mementos.add(new Memento(originator));
    }

    public void restoreLastState() {
        Memento<T> memento = mementos.get(mementos.size() - 1);
        mementos.remove(memento);
        originator.restore(memento.getState());
    }

    public void restore(Date date) {
        //wyszukiwanie stanu sprzed wskazanej daty
    }
}
