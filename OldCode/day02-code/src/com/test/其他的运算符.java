package com.test;

public class 其他的运算符 {
    public static void main(String[] args) {
        /*
              运算符           含义              运算规则
                &             逻辑与           0为false 1为true
                |             逻辑或           0为false 1为true
               <<              左移            向左做移动，低位补0
               >>              右移            向右移动，高位补0或1
               >>>          无符号右移          向右移动，高位补0
         */


        //1.  &
        int a = 200;
        int b = 10;
        System.out.println(a & b);

        System.out.println(a | b);

        System.out.println(a << 2);

        System.out.println(a >> 2);   //根据整数的正负来补0或1

        System.out.println(a >>> 2);  //无论是正负，前面都补0
    }
}
