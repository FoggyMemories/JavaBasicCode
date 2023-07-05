package com.qianrui.a07bigdecimaldemo7;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
	public static void main(String[] args) {
        /*
            构造方法获取BigDecimal对象
                pulic BigDecimal(double val)
                pulic BigDecimal(String val)
            静态方法获取BigDecimal对象
                public static BigDecimal valueOf(double val)
         */

		//1.通过传递double类型的小数来创建对象
		// 细节：
		//这种方式有可能是不精确的，所以不建议使用
		BigDecimal bd1 = new BigDecimal(0.01);
		BigDecimal bd2 = new BigDecimal(0.09);
		System.out.println(bd1);
		System.out.println(bd2);


		//2.通过传递字符串传递的小数来创建对象
		BigDecimal bd3 = new BigDecimal("0.01");
		BigDecimal bd4 = new BigDecimal("0.09");
		BigDecimal bd5 = bd3.add(bd4);
		System.out.println(bd3);
		System.out.println(bd4);
		System.out.println(bd5);

		//3.通过静态方法获取对象
		BigDecimal bd6 = BigDecimal.valueOf(10);
		BigDecimal bd7 = BigDecimal.valueOf(10);
		System.out.println(bd6);
		System.out.println(bd6 == bd7); //true
		BigDecimal bd8 = BigDecimal.valueOf(10.0);
		System.out.println(bd7 == bd8); //false

		//细节
		//如果我们传递的是[0,10]之间的*整数*,那么方法会返回已经创建好的对象,不会重新new
	}
}
