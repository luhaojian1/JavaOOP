package model.food;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<Goods> list ;
    private double sumProce;

   public Customer(){
       list = new ArrayList<>();
    }

    public List<Goods> getList() {
        return list;
    }

    public void setList(List<Goods> list) {
        this.list = list;
    }

    public double getSumProce() {
        return sumProce;
    }

    public void setSumProce(double sumProce) {
        this.sumProce = sumProce;
    }

}
