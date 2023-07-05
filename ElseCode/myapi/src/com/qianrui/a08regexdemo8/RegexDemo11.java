package com.qianrui.a08regexdemo8;

public class RegexDemo11 {
	public static void main(String[] args) {
		//public String replaceAll(String regex,String newStr)         按照正则表达式的规则进行替换
		//public String[] split(String regex)                          按照正则表达式的规则切割字符串

		/*
		 *
		 * 有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
		 *
		 * 要求1:把字符串三个名字之间的字母替换为vs
		 * 要求2:把字符串中的三个名字切割出来
		 *
		 */

		String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
		//细节：
		//方法在底层跟之前一样也会创建文本解释器的对象
		//然后从头开始去读取字符串中的内容，只要有满足的，那么就用第二个参数去替换。
		String result1 = s.replaceAll("[\\w&&[^_]]+", "vs");
		System.out.println(s);
		System.out.println(result1);

		System.out.println("----------------");
		String s1 = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
		String[] arr = s1.split("[\\w&&[^_]]+");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
