package com.code.test2;

public class Test {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

        //两部分参数：
        //第一部分参数：要输出的内容%s（占位）
        //第二部分参数：填充的数据
        System.out.printf("你好啊%s\n","张三");
        System.out.printf("%s你好啊%s","张三","李四");
    }
}
