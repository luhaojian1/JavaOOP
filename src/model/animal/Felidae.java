package model.animal;
//猫科动物
public class Felidae extends Animal {

    public Felidae(int age, double weight) {
        super(age, weight);
    }

    public Felidae(){

    }
    public void voice(){
        System.out.println("喵喵叫。");
    }

    public void favoriteFood(){
        System.out.println("猫科动物吃喜欢。。。");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
    }
}
