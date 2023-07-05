package com.day06.methoddemo;

public class MethodDemo3 {
    public static void main(String[] args) {
        /*
        练习:人肉计算器
            需求:定义一个方法,在方法内部定义两个变量
                 求出他们的和并进行打印.
         */
        Total();
    }

    public static void Total(){
        int a = 10;
        int b = 10;
        int c = a + b;
        System.out.println(c);
    }
}
