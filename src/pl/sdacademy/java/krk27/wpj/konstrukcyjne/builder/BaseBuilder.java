package pl.sdacademy.java.krk27.wpj.konstrukcyjne.builder;

public abstract class BaseBuilder<T, TResult> {

    protected T object;

    public BaseBuilder(T object) {
        this.object = object;
    }

    public abstract TResult build();
}
