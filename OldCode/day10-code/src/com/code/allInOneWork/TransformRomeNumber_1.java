package com.code.allInOneWork;

import java.util.Scanner;

public class TransformRomeNumber_1 {
    public static void main(String[] args) {
        /*
        练习：转换罗马数字
            键盘录入一个字符串
            要求1:长度为小于等于9;
            要求2:只能是数组;
            将内容变成罗马数字
            下面是阿拉伯数字跟罗马数字的对比关系
            Ⅰ-1、Ⅱ-2、Ⅲ-3、Ⅳ-4、Ⅴ-5、Ⅵ-6、Ⅶ-7、Ⅷ-8、Ⅸ-9;

            注意点:罗马数字里面没有0的
            如果键盘录入数字保罗0,可以变成" "(长度为0的字符串)

         */
        Scanner sc = new Scanner(System.in);


        System.out.println("请输入这个字符串的长度:");
        while (true) {
            int num = sc.nextInt();
            if (num >= 1 && num <= 9) {
                int[] arr = new int[num];
                StringBuilder sb = new StringBuilder();
                System.out.println("请输入每个字符串的索引");


                for (int i = 0; i < arr.length; i++) {
                    while (true) {
                        System.out.println("请输入第" + (i + 1) + "个数字:");
                        int index = sc.nextInt();
                        if (index >= 0 && index <= 9) {
                            arr[i] = index;
                            String romeNumber = getRomeNumber(arr[i]);
                            if (i == arr.length - 1) {
                                sb.append(romeNumber);
                            } else {
                                sb.append(romeNumber).append(",");
                            }
                            break;
                        } else {
                            System.out.println("您输入的数字不在0 ~ 9之间,请重新输入:");
                        }
                    }
                }
                String str = sb.toString();
                System.out.println(str);
                break;
            } else {
                System.out.println("您输入的数字不在1 ~ 9的范围内,请重新输入.");
            }
        }

    }

    //定义一个方法用来表示将数字转化为罗马数字
    public static String getRomeNumber(int number) {
        //使用索引使罗马数字和阿拉伯数字产生一一对应
        String[] arr = {" ", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return arr[number];
    }
}
