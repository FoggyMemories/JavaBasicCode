package com.code.allInOneWork;

import java.util.Scanner;

public class TransformRomeNumber_2 {
    public static void main(String[] args) {
        //键盘录入一个字符
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串:");
            str = sc.next();

            //进行规则校验
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前的字符串不符合规则,请重新输入");
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = c - 48;
            String s = getRomeNumber(num);
            System.out.print(s + " ");
            sb.append(s).append(" ");

        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s1 = changeRome(c);
            System.out.print(s1 + " ");
        }
        System.out.println();
        System.out.println(sb);
    }

    //校验字符串是否满足规则
    public static boolean checkStr(String str) {
        //长度小于等于9
        if (str.length() > 9 || str.length() == 0) {
            return false;
        }

        //只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static String getRomeNumber(int number) {
        //使用索引使罗马数字和阿拉伯数字产生一一对应
        String[] arr = {" ", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return arr[number];
    }


    //利用switch进行匹配
    public static String changeRome(char number) {

        //JDK12之后出现的新内容:
        String str = switch (number) {
            case '0' -> " ";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> "";
        };
        return str;
    }
}
