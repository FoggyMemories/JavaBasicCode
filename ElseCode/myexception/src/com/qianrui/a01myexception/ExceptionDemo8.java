package com.qianrui.a01myexception;

public class ExceptionDemo8 {
	public static void main(String[] args) {
		/*
		 *  自己处理（捕获异常）灵魂四问：
		 *      灵魂二问：如果try中可能会遇到多个问题，怎么执行？
		 *              会写多个catch与之对应
		 *              细节：
		 *                  如果我们要捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面
		 *              了解：
		 *                  在JDK7之后，我们可以在catch中同时捕获多个异常，中间用|进行隔开
		 *                  表示如果出现了A异常或者B异常的话，采取同一种处理方案
		 */
		int[] arr = {1, 2, 3, 4, 5, 6};

		try {
			System.out.println(arr[10]);    //ArrayIndexOutOfBoundsException
			//当第一个异常出现时直接跳转至catch运行
			//如果遇到多个异常出现,应当写多个catch进行捕获
			System.out.println(2 / 0);        //ArithmeticException

			String s = null;
			System.out.println(s.equals("abc"));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界");
		} catch (ArithmeticException e) {
			System.out.println("算数异常 除数不能为零");
		} catch (NullPointerException e) {
			System.out.println("空指针异常");
		} catch (Exception e) {
			System.out.println("Exception");
		}

		System.out.println("看看我执行了么?");


		try {
			System.out.println(arr[10]);
			System.out.println(2 / 0);
			String s = null;
			System.out.println(s.equals("abc"));
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
			System.out.println("存在异常");
		}

	}
}
