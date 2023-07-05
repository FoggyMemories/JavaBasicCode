package com.qianrui.a01mathdemo1;

public class MathDemo1 {
	public static void main(String[] args) {
        /*
            public static int               abs(int a)                  获取参数绝对值
            public static int               absExact(int a)             获取参数绝对值
            public static double            ceil(double a)              向上取整
            public static double            floor(double a)             向下取整
            public static int               round(float a)              四舍五入
            public static int               max(int a,int b)            获取两个int值中较大值
            public static double            pow(double a,double b)      返回a的b次幂的值
            public static double            sqrt(double a)              返回a的平方根
            public static double            sqrt(double a)              返回a的立方根
            public static double            random()                    返回值为double的随机值，范围[0.0,1.0)
         */


		//abs 获取参数的绝对值
		System.out.println(Math.abs(88));
		System.out.println(Math.abs(-88));
		//范围超出：
		//以int类型为例，取值范围：-2147483648 ~ 2147483647
		//如果没有正数与负数对应，那么传递负数结果有误
		//例如 -2147483648 没有正数与之对应，所以abs结果产生bug
		System.out.println(Math.abs(-2147483648));  //-2147483648
		/*
		 * System.out.println(Math.absExact(-2147483648));//进行一个判断，在JDK15之后才出现
		 * Overflow to represent absolute value of Integer.MIN_VALUE
		 * */


		//向上取整
		System.out.println(Math.ceil(12.34));   //13.0
		System.out.println(Math.ceil(12.54));   //13.0
		System.out.println(Math.ceil(-12.34));   //-12.0
		System.out.println(Math.ceil(-12.54));   //-12.0


		System.out.println("----------------------------");
		//向下取整
		System.out.println(Math.floor(12.34));   //12.0
		System.out.println(Math.floor(12.54));   //12.0
		System.out.println(Math.floor(-12.34));   //-13.0
		System.out.println(Math.floor(-12.54));   //-13.0


		System.out.println("----------------------------");
		//四舍五入
		System.out.println(Math.round(12.34));   //12
		System.out.println(Math.round(12.54));   //13
		System.out.println(Math.round(-12.34));   //-12
		System.out.println(Math.round(-12.54));   //-13


		System.out.println("----------------------------");
		//获取两个整数的较大值
		System.out.println(Math.max(20, 30));
		//获取两个整数的较小值
		System.out.println(Math.min(20, 30));

		//获取a的b次幂
		System.out.println(Math.pow(2, 3));
		//幂为0~1之间的数是为开根号
		System.out.println(Math.pow(4, 0.5));
		//幂为负数
		System.out.println(Math.pow(2, -2));
		//一般情况下，第二个参数都是大于1的数


		//开平方
		System.out.println(Math.sqrt(4));
		//开立方
		System.out.println(Math.cbrt(8));


		System.out.println("----------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.floor(Math.random() * 100) + 1);    //[1 , 100]之间整数的随机数
		}
	}
}
