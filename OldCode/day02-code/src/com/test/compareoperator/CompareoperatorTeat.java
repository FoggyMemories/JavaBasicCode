package com.test.compareoperator;

import java.util.Scanner;

public class CompareoperatorTeat {
    public static void main(String[] args) {
        System.out.println("你和你的约会对象在餐厅里面正在约会。");
        System.out.println("请输入一个0~10之间的整数，表示你的衣服的时髦度");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("请输入一个0~10之间的整数，表示和你约会的对象衣服的时髦度");
        Scanner se = new Scanner(System.in);
        int y = se.nextInt();

        System.out.println("现在看看你是否能相亲成功：");
        System.out.println(i > y);

        //第二种表达方式：
        boolean result = i > y;
        System.out.println(result);
    }
}
