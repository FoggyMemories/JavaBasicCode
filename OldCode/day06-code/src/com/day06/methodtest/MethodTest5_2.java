package com.day06.methodtest;

import java.util.Scanner;

public class MethodTest5_2 {
    public static void main(String[] args) {
        /*
        练习：判断是否存在
            定义一个方法，判断数组中的某一个数是否存在，将结果返回给调用处。
         */
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数，查看该整数是否存在于数组中");

        int i = sc.nextInt();
        getCheck(arr,i);
    }
    public static boolean getCheck(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                System.out.println("该数属于数组之中。");
                return true;
            }
        }
        System.out.println("该数不属于数组之中。");
        return false;
    }
}



//return break 关键字的区别
//return:其实跟循环没有什么关系，跟方法有关的，表示1.结束方法  2.返回结果
//       如果方法执行到了return，那么整个方法全部结束，里面的循环也会随之结束

//break关键字
//其实跟方法没有什么关系，结束循环 或者 结束switch的