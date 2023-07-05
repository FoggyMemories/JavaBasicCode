package com.qianrui.a04objectdemo4;

public class ObjectDemo2 {
	public static void main(String[] args) {
		//public boolean equals(Object obj)             比较两个对象是否相等

		Student s1 = new Student();
		Student s2 = new Student();

		boolean result1 = s1.equals(s2);    //判断地址值是否相同
		System.out.println(result1);

		//结论:
		//1.如果没有重写equals方法,那么默认使用Object中的方法进行比较,比较的是地址值是否相等
		//2.一般来讲地址值对我们意义不大,所以我们会重写,重写之后比较的就是对象内部的属性值了.
	}
}
