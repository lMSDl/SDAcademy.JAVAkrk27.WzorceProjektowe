package pl.sdacademy.java.krk27.wpj.behawioralne.mediator;

public interface IChatMediator {

    void join(IElement element);
    void quit(IElement element);

    void send(IElement from, String to, String message );
    void send(IElement from, String message );
}
