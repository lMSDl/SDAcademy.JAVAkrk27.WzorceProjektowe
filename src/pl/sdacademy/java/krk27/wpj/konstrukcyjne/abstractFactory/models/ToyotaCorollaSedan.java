package pl.sdacademy.java.krk27.wpj.konstrukcyjne.abstractFactory.models;

public class ToyotaCorollaSedan extends ToyotaCorolla {

    @Override
    public Type getType() {
        return Type.SEDAN;
    }

    @Override
    public Integer getCylindersNum() {
        return 4;
    }

    @Override
    public Float getEngineVolume() {
        return 2.0F;
    }

    @Override
    public Integer getTrunkSize() {
        return 480;
    }
}
