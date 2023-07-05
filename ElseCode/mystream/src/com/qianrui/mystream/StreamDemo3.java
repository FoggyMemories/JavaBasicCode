package com.qianrui.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StreamDemo3 {
	public static void main(String[] args) {
        /*
            单列集合      default Stream<E> stream()                           Collection中的默认方法
            双列集合      无                                                   无法直接使用stream流
            数组          public static <T> Stream<T> stream(T[] array)        Arrays工具类中的静态方法
            一堆零散数据   public static<T> Stream<T> of(T... values)           Stream接口中的静态方法

         */

		//1.单列集合获取Stream流
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "a", "b", "c", "d", "e");

		//2.获取到一条流水线，并把集合中的数据放到流水线上
		list.stream().forEach(s -> System.out.println(s));


		System.out.println("-----------------------");


		//第一种获取双列集合Stream流的方法
		//3.创建双列集合
		HashMap<String, Integer> hm = new HashMap<>();

		//4.添加数据
		hm.put("aaa", 111);
		hm.put("bbb", 222);
		hm.put("ccc", 333);
		hm.put("ddd", 444);

		//5.获取Stream流
		hm.keySet().stream().forEach(s -> System.out.println(s));

		System.out.println("-----------------------");

		//第二种获取双链集合Stream流的方法
		hm.entrySet().stream().forEach(s -> System.out.println(s));
	}
}
