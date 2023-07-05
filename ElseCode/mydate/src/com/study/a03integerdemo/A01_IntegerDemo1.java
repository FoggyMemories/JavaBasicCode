package com.study.a03integerdemo;

public class A01_IntegerDemo1 {
	public static void main(String[] args) {
        /*
            public Integer(int value)                            根据传递的整数创建一个Integer对象
            public Integer(String s)                             根据传递的字符串创建一个Integer对象
            public static Integer valueOf(int i)                 根据传递的整数创建一个Integer对象
            public static Integer valueOf(String s)              根据传递的字符串创建一个Integer对象
            public static Integer valueOf(String s, int radix)   根据传递的字符串和进制创建一个Integer对象
                                                   //radix表示进制
         */

		//1.利用构造方法获取Integer的对象(JDK5以前的方式)   已废弃,仅作了解
        /*
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("1");
        System.out.println(i1);
        System.out.println(i2);
        */

		//2.利用静态方法获取Integer的对象(JDK5以前的方式)
        /*
        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf("123");
        Integer i5 = Integer.valueOf("123", 8);

        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5); //83    8进制再转化为10进制
        */

		//3.以下两种方式获取对象的区别(掌握)
		Integer i6 = Integer.valueOf(127);
		Integer i7 = Integer.valueOf(127);
		System.out.println(i6 == i7);

		Integer i8 = Integer.valueOf(128);  //超出范围，范围为byte，每次都是new出来的
		Integer i9 = Integer.valueOf(128);
		System.out.println(i8 == i9);

		//new关键字：在Java中，每一次new都是创建了一个新的对象
		//所以下面两个对象都是new出来的，地址值不一样。
		Integer i10 = new Integer(127);
		Integer i11 = new Integer(127);
		System.out.println(i10 == i11);

		Integer i12 = new Integer(128);
		Integer i13 = new Integer(128);
		System.out.println(i12 == i13);
	}
}
