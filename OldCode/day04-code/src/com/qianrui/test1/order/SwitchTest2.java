package com.qianrui.test1.order;

import java.util.Scanner;

public class SwitchTest2 {
    public static void main(String[] args) {
        /*
        练习：
             用户选择：
             在实际开发中，如果我们需要再多种情况下选择其中一个，就可以使用switch语句。
             当我们拨打了某些服务电话时，一般都会有案件选择。
             假设现在我们拨打了一个机票预订电话。
             电话中语音提示：
             1.机票查询
             2.机票预订
             3.机票改签
             4.退出服务
             其他按键也是退出服务。
             请用switch模拟改业务逻辑。

         */

        System.out.println("您现在正在拨打本航班机票预定电话,");
        System.out.println("请根据提示音来按整数数字.");
        System.out.println("1.机票查询");
        System.out.println("2.机票预订");
        System.out.println("3.机票改签");
        System.out.println("4.退出服务");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        switch (num){
            case 1 -> System.out.println("您正在进行机票查询");
            case 2 -> System.out.println("您正在进行机票预订");
            case 3 -> System.out.println("您正在进行机票改签");
            case 4 -> System.out.println("现在退出服务.");
            default -> System.out.println("按键出现错误,退出服务.");
        }
    }
}
