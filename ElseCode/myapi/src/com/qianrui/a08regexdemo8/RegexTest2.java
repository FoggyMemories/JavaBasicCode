package com.qianrui.a08regexdemo8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {
	public static void main(String[] args) {
        /*
        练习：本地爬虫和网络爬虫
            有如下文本，请按照要求爬取数据:
                Java自从95年问世以来,经历了很多版本,目前企业中用的对多的是Java8和Java11,因为这两个是长期支持版本,
                下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台

        要求:找出里面所有的JavaXX
         */

		String str = " Java自从95年问世以来,经历了很多版本,目前企业中用的对多的是Java8和Java11,因为这两个是长期支持版本," +
				"下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";
		//效率太低,应当用循环来表示
		method1(str);

		System.out.println("-------------------------------");

		//1.获取正则表达式的对象
		Pattern p = Pattern.compile("Java\\d{0,2}");
		//2.获取文本匹配器的对象
		Matcher m = p.matcher(str);
		//3.利用循环获取
		while (m.find()) {
			String s = m.group();
			System.out.println(s);
		}


	}

	private static void method1(String str) {
		//Pattern:表示正则表达式
		//Matcher:文本匹配器,作用按照正则表达式的规则去读取字符串,从头开始读取.
		//        在大串中去找符合规则的子串.


		//获取正则表达式的对象
		Pattern p = Pattern.compile("Java\\d{0,2}");
		//获取文本匹配器的对象
		//m:文本匹配器的对象
		//str:大串
		//p:规则
		Matcher m = p.matcher(str);
		//m要在str中查找符合p规则的小串


		//拿着文本匹配器从头开始读取,寻找是否有满足规则的子串
		//如果没有,方法返回false
		//如果有,返回true.在底层记录子串的(起始索引)和(结束索引+1)
		boolean b = m.find();
		System.out.println(b);


		//方法底层会根据find记录方法的索引进行字符串的截取
		//subString(起始索引,结束索引);包头不包尾
		//会把截取的小串进行返回
		String s1 = m.group();
		System.out.println(s1);//此时文本匹配器停止在了第一个"Java"后面

		//第二次调用find的时候,就会继续读取后面的内容
		//读取到第二个满足的子串,方法会继续返回true
		//并把第二个子串的起始索引和结束索引+1,进行记录
		b = m.find();
		System.out.println(b);

		//第二次调用group方法的时候,会根据find方法记录的索引再次截取子串
		String s2 = m.group();
		System.out.println(s2);
	}
}
