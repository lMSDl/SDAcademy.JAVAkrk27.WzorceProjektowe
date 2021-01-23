package pl.sdacademy.java.krk27.wpj.behawioralne.chainOfResponsibility;

import javax.xml.namespace.QName;

public class DiscountHandler extends BaseHandler<IDiscountHandler> implements IDiscountHandler {

    private float maxDiscount;
    private float minPrice;
    private String name;

    public DiscountHandler(IDiscountHandler nextHandler, String name, float maxDiscount, float minPrice) {
        super(nextHandler);
        this.name = name;
        this.maxDiscount = maxDiscount;
        this.minPrice = minPrice;
    }
    public DiscountHandler(String name, float maxDiscount, float minPrice) {
        super(null);
        this.name = name;
        this.maxDiscount = maxDiscount;
        this.minPrice = minPrice;
    }

    @Override
    public boolean discount(float value, float price) {
        if(price >= minPrice && value <= maxDiscount) {
            System.out.println(name);
            return true;
        }
        if(nextHandler != null)
            return nextHandler.discount(value, price);
        return false;
    }
}
