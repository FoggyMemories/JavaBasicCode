package com.test.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        //+
        System.out.println(3 + 2);//5
        //-
        System.out.println(5 - 1);//4
        //*
        System.out.println(7 * 9);//63

        //如果在计算的时候有小数参与
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);

        System.out.println(1.1 + 1.1);
        //结论：
        //在代码中，如果有小数参与计算，结果有可能是不精确的

        double a = 1.1;
        double b = 1.01;

        System.out.println(a + b);
        //设计小数在计算机里存储的方式

    }
}
