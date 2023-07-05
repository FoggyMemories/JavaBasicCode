package com.qianrui.order;

public class SwitchDemo3 {
    public static void main(String[] args) {
        /*
                switch新特性
                    JDK12以上
         */

        int number = 1;
        switch (number) {
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            default:
                System.out.println("没有这种选项.");
                break;
        }

        int num = 1;
        switch (num) {
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
            default -> {
                System.out.println("没有这种选项.");
            }
        }

        int x = 1;
        switch (x) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这种选项.");
        }

    }
}
