package com.code.apiStringDemo;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        /*
        用户登录：
        需求：已知正确的用户名和密码，请用程序实现模拟用户登录。
             总共三次机会，灯枯之后，给叔相应的提示
         */


        //1.定义两个变量，记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);
        //2.模拟用户登录
        //键盘录入用户名和密码
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String InputUsersName = sc.next();
            System.out.println("请输入密码");
            String InputUsersPassWord = sc.next();

            //3.进行比较
            if (InputUsersName.equals(rightUsername) && InputUsersPassWord.equals(rightPassword)) {
                System.out.println("用户登录成功");
                break;
            } else {
                System.out.println("用户登录失败,用户名或者密码错误");
                if (i == 2) {
                    //最后一次机会也输入所悟,此时要提示账户被锁定
                    System.out.println("您的账户被锁定,请联系钱睿进行解锁");
                } else {
                    System.out.println("您还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }
}
