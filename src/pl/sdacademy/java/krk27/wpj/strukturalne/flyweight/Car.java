package pl.sdacademy.java.krk27.wpj.strukturalne.flyweight;

public class Car {
    private String owner;
    private String registration;
    private CarFlyweight flyweight;

    public CarFlyweight getFlyweight() {
        return flyweight;
    }

    public void setFlyweight(CarFlyweight flyweight) {
        this.flyweight = flyweight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getColor() {
        return flyweight.getColor();
    }

    public String getModel() {
        return flyweight.getModel();
    }

    public String getManufacturer() {
        return flyweight.getManufacturer();
    }
}
