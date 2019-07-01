package model;

import model.animal.Cat;
import model.animal.Felidae;

import model.animal.Tiger;

public class Main {

    public static void main(String[] args) {

        Felidae felidae = new Felidae();
        Felidae tiger = new Tiger();
        Felidae cat = new Cat();
        felidae.favoriteFood();
        tiger.favoriteFood();
        cat.favoriteFood();



        /*
        Main m = new Main();
        System.out.println(m.calculate(1,2));
        System.out.println(m.calculate(2,2.0));
        m.calculate(1.1,2.0);*/
    }
    public int calculate(int a,int b){
        return a+b;
    }

    public double calculate(int a,double b){
        return a+b;
    }
    public void calculate(double a,double b){
        System.out.println(a+b);
    }
}
