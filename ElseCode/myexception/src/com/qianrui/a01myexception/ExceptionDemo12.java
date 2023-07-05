package com.qianrui.a01myexception;

public class ExceptionDemo12 {
	public static void main(String[] args) {
        /*
        throws：写在方法定义处，表示声明一个异常。告诉调用者，使用本方法可能会有哪些异常。
        throw ：写在方法内，结束方法。手动抛出异常对象，交给调用者。方法中下面的代码不再执行了。


        需求：
            定义一个方法求数组的最大值
        */

		int[] arr = {};

		int max = 0;
		try {
			max = getMax(arr);
		} catch (NullPointerException e) {
			System.out.println("空指针异常");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界异常");
			e.printStackTrace();
		}

		System.out.println(max);
	}

	public static int getMax(int[] arr)/* throws NullPointerException,ArrayIndexOutOfBoundsException*/
	//运行时期异常可以省略不写
	{

		if (arr == null) {
			//手动创建一个异常对象,并把这个异常交给方法的调用
			throw new NullPointerException();

			//此时方法就会结束,下面的代码不会再执行了
		}

		if (arr.length == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}

		System.out.println("看看我执行了么?");

		int max = arr[0];
		for (int j : arr) {
			if (j > max) {
				max = j;
			}
		}

		return max;
	}
}
