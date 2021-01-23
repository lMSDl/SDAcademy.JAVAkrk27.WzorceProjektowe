package pl.sdacademy.java.krk27.wpj.strukturalne.composite;

public abstract class ProductBase {
    private String name;
    protected int price;

    public ProductBase(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract int getPrice();

    @Override
    public String toString() {
        return name + ": " + getPrice();
    }
}
