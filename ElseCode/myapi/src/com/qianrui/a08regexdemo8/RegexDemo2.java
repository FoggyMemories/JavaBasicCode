package com.qianrui.a08regexdemo8;

public class RegexDemo2 {
	public static void main(String[] args) {
		//public boolean matches(String regex):判断是否匹配正则表达式匹配,匹配返回true

		//只能是  a b c
		System.out.println("-------------1------------");
		System.out.println("a".matches("[abc]"));   //true
		System.out.println("z".matches("[abc]"));   //false

		//不能出现 a b c
		System.out.println("-------------2------------");
		System.out.println("a".matches("[^abc]"));  //false
		System.out.println("z".matches("[^abc]"));  //true
		System.out.println("zz".matches("[^abc]")); //false
		System.out.println("zz".matches("[^abc][^abc]"));   //true

		// a到z A到Z (包头包尾)
		System.out.println("-------------3------------");
		System.out.println("a".matches("[a-zA-Z]"));    //true
		System.out.println("z".matches("[a-zA-Z]"));    //true
		System.out.println("aa".matches("[a-zA-Z]"));    //false
		System.out.println("zz".matches("[a-zA-Z]"));    //false
		System.out.println("0".matches("[a-zA-Z]"));     //false
		System.out.println("0".matches("[a-zA-Z0-9]"));  //true
		System.out.println("0".matches("[0-9]"));  //true

		//  [a-d[m-p]] a到d,或m到p
		System.out.println("-------------4------------");
		System.out.println("a".matches("[a-d[m-p]]"));  //true
		System.out.println("d".matches("[a-d[m-p]]"));  //true
		System.out.println("m".matches("[a-d[m-p]]"));  //true
		System.out.println("p".matches("[a-d[m-p]]"));  //true
		System.out.println("e".matches("[a-d[m-p]]"));  //false
		System.out.println("0".matches("[a-d[m-p]]"));  //false

		//  [a-z&&[daf]]    a-z和def的交集.为d,e,f
		//细节:如果要求两个范围的交集,那么需要写符号&&
		//如果写成了一个&,那么此时&表示就不是交集了,而是一个简简单单的&符号
		System.out.println("-------------5------------");
		System.out.println("a".matches("[a-z&&[def]]"));    //false
		System.out.println("&".matches("[a-z&&[def]]"));    //false
		System.out.println("&".matches("[a-z&[def]]"));     //true
		System.out.println("d".matches("[a-z&&[def]]"));    //true
		System.out.println("0".matches("[a-z&&[def]]"));    //false

		//  [a-z&&[^bc]]    a-z和非bc的集合.等同于[ad-z]
		System.out.println("-------------6------------");
		System.out.println("a".matches("[a-z&&[^bc]]"));    //true
		System.out.println("b".matches("[a-z&&[^bc]]"));    //false
		System.out.println("0".matches("[a-z&&[^bc]]"));    //false

		//  [a-z&&[^m-p]]   a到z和除了m到p的交集.等同于[a-lq-z]
		System.out.println("-------------7------------");
		System.out.println("a".matches("[a-z&&[^m-p]]"));   //true
		System.out.println("m".matches("[a-z&&[^m-p]]"));   //false
		System.out.println("a".matches("[a-z&&[^m-p]]"));   //false


	}
}
