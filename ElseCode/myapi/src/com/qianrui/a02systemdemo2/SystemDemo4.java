package com.qianrui.a02systemdemo2;

public class SystemDemo4 {
	public static void main(String[] args) {
		//拷贝数组
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] arr2 = new int[10];
		//把arr1数组中的数据拷贝到arr2中
		System.arraycopy(arr1, 0, arr2, 4, 3);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();


		//细节：
		//1.如果数据源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
		/*int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 *double[] arr2 = new double[10];
		 *
		 *System.arraycopy(arr3, 0, arr4, 0, 10);
		 *for (int i = 0; i < arr4.length; i++) {
		 *    System.out.print(arr4[i] + " ");
		 *     }
		 * */
		//java.lang.ArrayStoreException: arraycopy: type mismatch: can not copy int[] into double[]


		//2.在拷贝的时候需要考虑数组的长度,如果超出范围也会报错
		//3.如果数组源数组和目的地数组都是引用数据类型,那么子类类型可以赋值给父类类型
		Student s1 = new Student("zhangsan", 20);
		Student s2 = new Student("lisi", 21);
		Student s3 = new Student("wangwu", 22);

		Student[] arr5 = {s1, s2, s3};
		Student[] arr6 = new Student[3];
		Person[] arr7 = new Student[3];
		System.arraycopy(arr5, 0, arr6, 0, 3);
		for (int i = 0; i < arr6.length; i++) {
			System.out.println(arr6[i].getName() + " " + arr6[i].getAge());
		}
		System.out.println();

		//把arr5中对象的地址值赋值到arr6中
		System.arraycopy(arr5, 0, arr6, 0, 3);
		for (int i = 0; i < arr6.length; i++) {
			System.out.println(arr6[i].getName() + " " + arr6[i].getAge());
		}
		System.out.println();

		//把arr5中对象的地址值赋值到arr7中
		System.arraycopy(arr5, 0, arr7, 0, 3);
		for (int i = 0; i < arr7.length; i++) {
			System.out.println(arr7[i].getName() + " " + arr7[i].getAge());
		}
		System.exit(0);
	}
}


class Person {
	private String name;
	private int age;


	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Person{name = " + name + ", age = " + age + "}";
	}
}


class Student extends Person {

	public Student() {

	}

	public Student(String name, int age) {
		super(name, age);
	}
}
