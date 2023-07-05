package com.code.stringBuilder;

public class StringTest1 {
    public static void main(String[] args) {
        /*
        StringBuilder概述
            StringBuilder可以看成是一个容器,创建之后里面的内容是  可变  的

        作用:
            提高字符串的操作效率 不会产生过的无用的字符串

        StringBuilder的构造方法

                方法名                                            说明
        public StringBuilder()                  创建一个空白可变字符串对象,不含有任何内容
        public StringBuilder(String str)     根据字符串的内容,来创建可变字符串对象,相当于容器内部有一个初始化值
        public StringBuilder append(任意类型)               添加数据,并返回对象本身
        public StringBuilder reverse()                     反转容器中的内容
        public int length()                             返回长度(字符出现的个数)
        public String toString()                通过toString()就可以实现把StringBuilder转换为String
         */


        //创建对象:
        StringBuilder sb = new StringBuilder("abc");



        //添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append('a');
        sb.append("abc");
        sb.append(true);

        System.out.println(sb);

        //反转
        sb.reverse();


        //获取长度
        int len = sb.length();
        System.out.println(len);
        //打印

        //因为StringBuilder是Java已经写好的类
        //Java在底层对他进行了一些特殊的处理
        //打印对象不是地址值而是属性值.

        //如果使用空参构造,则打印出来的属性内没有任何数据
        System.out.println(sb);


    }
}
