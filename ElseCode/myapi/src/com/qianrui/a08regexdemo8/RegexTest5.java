package com.qianrui.a08regexdemo8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest5 {
	public static void main(String[] args) {
        /*
        练习:贪婪爬取和非贪婪爬取
            如有下文本,请按照要求爬取数据。

            Java自从95年问世以来,经历了很多版本,abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa
            目前企业中用的对多的是Java8和Java11,因为这两个是长期支持版本,
            下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台

             需求1:按照ab+的方式爬取ab,b尽可能多获取
             需求2:按照ab+的方式爬取ab,b尽可能少获取
         */

        /*
            只写+和*表示贪婪匹配
            +? 非谈判匹配
            *? 非贪婪匹配
         */

		//贪婪爬取:在爬取数据的时候尽可能的多获取数据
		//非贪婪爬取:在爬取数据的时候尽可能的少获取数据

		//Java中默认是贪婪爬取
		//如果我们在数量词+ *的后面加上 问号 ?,那么此时就是非贪婪爬取

		String s = "Java自从95年问世以来,经历了很多版本,abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
				"目前企业中用的对多的是Java8和Java11,因为这两个是长期支持版本," +
				"下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";

		String regex = "ab+";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);

		while (m.find()) {
			System.out.println(m.group());
		}   //abbbbbbbbbbbb

		String regex1 = "ab+?";

		Pattern p1 = Pattern.compile(regex1);
		Matcher m1 = p1.matcher(s);

		while (m1.find()) {
			System.out.println(m1.group());
		}   //ab
	}
}
