package com.qianrui.a04objectdemo4;

import java.util.StringJoiner;


//Cloneable
//如果一个接口里面没有抽象方法
//表示当前接口是一个标记性接口
//现在Cloneable表示一旦实现了，那么当前类的对象就可以被克隆
//如果没有实现，当前类的对象就不能克隆
public class User implements Cloneable {
	private int id;//游戏角色
	private String username;//用户名
	private String password;//密码
	private String path;//游戏图片
	private int[] data;//游戏进度


	public User() {
	}

	public User(int id, String username, String passworld, String path, int[] data) {
		this.id = id;
		this.username = username;
		this.password = passworld;
		this.path = path;
		this.data = data;
	}

	/**
	 * 获取
	 *
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 设置
	 *
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 获取
	 *
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 设置
	 *
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 获取
	 *
	 * @return passworld
	 */
	public String getPassworld() {
		return password;
	}

	/**
	 * 设置
	 *
	 * @param passworld
	 */
	public void setPassworld(String passworld) {
		this.password = passworld;
	}

	/**
	 * 获取
	 *
	 * @return path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * 设置
	 *
	 * @param path
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * 获取
	 *
	 * @return data
	 */
	public int[] getData() {
		return data;
	}

	/**
	 * 设置
	 *
	 * @param data
	 */
	public void setData(int[] data) {
		this.data = data;
	}

	public String toString() {
		return "角色编号" + id + ", 用户名" + username + ", 密码" + password + ", 游戏图片" + path + ", 进度" + arrToString() + "}";
	}

	private String arrToString() {
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		for (int i = 0; i < data.length; i++) {
			sj.add(data[i] + " ");
		}
		return sj.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//调用父类中的clone方法
		//相当于让Java帮我们克隆一个对象，并把克隆之后的对象返回出去
		return super.clone();
	}
}
