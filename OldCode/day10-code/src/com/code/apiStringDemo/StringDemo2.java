package com.code.apiStringDemo;

public class StringDemo2 {
    public static void main(String[] args) {
        //1.创建两个字符串对象
        String s1 = new String(("abc"));
        String s2 = "abc";

        //2.进行比较 使用"=="
        //基本数据类型:比较的是数据值
        //引用数据类型:比较的是地址值
        System.out.println(s1 == s2);


        //3.比较字符串对象中的内容是否相等
        boolean result1 = s1.equals(s2);
        System.out.println(result1);

        //4.比较字符串对象中的内容是否相等，忽略大小写
        //      1  一   壹 不能及逆行忽略大小写的操作
        //忽略大小写只能是英文状态下的大小写
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);
    }
}
