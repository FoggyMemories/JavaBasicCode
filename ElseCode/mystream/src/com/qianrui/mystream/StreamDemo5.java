package com.qianrui.mystream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo5 {
	public static void main(String[] args) {
		//  数组          public static <T> Stream<T> stream(T[] array)        Arrays工具类中的静态方法

		//1.创建数组

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		String[] arr2 = {"a", "b", "c"};
		//2.获取stream流

		Arrays.stream(arr).forEach(s -> System.out.print(s + " "));


		System.out.println("\n=============================");

		Arrays.stream(arr2).forEach(s -> System.out.print(s + " "));

		System.out.println("\n=============================");


		//注意:
		//Stream接口中静态方法of的细节:
		//方法的形参是一个可变参数,可以传递一堆零散的数据,也可以传递数组
		//但是 数组必须是引用数据类型的,如果传递基本数据类型,会吧整个数组当作一个元素,放到Stream当中

		Stream.of(arr2).forEach(s -> System.out.print(s + " "));
	}
}
