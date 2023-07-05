package com.test;

public class 字符串的加号操作 {
    public static void main(String[] args) {
        System.out.println("字符串的加号操作，详情看注释");
        //当“+”操作中出现字符串时，这个“+”是字符串连续符，而不是算术运算符了。
        //会将前后的数据进行拼接，并产生一个新的字符串。

        System.out.println("例如：");
        System.out.println("123" + 123);

        //连续进行“+”操作时，从左到右逐个执行
        System.out.println(1 + 99 + "100" + "test");    //前两个数先进行求和操作，后面的再去将字符串进行合并
        //从左到右进行运算
        System.out.println("例子：");
        System.out.println(3.7 + "abc");     //3.7abc
        System.out.println("abc" + true);    //abcture
        System.out.println('中' + "abc" + true);   //中abctrue

        int age = 18;
        System.out.println("我的年龄是" + age + "岁");
        System.out.println("我的年龄是" + "age" + "岁");   //此处的age为字符串模式

        System.out.println(1 + 2 + "abc" + 2 + 1);     //*"3abc21"*
        //在连续加的时候是从左到右进行运算的，但是，只要遇到字符串就进行拼接操作。
    }
}
