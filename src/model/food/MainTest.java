package model.food;

import java.util.*;

public class MainTest {

    public static List<Goods> list = Goods.foodList;
    public static void main(String[] args) {

        list.add(new Goods("f1","黄焖鸡",15,true));
        list.add(new Goods("f2","凉皮",4,true));
        list.add(new Goods("f3","肉夹馍",6,true));
        list.add(new Goods("f4","蒜蓉菜心",7,false));
        //Scanner scanner = new Scanner(System.in);
        MainTest mt = new MainTest();
        mt.bestCharge("f2 x 4,f1 x 1");
    }
    public  void bestCharge(String foodList) {
        String[] arr = foodList.split(",");
        double overSum = 0;
        double halfPriceSum = 0;
        double sum = 0,finalSum = 0;
        StringBuffer halfFood = new StringBuffer();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String food : arr) {
            String[] arr1 = food.split("x");
            map.put(arr1[0].trim(), Integer.parseInt(arr1[1].trim()));
        }
        System.out.println("============= 订餐明细 =============");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String foodId = entry.getKey();
            int count = entry.getValue();
            for (Goods goods : list) {
                if (goods.getId().compareTo(foodId) == 0) {
                    System.out.println(goods.getItem() + " x " + count + " = " + (goods.getUnitPrice() * count) + "元");
                    overSum += goods.getUnitPrice() * count;
                    if (count == 1 && goods.isHalfPrice()) {
                        halfPriceSum += goods.getUnitPrice() / 2;
                        halfFood.append(goods.getItem() + ";");
                    } else halfPriceSum += goods.getUnitPrice() * count;
                }
            }
        }
                System.out.println("-----------------------------------");
                System.out.println("使用优惠：");
                if (overSum >= 30)
                    sum = overSum -6;
                else sum = overSum;
                if (sum > halfPriceSum){
                    System.out.println("指定菜品半价("+halfFood+"),省"+(overSum-halfPriceSum)+"元");
                    finalSum = halfPriceSum;
                }
                else if (sum < halfPriceSum){
                    System.out.println("满30减6元，省6元");
                    finalSum = sum;
                }
                System.out.println("-----------------------------------");
                System.out.println("总计："+finalSum+ "元");
                System.out.println("===================================");

    }
}
