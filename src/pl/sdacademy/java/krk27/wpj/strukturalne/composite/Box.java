package pl.sdacademy.java.krk27.wpj.strukturalne.composite;

import java.util.ArrayList;
import java.util.List;

public class Box extends ProductBase {

    private List<ProductBase> content = new ArrayList<>();

    public Box(String name) {
        super(name, 0);
    }

    public void add(ProductBase product) {
        content.add(product);
    }

    @Override
    public int getPrice() {
        int total = 0;
        for (ProductBase product : content) {
            total += product.getPrice();
        }
        return total;
    }
}
