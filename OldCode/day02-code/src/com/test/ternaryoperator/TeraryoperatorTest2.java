package com.test.ternaryoperator;

public class TeraryoperatorTest2 {
    public static void main(String[] args) {
        /*需求：一座寺庙住着三个和尚，已知他们的身高分别为
        150cm、210cm、165cm，
        请用程序实现获取这三个和尚的最高身高
         */

        int a = 150;
        int b = 210;
        int c = 165;

        int x = a > b ? a : b;
        int y = x > c ? x : c;

        System.out.println("这三个和尚的最高身高为：");
        System.out.println(y);
    }
}
