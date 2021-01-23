package pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models;

public interface ICar {
    Type getType();
    String getModelName();
    Integer getCylindersNum();
    String getProducer();
    Float getEngineVolume();
    Integer getTrunkSize();
}
