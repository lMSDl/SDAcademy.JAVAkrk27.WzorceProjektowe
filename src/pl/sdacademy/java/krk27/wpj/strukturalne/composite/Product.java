package pl.sdacademy.java.krk27.wpj.strukturalne.composite;

public class Product extends ProductBase implements Cloneable {
    public Product(String name, int price) {
        super(name, price);
    }

    @Override
    public int getPrice() {
        return price;
    }

    public Product shallowClone() {
        try {
            return (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
