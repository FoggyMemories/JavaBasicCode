package com.qianrui.mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StreamDemo10 {
	public static void main(String[] args) {
        /*
            void forEach(Consumer action)           遍历
            long count()                            统计
            toArray()                               收集流中的数据，放到数组中
        */

		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");


		//void forEach(Consumer action)           遍历

		//Consumer的泛型:表示流中数据的类型
		//accept方法的形参s:一次表示流里面的每一个数据
		//方法体:对每一个数据的处理操作(打印)
        /*
        list.stream()
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });
        */

		list.forEach(s -> System.out.print(s + " "));

		System.out.println();

		//long count()                            统计

		long count = list.stream().count();
		System.out.println(count);

		//toArray()                               收集流中的数据，放到数组中

		Object[] arr1 = list.toArray();
		System.out.println(Arrays.toString(arr1));
		//toArray方法的参数的作用:负责创建一个指定类型的数组
		//toArray方法的底层:会一次得到流里面的每一个数组,并把数据方法数组当中
		//toArray方法的返回值：是一个装着流里面所有数据的数组


		//IntFunction的泛型:具体类型的数组
		//apply的形参:流中数据的个数,高跟数组的长度保持一致
		//apply的返回值:具体类型的数组
		//方法体:就是创建数组
        /*
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));
        */

		//将上述代码改为lambda表达式去书写
		String[] arr2 = list.stream().toArray(value -> new String[value]);
		System.out.println(Arrays.toString(arr2));
	}
}
