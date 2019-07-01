package model.animal;

public class Tiger extends Felidae {
    public Tiger(int age, double weight) {
        super(age, weight);
    }
    public Tiger(){
    }

    public void favoriteFood(){
        System.out.println("老虎吃喜欢肉");
    }
}
