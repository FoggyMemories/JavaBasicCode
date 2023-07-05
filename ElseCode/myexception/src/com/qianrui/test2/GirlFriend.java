package com.qianrui.test2;

public class GirlFriend {
	private String name;
	private int age;

	public GirlFriend() {
	}

	public GirlFriend(String name, int age) {
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
	 *
	 * @param name
	 */
	public void setName(String name) {
		int len = name.length();
		if (len < 3 || len > 10) {
			throw new NameFormatException(name + "格式有误,长度应当为:3 ~ 10");
		}
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
		if (age < 18 || age > 25) {
			throw new AgeOutBoundsException(age + "超出了范围,年龄应当为:18 ~ 25");
		}
		this.age = age;
	}

	public String toString() {
		return "GirlFriend{name = " + name + ", age = " + age + "}";
	}
}
