package com.code.apiStringDemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.键盘录入一个abc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();   //abc   是new出来的，所以上下两个的地址值不同，用“==”比较之后结果永远是false
        //2.代码中再定义一个字符串abc
        String str2 = "abc";
        //3.用 “ == ” 进行比较，这两者的结果能一样么？
        System.out.println(str1 == str2);  //false



        //结论：
        //以后只要相比较字符串的内容，就必须要用String里面的方法
    }
}
