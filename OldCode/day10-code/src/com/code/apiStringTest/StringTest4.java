package com.code.apiStringTest;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        //1.键盘录入一个金额
        Scanner sc = new Scanner(System.in);

        int money;
        //ctrl + alt + t
        //进行数据的校验
        while (true) {
            System.out.println("请输入一个金额：");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效，请重新输入！");
            }
        }


        //定义一个变量用来表示钱的大写
        String moneyStr = "";
        //2.得到money里面的每一位数字,再转成中文数组
        while (money != 0) {
            //从右王座获取数据,因为右侧是数据的个位
            int digit = money % 10;
            String capitalNumber = getCapitalNumber(digit);
            moneyStr = capitalNumber + moneyStr;   //注意前后变量的顺序

            money /= 10;
        }


        //3.在前面补0,补齐7位
        int count = 7 - moneyStr.length();

        for (int i = 0; i < count; i++) {
            moneyStr = getCapitalNumber(0) + moneyStr;
        }

        //4.插入单位
        //定义一个数组表示单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};


        //遍历moneyStr,依次得到数组中的每一个数字
        //然后把arr之间的单位插入进去


        String result = "";


        System.out.println("该数字的中文表示为:");
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
            //打印一下单位
        }


        System.out.println(result);
    }

    //定义一个方法，把阿拉伯数字变成大写的中文数字
    public static String getCapitalNumber(int number) {
        //索引和数字产生了一一对应的关系
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number]; //此时number对应的是索引的数字
    }
}
