package com.qianrui.a08regexdemo8;

public class RegexDemo1 {
	public static void main(String[] args) {
		//验证qq号码是否正确
		//6-20位之间，0不能在开头，必须全是数字
		String qq = "12344567890";

		System.out.println(qq.matches("[1-9]\\d{5,19}"));


	}
}
