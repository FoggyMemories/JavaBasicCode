package com.code.apiStringTest;

import java.util.Scanner;

public class StringTest6 {
    public static void main(String[] args) {
        /*
        身份证信息查看
         */

        //1.定义一个字符串来记录身份证号码
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个有效的身份证号码:");
            String id = sc.next();
            if (id.length() == 18) {

                String year = id.substring(6, 10);
                String month = id.substring(10, 12);
                String date = id.substring(12, 14);
            /*
            String sex = id.substring(18);
            此时为单个索引，可以直接用charAt来进行获取
            */

                //性别获取：
                char gender = id.charAt(16);
                //利用ASCII码表进行转换
                /*

                System.out.println('0' + 0);
                快速查询ASCII码表的位置

                */


                //‘0’ ---> 48
                //‘1’ ---> 49
                //‘2’ ---> 50
                //‘3’ ---> 51
                //‘4’ ---> 52
                //‘5’ ---> 53
                //‘6’ ---> 54
                //‘7’ ---> 55
                //‘8’ ---> 56
                //‘9’ ---> 57


                //通过查询将char类型转化为int类型
                int num = gender - 48;

                System.out.println("人物信息为:");
                System.out.println("出生年月日：" + year + "年" + month + "月" + date + "日");

                System.out.println("性别为:");
                //进行对num的奇偶性判断
                if (num % 2 == 1) {
                    System.out.println("男性");
                } else {
                    System.out.println("女性");
                }
                break;
            } else {
                System.out.println("您所输入的位数有误,请重新输入.");
            }
        }
    }
}
