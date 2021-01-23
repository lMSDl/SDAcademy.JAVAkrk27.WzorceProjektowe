package pl.sdacademy.java.krk27.wpj.behawioralne.mediator;

public interface IElement {
    String getName();
    void receive(String from, String message, boolean isPrivate);
}
