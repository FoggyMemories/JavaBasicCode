package com.qianrui.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo2 {
	public static void main(String[] args) {
        /*
        方法引用（引用静态方法）
        格式
              类::方法名

        需求：
            集合中有以下数字，要求把他们都变成int类型
            "1","2","3","4","5"
        */

		//1.创建集合并添加元素
		ArrayList<String> list = new ArrayList<>();

		Collections.addAll(list, "1", "2", "3", "4", "5");

        /*把他们都变成int类型
        //2.常规方式
        ArrayList<Integer> list1 = new ArrayList<>();

        for (String s : list) {
            int i = Integer.parseInt(s);
            list1.add(i);
        }
        */

		//把他们都变成int类型

		//1.方法需要已经存在
		//2.方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
		//3.方法的功能需要把形参的字符串转换成整数

		list.stream()
				.map(Integer::parseInt)
				.forEach(System.out::println);
	}
}
