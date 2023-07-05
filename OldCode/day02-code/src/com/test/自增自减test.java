package com.test;

public class 自增自减test {
    public static void main(String[] args) {
        int x = 10;
        //先用后加
        //先把x中的变量值拿出来用，先赋值给y，然后再运行自增。
        //赋值给y的指是自增前的。
        int y = x++;  //x = 11 , y = 10。
        //先用后加
        int z = ++x;  //x = 12 , z = 12。
        //先加后用
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("z:" + z);

    }
}
