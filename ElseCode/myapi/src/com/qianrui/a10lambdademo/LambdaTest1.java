package com.qianrui.a10lambdademo;

import java.util.Arrays;

public class LambdaTest1 {
	public static void main(String[] args) {
        /*

            练习:按照要求进行排序
                定义数组并存储一些女朋友对象,利用Arrays中的sort方法进行排序.
                要求1:属性有姓名、年龄、身高。
                要求2:按照年龄的大小进行排序,如果年龄一样,则按照身高排序,
                身高一样则按照姓名的字母进行排序.
                (姓名中不能有中文或者特殊字符)

         */


        /*
         //compareTo是通过查找ASCII来进行比较的
         String s1 = "a";    //97
         String s2 = "b";    //98

         System.out.println(s1.compareTo(s2));   //-1

         //将其中每个元素进行遍历再进行查询ASCII进行比较
         String s3 = "abc";
         String s4 = "abd";
         System.out.println(s3.compareTo(s4));   //-1
        */

		//1.创建三个女朋友的对象
		GirlFriend gf1 = new GirlFriend("xiaoshishi", 18, 1.67);
		GirlFriend gf2 = new GirlFriend("xiaodandan", 18, 1.72);
		GirlFriend gf3 = new GirlFriend("xiaohuihui", 19, 1.65);

		//2.定义数组存储女朋友的信息
		GirlFriend[] arr = {gf1, gf2, gf3};

		//3.利用Arrays中的sort方法进行排序
		//匿名内部类 lambda表达式
        /*Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                //按照年龄的大小进行排序,如果年龄一样,则按照身高排序,
                //身高一样则按照姓名的字母进行排序.
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if (temp > 0) {
                    return 1;
                } else if (temp < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });*/


		//lambda表达式
		//格式：
		// () -> {}
		// ():对应抽象方法的形参
		// {}:对应着方法体
		Arrays.sort(arr, (o1, o2) -> {
					//按照年龄的大小进行排序,如果年龄一样,则按照身高排序,
					//身高一样则按照姓名的字母进行排序.
					double temp = o1.getAge() - o2.getAge();
					temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
					temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

					if (temp > 0) {
						return 1;
					} else if (temp < 0) {
						return -1;
					} else {
						return 0;
					}
				}
		);


		//4.遍历数组中的内容
		System.out.println(Arrays.toString(arr));

	}
}

class GirlFriend {
	private String name;
	private int age;
	private double height;


	public GirlFriend() {
	}

	public GirlFriend(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
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

	/**
	 * 获取
	 *
	 * @return height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * 设置
	 *
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		return "GirlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
	}
}
