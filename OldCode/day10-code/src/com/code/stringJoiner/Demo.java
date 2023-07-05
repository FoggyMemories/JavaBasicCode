package com.code.stringJoiner;

import java.util.StringJoiner;

public class Demo {
    public static void main(String[] args) {
        /*
        StringJoiner概述
        StringJoiner和StringBuilder一样，也可以看成是一个容器，创建之后里面的内容是可变的。
        作用：提高字符串的操作效率，而且代码编写特别简洁，但是目前市场上很少有人用。

        JDK8出现的

        StringJoiner的构建方法
                    方法名                                                说明
        public StringJoiner(间隔符号)                     创建一个StringJoiner对象,指定拼接的间隔符号
        public StringJoiner(间隔符号,开始符号,结束符号)     创建一个StringJoiner对象,指定拼接时的间隔符号、开始符号、结束符号
         */

        StringJoiner sj = new StringJoiner("---"); //  1---2---3
        StringJoiner sj1 = new StringJoiner(",", "[", "]");  //[1, 2, 3]

        /*
        StringJoiner的成员方法
                            方法名                             说明
         public StringJoiner add(添加的内容)          添加数据,并返回对象本身
         public int length()                        返回长度(字符出现的个数)
         public String toString()                   返回一个字符串(该字符串就是拼接之后的结果)
         */

    }
}
