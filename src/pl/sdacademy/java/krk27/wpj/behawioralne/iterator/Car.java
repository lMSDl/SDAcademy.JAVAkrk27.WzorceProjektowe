package pl.sdacademy.java.krk27.wpj.behawioralne.iterator;

public class Car implements ICar {
    private static int index = 0;
    private final String info;

    public Car() {
        info = "Mazda 6 with id " + ++index;
    }

    @Override
    public String getVehicleInfo() {
        return info;
    }
}
