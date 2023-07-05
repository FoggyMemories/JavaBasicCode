package com.day05.demo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //利用索引对数组中的元素进行访问
        //1.获取数组里面的数据
        //  格式:数组名[索引]
        int[] arr = {1,2,3,4,5};
        //获取数组中的第一个元素
        //其实就是 0 索引上对应的元素
        int number = arr[0];
        System.out.println(number);    //   1  ,此时最前面一位是0号位
        System.out.println(arr[1]);
        //获取数组中 1 索引上对应的数组，并且打印出来

        //2.把数据存储到数组当中
        //格式：数组名[索引] = 具体数组/变量;
        //细节:一旦覆盖之后,原来的数据就不存在了.

        arr[0] = 100;

        System.out.println(arr[0]);





    }
}
