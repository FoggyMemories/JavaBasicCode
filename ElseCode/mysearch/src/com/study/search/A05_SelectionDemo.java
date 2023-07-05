package com.study.search;

public class A05_SelectionDemo {
	public static void main(String[] args) {
        /*
            选择排序：
                1.从0索引开始，后面的元素一一比较。
                2.小的放前面，大的放后面
                3.第一次循环结束后，最小的数据已经确定
                4.第二次循环从1索引开始以此类推

         */

		//1.定义数组
		int[] arr = {2, 4, 5, 3, 1};

		//2.利用选择排序让数组变成 1 2 3 4 5
		//从0索引开始，后面的元素一一比较。

		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				//拿着0索引跟后面的数据进行比较
				if (arr[j] > arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}


		//3.遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
