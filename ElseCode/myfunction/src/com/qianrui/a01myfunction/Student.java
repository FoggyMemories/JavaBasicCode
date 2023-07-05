package com.qianrui.a01myfunction;

public class Student {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}


	//参数依次表示流里面的每一个数据
	public Student(String s) {
		String[] arr = s.split(",");

		//直接赋值给成员变量
		this.name = arr[0];
		this.age = Integer.parseInt(arr[1]);
	}


	/**
	 * 获取
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取
	 *
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 设置
	 *
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Student{name = " + name + ", age = " + age + "}";
	}
}
