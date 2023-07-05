package com.day05.demo;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {1,2,3,4,5};
        //已知:
        //长度:5
        //最小索引:0
        //最大索引:4 (数组长度-1)
        System.out.println(arr[10]);
        /*
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
	at com.day06.demo.ArrayDemo5.main(ArrayDemo5.java:11)
	    索引越界异常
         */

        //小结:索引越界异常
        //原因:访问了一个不存在的索引
        //避免:索引的范围
    }
}
