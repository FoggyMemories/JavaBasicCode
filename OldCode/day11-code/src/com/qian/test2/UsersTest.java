package com.qian.test2;

import java.util.ArrayList;

public class UsersTest {
    public static void main(String[] args) {
        /*
        练习：添加用户对象并判断是否存在
            需求：
                1.main方法中定义一个集合，存入三个用户对象
                    用户属性为：id，username，password
                2.要求：定义一个方法，根据id查找对应的用户信息。
                       如果存在则返回true
                       如果不存在则返回false
         */

        ArrayList<Users> list = new ArrayList<>();

        Users u1 = new Users("1","zhangsan","123456asd");
        Users u2 = new Users("2","lisi","123456asd");
        Users u3 = new Users("3","wangwu","123456asd");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        //调用方法查看id是否存在
        boolean result = find(list,"1");
        System.out.println(result);
    }
    public static boolean find(ArrayList<Users> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equalsIgnoreCase(id)){
                //找到相同的，返回true
                return true;
            }
        }
        return false;
    }
}
