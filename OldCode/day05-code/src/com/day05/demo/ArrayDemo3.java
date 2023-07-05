package com.day05.demo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1,2,3,4,5};

        //2.获取数组里面所有的元素
        //格式：数组名[索引]
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //利用循环改进代码
        //开始条件:0
        //结束条件:4(数组长度-1(最大索引))

        for (int i = 0; i < 5; i++) {
            //此时i变化的范围就是 0 ~ 4
            System.out.println(arr[i]);
        }

        //在java当中,关于数组的一个长度属性,length
        //调用方法:数组名.length
        System.out.println("该数组的长度为:");
        System.out.println(arr.length);
        for (int a = 0; a < arr.length; a++) {
            System.out.println(a);
        }
        //扩展
        //自动的快速生成数组的遍历方式
        //idea提供的:
        //数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
