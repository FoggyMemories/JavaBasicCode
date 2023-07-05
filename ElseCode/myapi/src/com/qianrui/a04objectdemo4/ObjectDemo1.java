package com.qianrui.a04objectdemo4;

public class ObjectDemo1 {
	public static void main(String[] args) {
		/*
		 * public String toString()                      返回对象的字符串表示形式
		 * public boolean equals(Object obj)             比较两个对象是否相等
		 * protected Object clone(int a)                 对象克隆
		 *
		 * */

		Object obj = new Object();
		String str1 = obj.toString();
		System.out.println(str1);   //java.lang.Object@6f496d9f

		Student stu = new Student();
		String str2 = stu.toString();
		System.out.println(str2);   //com.qianrui.a04Objectdemo4.Student@10f87f48

		//细节：
		//System:类名
		//out:静态变量
		//System.out:获取打印的对象
		//println():方法
		//参数:表示打印的内容

		//核心逻辑:
		//当我们打印一个对象的时候,底层会调用对象的toString方法,把对象变成字符串.
		//然后在打印在控制台上,打印完毕换行处理.
		System.out.println(stu);    //com.qianrui.a04Objectdemo4.Student@10f87f48

		//想要看到对象内部的属性值:
		//处理方法:重写父类Object类中的toString方法
		Teacher t1 = new Teacher();
		String str3 = t1.toString();
		System.out.println(str3);   //Teacher{name = null, age = 0}


		//toString方法结论:
		//如果我们打印一个对象,想要看到属性值的话,那么就重写toString方法就可以了.
		//在重写的方法中,把对象的属性值进行拼接.
	}
}