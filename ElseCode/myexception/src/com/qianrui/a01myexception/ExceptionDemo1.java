package com.qianrui.a01myexception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
	public static void main(String[] args) throws ParseException {


		//编译时异常
		String time = "2030年1月1日";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

		Date date = sdf.parse(time);
		System.out.println(date);


		//运行时异常
		int[] arr = {1, 2, 3, 4, 5};

		//System.out.println(arr[10]);  //ArrayIndexOutOfBoundsException
	}
}
