package com.qianrui.exercise;

public class Test6 {
    public static void main(String[] args) {
        /*
        练习:数字加密
             需求:输入一个数字,先得到每位数字,
                  然后每位数都加上5,在对10求余,
                  最后将所有数字反转,得到遗传新数.
         */
        int[] arr = {2, 0, 0, 2};
        //每位数字加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }

        //每位数字对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;
        }

        //所有数字进行反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println("加密过后的数字是:" + number);
    }
}
