package com.study.search;

public class A02_BinarySearchDemo {
	public static void main(String[] args) {
		//二分查找\\折半查找
		//核心:
		//每次排除一半的查找范围

		//需求:定义一个方法利用二分查找,查询某个元素在数组中的索引
		//数据如下:{7,23,79,81,103,127,131,147}     \\一定是所有数据从小到大排列才行

		int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
		System.out.println(binarySearch(arr, 81));


        /*
        数据必须是有序的
        如果数据是乱序的，先排序再用二分查找得到的索引没有实际意义，只能确定当前数字在数组中是否存在，
        并不能确定该数据的索引位，因为排序之后数字的位置就可能发生变化了
         */


	}

	private static int binarySearch(int[] arr, int number) {
		//1.定义两个变量记录要查找的范围
		int min = 0;
		int max = arr.length - 1;

		//2.利用循环不断地去找要查找的数据
		while (true) {
			if (min > max) {
				return -1;
			}

			//查找数据
			//3.找到min与max的中间位置
			int mid = (min + max) / 2;

			//4.拿着mid指向的元素跟要查找的元素进行比较
			//1.number在mid的左边
			//2.number在mid的右边
			//3.number跟mid指向的元素相同

			if (arr[mid] > number) {
				//number在mid左边
				//min不变,max = mid - 1
				max = mid - 1;
			} else if (arr[mid] < number) {
				//number在mid的右边
				//max不变,min = mid - 1
				min = mid + 1;
			} else {
				return mid;
			}
		}
	}
}
