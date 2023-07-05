package com.qianrui.a08regexdemo8;

public class RegexTest1 {
	public static void main(String[] args) {
		//细节:
		//拿着一个正确的数据,从左到右依次去写
		//验证手机号码是否满足要求
		//13112345678
		//分成三个部分:
		//第一部分:1 表示手机号码只能以1开头
		//第二部分: [3-9] 表示手机号码第二位只能是3-9之间的
		//第三部分: \\d{9} 表示任意数字可以出现9次,也只能出现9次
		String regex1 = "1[3-9]\\d{9}";
		System.out.println("13112345678".matches(regex1));

		//24小时的正则表达式 右键选择
		String regex2 = "[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";

		//忽略大小写的书写方式
		//在匹配的时候忽略bc的大小写
		System.out.println("---------------------------");
		String regex3 = "a(?i)bc";
		System.out.println("abc".matches(regex3));  //true
		System.out.println("ABC".matches(regex3));  //false
		System.out.println("aBC".matches(regex3));  //true

		System.out.println("---------------------------");
		//身份证号码的严格校验
		String regex4 = "[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0\\d|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
		System.out.println("410102200001010030".matches(regex4));   //虚拟的测试身份证
	}
}
