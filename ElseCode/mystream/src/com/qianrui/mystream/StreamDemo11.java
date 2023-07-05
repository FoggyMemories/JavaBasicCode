package com.qianrui.mystream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo11 {
	public static void main(String[] args) {
        /*
            collect(Collector collector)            收集流中的数据，放到集合中 (List Set Map)

            注意点：
                如果我们要收集到Map集合当中， 键 不能重复，否则会报错
        */

		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
				"张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");

		//收集List集合当中

		//1.把所有男性收集

		List<String> newList = list.stream()
				.filter(s -> "男".equals(s.split("-")[1]))
				.collect(Collectors.toList());

		System.out.println(newList);
		//收集Set集合当中

		//2.把所有男性收集
		//与list的区别,Set不允许重复
		Set<String> newSet = list.stream()
				.filter(s -> "男".equals(s.split("-")[1]))
				.collect(Collectors.toSet());

		System.out.println(newSet);

		//收集Map集合当中

		//3.把所有男性收集
		//键:姓名 值:年龄
		Map<String, Integer> map = list.stream()
				.filter(s -> "男".equals(s.split("-")[1]))
				/**
				 *  toMap:参数一表示键的生成规则
				 *        参数二表示值的生成规则
				 *  参数一:
				 *        Function 泛型一:表示流中每一个数据的类型
				 *                 泛型二:表示Map集合中 键 的数据类型
				 *        方法apply形参:以此表示流里面的每一个数据
				 *              方法体:生成 键 的代码
				 *              返回值:已经生成的 键
				 *  参数二:
				 *        Function 泛型一:表示流中每一个数据的类型
				 *                 泛型二:表示Map集合中 值 的数据类型
				 *        方法apply形参:以此表示流里面的每一个数据
				 *              方法体:生成 值 的代码
				 *              返回值:已经生成的 值
				 */
				.collect(Collectors.toMap(new Function<String, String>() {
					                          @Override
					                          public String apply(String s) {
						                          return s.split("-")[0];
					                          }
				                          },
						new Function<String, Integer>() {
							@Override
							public Integer apply(String s) {
								return Integer.parseInt(s.split("-")[2]);
							}
						}));
		//利用lambda表达式进行书写
		Map<String, Integer> map1 = list.stream()
				.filter(s -> "男".equals(s.split("-")[1]))
				.collect(Collectors.toMap(
						s -> s.split("-")[0],
						s -> Integer.parseInt(s.split("-")[2])));

		System.out.println(map);
		System.out.println(map1);
	}
}
