package com.qianrui.a10lambdademo;

public class LambdaTest2 {
	public static void main(String[] args) {
        /*

        练习:不死神兔
            有一个很有名的数学逻辑题叫做 不死神兔 问题,
            有一对兔子,下哦那个出生后第三个月起每个月都生一对兔子
            小兔子长到第三个月后每个月又生一对兔子,加入兔子都不死,问第十二个月的兔子对数为多少?

            (斐波那契数列）

         */

		//求解1:
        /*
        //1.创建一个长度为12的数组
        int[] arr = new int[12];

        //2.手动给0索引和1索引的数据进行赋值
        arr[0] = 1;
        arr[1] = 1;

        //3.利用循环给剩余的数据进行赋值
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        //获取最大索引上的数据即可
        System.out.println(arr[11]);
        */


		//求解2:
		//递归的方式去完成
		//1.递归的出口
		//2.递归的规律
		//fn(12) = fn(11) + fn(10);
		//fn(11) = fn(10) + fn(9);
		//fn(10) = fn(9) + fn(8);
		//...
		//fn(3) = fn(2) + fn(1);
		//fn(2) = 1;
		//fn(1) = 1;

		System.out.println(getSum(12));


	}

	private static int getSum(int month) {
		if (month == 1 || month == 2) {
			return 1;
		}

		return getSum(month - 1) + getSum(month - 2);
	}
}
