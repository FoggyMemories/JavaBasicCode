package com.qianrui.a08regexdemo8;

public class RegexTest13 {
	public static void main(String[] args) {
		/*
		 *
		 * 非捕获分组:
		 *   分组之后不需要再用本组数据,仅仅是把数据括起来
		 *
		 * */

		//省份证号码的建议正则表达式
		String regex = "[1-9]\\d{16}(\\d|X|x)";
		//非捕获分组:仅仅是把数据括起来
		//特点:不占用组号


		//(?:) (?=) (?!) 都是非捕获分组

	}
}
