package com.study.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
	public static void main(String[] args) throws ParseException {
        /*
            假设,某人的出生日期为:2000-11-11
                请用字符串表示这个数据，并将其转换为:2000年11月11日

         */

		//1.通过给定的时间对象解析成一个Date对象
		String str = "2000-11-11";
		//2.解析
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf1.parse(str);
		//3.格式化
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
		String result = sdf2.format(date);
		//4.打印
		System.out.println(result);

	}
}
