package pl.sdacademy.java.krk27.wpj.behawioralne.chainOfResponsibility;

public abstract class BaseHandler<T> {

    protected T nextHandler;

    public BaseHandler(T nextHandler) {
        this.nextHandler = nextHandler;
    }
}
