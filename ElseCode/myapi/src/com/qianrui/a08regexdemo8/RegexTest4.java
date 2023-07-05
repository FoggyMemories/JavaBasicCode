package com.qianrui.a08regexdemo8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest4 {
	public static void main(String[] args) {
        /*
         Java自从95年问世以来,经历了很多版本,目前企业中用的对多的是Java8和Java11,因为这两个是长期支持版本,
         下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台
         */

		String s1 = "Java自从95年问世以来,经历了很多版本,目前企业中用的对多的是Java8和Java11,因为这两个是长期支持版本," +
				"下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";

		//1.定义正则表达式
		//?:理解为前面的数据Java
		//=：表示Java后面要跟随的数据
		//但是在获取的时候，只获取前半部分
		String regex1 = "Java(?=8|11|17)";

		Pattern p1 = Pattern.compile(regex1);
		Matcher m1 = p1.matcher(s1);
		while (m1.find()) {
			System.out.println(m1.group());
		}
		//Java
		//Java
		//Java
		//Java

		System.out.println("-----------------------");
		String s2 = "java自从95年问世以来,经历了很多版本,目前企业中用的对多的是JAva8和JAVa11,因为这两个是长期支持版本," +
				"下一个长期支持版本是Java17,相信在未来不久JAVA17也会逐渐登上历史舞台";//改为不同的大小写

		String regex2 = "((?i)Java)(?=8|11|17)";
		Pattern p2 = Pattern.compile(regex2);
		Matcher m2 = p2.matcher(s2);
		while (m2.find()) {
			System.out.println(m2.group());
		}
		//JAva
		//JAVa
		//Java
		//JAVA

		System.out.println("-----------------------");
		String regex3 = "((?i)Java)(8|11|17)";
		Pattern p3 = Pattern.compile(regex3);
		Matcher m3 = p3.matcher(s1);
		while (m3.find()) {
			System.out.println(m3.group());
		}
		//Java8
		//Java11
		//Java17
		//Java17

	}
}
