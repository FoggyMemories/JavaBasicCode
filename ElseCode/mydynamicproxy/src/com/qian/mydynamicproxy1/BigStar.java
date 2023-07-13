package com.qian.mydynamicproxy1;

public class BigStar {
	private String name;


	public BigStar() {
	}

	public BigStar(String name) {
		this.name = name;
	}

	//唱歌 跳舞

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

	public String toString() {
		return "BigStar{name = " + name + "}";
	}
}
