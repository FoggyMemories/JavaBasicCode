package com.day06.methodtest;

public class MethodTest1 {
    public static void main(String[] args) {
        /*
        练习:看代码说结果1
            目标:能说出方法调用时的执行过程
         */
        System.out.println("a");
        method1();
        System.out.println("b");
    }

    public static void method1(){
        method2();
        System.out.println("c");
        System.out.println("d");
    }
    public static void method2(){
        System.out.println("e");
        System.out.println("f");
    }
}
