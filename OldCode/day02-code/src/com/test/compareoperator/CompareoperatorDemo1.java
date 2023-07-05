package com.test.compareoperator;

public class CompareoperatorDemo1 {
    public static void main(String[] args) {
        //1.  ==  判断左右两边是否相等
        int a = 10;
        int b = 10;
        int c = 20;
        System.out.println(a == b);
        System.out.println(a == c);

        //2.  !=  判断左右两边是否不相等
        System.out.println(a != b);
        System.out.println(a != c);

        //3.  <  判断左边是否小于右边
        System.out.println(a < b);
        System.out.println(a < c);

        //4.  <=  判断左边是否小于等于右边
        System.out.println(a <= b);
        System.out.println(a <= c);

        //5.  >  判断左边是否大于右边
        System.out.println(a > b);
        System.out.println(a > c);

        //6.  >=  判断左边是否大于等于右边
        System.out.println(a >= b);
        System.out.println(a >= c);
    }
}
