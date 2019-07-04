package model.food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Goods {
    private String id;
    private String item;
    private double unitPrice;
    private int count;
    boolean halfPrice;
    public static List<Goods> foodList = new ArrayList<>();

    public Goods() {
    }

    public Goods(String id, String item, double unitPrice, boolean halfPrice) {
        this.id = id;
        this.item = item;
        this.unitPrice = unitPrice;
        this.halfPrice = halfPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isHalfPrice() {
        return halfPrice;
    }

    public void setHalfPrice(boolean halfPrice) {
        this.halfPrice = halfPrice;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", item='" + item + '\'' +
                ", unitPrice=" + unitPrice +
                ", count=" + count +
                ", halfPrice=" + halfPrice +
                '}';
    }


}
