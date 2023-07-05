package com.qianrui.order;

import java.util.Scanner;

public class ForTest2 {
    public static void main(String[] args) {
        /*
        练习：
            需求：键盘录取两个数字，表示一个范围。
            统计这个范围中，既能被3整除，又能被5整除的整数有多少个。

         */
        System.out.println("请录入第一个整数表示范围开始：");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("请录入第二个整数表示范围结束：");
        int end = sc.nextInt();

        int count = 0;
        for(int i = start;i <= end;i++){
            if(i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
