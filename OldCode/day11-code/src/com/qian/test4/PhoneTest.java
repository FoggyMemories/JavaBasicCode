package com.qian.test4;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        /*
        练习：添加手机对象并返回要求的数据
            需求：
                定义JavaBean类：Phone
                Phone的属性：品牌，价格。
                main方法中定义一个集合，存入三个手机对象。
                分别是：小米，1999；苹果，8999；锤子，2999；
                定义一个方法，将价格低于3000的手机信息进行返回
         */
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("xiaomi", 1999);
        Phone p2 = new Phone("Apple", 8999);
        Phone p3 = new Phone("ChuiZi", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> findlist = find(list);

        //遍历集合
        for (int i = 0; i < findlist.size(); i++) {
            Phone phone = findlist.get(i);
            System.out.println(phone.getBrand() + ", " + phone.getPrice());
        }
    }


    //技巧：
    //如果需要返回多个数据，可以先把这些数据先放到一个容器当中，再把容器返回
    public static ArrayList<Phone> find(ArrayList<Phone> list) {

        //定义一个集合，用于存储价格低于3000的对象
        ArrayList<Phone> resultlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            //如果当前手机价格低于3000，那么九八手机对象添加到返回集合当中
            if (price < 3000) {
                resultlist.add(p);
            }
        }
        return resultlist;
    }
}
