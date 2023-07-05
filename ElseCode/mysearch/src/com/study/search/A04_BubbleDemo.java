package com.study.search;

public class A04_BubbleDemo {
	public static void main(String[] args) {

        /*

            冒泡排序：
            核心思想：
                1.相邻的元素两两比较，大的放右边，小的放左边。
                2.第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面一次类推
                3.如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以

         */


		//1.定义数组
		int[] arr = {2, 4, 5, 3, 1};

		//2.利用冒泡排序将数组中的数据变成 1 2 3 4 5

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				//-1:为了防止索引越界
				//-j:提高效率

				//相邻的元素比较
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}
		}


		//3.遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
