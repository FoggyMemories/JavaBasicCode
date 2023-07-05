package com.qianrui.a08regexdemo8;

public class RegexTest12 {
	//捕获分组练习
	public static void main(String[] args) {
        /*
        练习:口吃替换
            需求:
                将字符串:我要学学编编编编编编编程程程程程程程程
                替换为:我要学编程
         */

		String str = "我要学学编编编编编编编程程程程程程程程";


		//需求:将重复的内容替换为单个的
		// (.) :把重复内容的第一个字符看作一组
		// \\1 :表示第一字符再次出现
		// + : 至少一次
		// $1 : 表示把正则表达式中的第一组的内容再拿出来用
		String result = str.replaceAll("(.)\\1+", "$1");
		System.out.println(result);
	}
}
