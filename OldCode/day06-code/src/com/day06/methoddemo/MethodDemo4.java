package com.day06.methoddemo;

public class MethodDemo4 {
    /*
    输入求和
    带参数方法调用
            单个参数                            多个参数
    单个参数:方法名(参数);            多个参数: 方法名(参数1,参数2,……);
    范例1: method(10);               范例1: getSum(10,20;);
    范例2: method(变量);              范例2: getSum(变量1,变量2);
     */
    public static void main(String[] args) {
        getSum(10,20);    //在括号中输入分别数字进行传递   实参 : 实际参数,方法调用中的参数
    }
    public static void getSum(int a,int b){   //括号里面称之为  形参 : 形式参数,值方法中的参数
        int c = a + b;
        System.out.println(c);
    }
    //注意:方法调用时,形参和实参必须一一对应,斗则程序将报错
}
