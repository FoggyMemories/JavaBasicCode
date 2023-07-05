package com.day05.demo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        /*
        定义一个数组,用来存储班级中50个学生的姓名
            姓名未知,等学生报道之后,再进行添加.
         */


        //格式:
        //数据类型[] 数组名 = new 数据类型[数组长度]
        //在创建的时候,由我们自己指定数组的长度,由虚拟机给出默认的初始化值
        String[] arr = new String[50];
        //添加学生
        arr[0] = "张三";
        arr[1] = "李四";  //称之为动态初始化创建,并添加学生信息

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);    //null , 打印出来的是默认初始化值

        /*
        数组默认初始化值的规律:
                整数类型:默认初始化值为0
                小数类型:默认初始化值为0.0
                字符类型:默认初始化值为'\u0000'空格
                布尔类型:默认初始化值为 false
                引用数据类型:默认初始化值为 null
         */

        int[] arr2 = new int[3];
        System.out.println(arr2[0]);//0
        System.out.println(arr2[1]);//0
        System.out.println(arr2[2]);//0
    }
}
