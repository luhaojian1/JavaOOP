package model.animal;

public class Animal {
    private int age;
    private double weight;

    public Animal(){}
    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    protected void sound(){
        System.out.println("animal 的叫声");
    }

    public void eating(){
        System.out.println("animal 正在吃东西。");
    }

    public void doSport(){
        System.out.println("animal 正在运动。");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

