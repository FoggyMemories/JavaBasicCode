package com.qianrui.a01myexception;

public class ExceptionDemo7 {
	public static void main(String[] args) {
		/*
		 * 自己处理(捕获异常)   灵魂四问:
		 *      灵魂一问:如果try中没有遇到问题,怎么执行?
		 *                  会把try里面所有代码全部执行完毕,不会执行catch里面的代码
		 *                  注意:
		 *                      只有当出现了异常才会执行catch里面的代码
		 */

		int[] arr = {1, 2, 3, 4, 5, 6};

		try {
			System.out.println(arr[0]); //1
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界了");
		}

		System.out.println("看看我执行了么");
	}
}
