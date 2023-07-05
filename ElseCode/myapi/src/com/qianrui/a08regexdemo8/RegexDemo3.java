package com.qianrui.a08regexdemo8;

public class RegexDemo3 {
	public static void main(String[] args) {
		//  \   转义字符    改变后面那个字符原本的含义

		// . 表示任意一个字符
		System.out.println("-------------1------------");
		System.out.println("你".matches(".."));  //false 前后位数也应该一样
		System.out.println("你.".matches("..")); //true
		System.out.println("你a".matches(".."));  //true

		//  \\d 只能是任意的一位数字
		System.out.println("-------------2------------");
		System.out.println("a".matches("\\d"));       //false
		System.out.println("3".matches("\\d"));       //true
		System.out.println("333".matches("\\d"));     //false

		//  \\w 只能是以为单词字符:[a-zA-Z_0-9]
		System.out.println("-------------3------------");
		System.out.println("z".matches("\\w"));      //true
		System.out.println("_".matches("\\w"));      //true
		System.out.println("2".matches("\\w"));      //true
		System.out.println("21".matches("\\w"));     //false
		System.out.println("你".matches("\\w"));     //false

		//  \\W 非单词字符
		System.out.println("-------------4------------");
		System.out.println("你".matches("\\W")); //true

		//  以上正则匹配只能校验单个字符.

		// 必须是数字 字母 下划线 至少6位
		System.out.println("---------------------------------");
		System.out.println("-------------5------------");
		System.out.println("2442fsfsf".matches("\\w{6,}")); //true
		System.out.println("244f".matches("\\w{6,}"));  //false


		// 必须是数字和字符 必须是4位
		System.out.println("-------------6------------");
		System.out.println("23dF".matches("[a-zA-Z0-9]{4}"));   //true
		System.out.println("23_F".matches("[a-zA-Z0-9]{4}"));   //false
		System.out.println("23dF".matches("[\\w&&[^_]]{4}"));   //true
		System.out.println("23_F".matches("[\\w&&[^_]]{4}"));   //false

	}
}
