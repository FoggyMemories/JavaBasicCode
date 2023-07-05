package com.test;

public class 变量规则 {
    public static void main(String[] args) {
        /*算术运算符
        *隐式转换*
        1.取值范围
        byte < short < int < long < float < double
        2.什么时候转换？
        数据类型不一样，不能进行运算，需要转成一样的才可以进行运算。
        3.准换规则1
        取值范围小的和取值范围大的进行运算，小的回先提升为大的，再进行运算。
        4.转换规则2
        byte short char 三种类型的数据再运算的时候都会先提升为int，然后再进行运算。

        *强制转换*
        从大到小的转换
        如果把一个取值范围大的数值，赋值给取值范围小的变量，是不允许直接进行赋值的。如果一定要这么做就需要加入强制转换。

        格式：目标主句类型 变量名 = （目标数据类型）被强制转换的数据
        范例：
        double a = 12.3
        int b = (int)a;
        有可能导致数据错误




        */
        System.out.println("规则详情请看注释");

        int a = 300;
        byte b = (byte)a;
        System.out.println(b);//大转小导致结果出现问题

        byte x = 10;
        byte y = 20;
        byte z = (byte)(x + y);    //需要同时将两个字符进行强制转换，应该转换其结果。

        System.out.println(z);
    }
}
