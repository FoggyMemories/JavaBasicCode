package com.qianrui.mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo7 {
	public static void main(String[] args) {
        /*
            filter              过滤
            limit               获取前几个元素
            skip                跳过前几个元素

            注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
            注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
        */

		ArrayList<String> list = new ArrayList<>();

		Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

		//filter 过滤 把张开头的留下,其余数据过滤不要

        /*
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //如果返回值为true,表示当前数据留下
                //如果返回值为false,表示当前数据舍弃
                return s.startsWith("张");
            }
        }).forEach(s-> System.out.print(s + " "));

        没有完全利用lambda表达式,该代码不是很简洁
        */

		//以下是利用lambda表达式的代码
		list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);

		System.out.println("============================");

		//以下是过滤了首位为 "张" 且长度为 3 的列表

		//由于操作变多，所以每次操作应当折行 提高代码的阅读性
		list.stream()
				.filter(s -> s.startsWith("张"))
				.filter(s -> s.length() == 3)
				.forEach(System.out::println);


		System.out.println("============================");

        /*
        limit               获取前几个元素
        skip                跳过前几个元素
        */

		//获取到前三个元素,与索引无关
		list.stream()
				.limit(3)
				.forEach(System.out::println);


		System.out.println("============================");

		//跳过前四个元素
		list.stream()
				.skip(4)
				.forEach(System.out::println);

	}
}
