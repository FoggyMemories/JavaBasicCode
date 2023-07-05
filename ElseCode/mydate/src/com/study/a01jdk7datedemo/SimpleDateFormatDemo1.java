package com.study.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
	public static void main(String[] args) throws ParseException {
        /*
        字母           日期或时间元素         表示          示例
        G                Era 标志符         Text           AD
        y                    年             Year        1996; 96
        M                年中的月份          Month      July; Jul; 07
        w                年中的周数          Number        27
        W               月份中的周数         Number         2
        D               年中的天数           Number        189
        d               月份中的天数         Number        10
        F               月份中的星期         Number         2
        E               星期中的天数         Text       Tuesday; Tue
        a                Am/pm 标记         Text           PM
        H             一天中的小时数（0-23）  Number         0
        k             一天中的小时数（1-24）  Number         24
        K             am/pm 中的小时数（0-11）Number         0
        h             am/pm 中的小时数（1-12）Number        12
        m              小时中的分钟数         Number        30
        s               分钟中的秒数          Number        55
        S                  毫秒数            Number        978
        z                   时区  General time zone  Pacific Standard Time; PST; GMT-08:00
        Z                   时区  RFC 822 time zone  -0800


            public SimpleDateFormat()               默认格式
            public SimpleDateFormat(String pattern) 指定格式

            public final String format(Date date)   格式化(日期对象 -> 字符串)
            public Date parse(String source)        解析(字符串 -> 日期对象)

         */


		//1.格式化
		method1();
		System.out.println("----------------");
		//2.解析
		method2();

	}

	private static void method2() throws ParseException {
		//1.定义一个字符串表示时间
		String str = "2023-03-26 22:39:40";
		//2.利用空参构造创建SimpleDateFormat对象
		//细节
		//创建对象的格式要跟字符串的格式完全一致
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(str);     //将不同格式的时间转化为默认时间格式
		System.out.println(date);
		//3.打印结果
		System.out.println(date.getTime());
	}

	private static void method1() {
		//1.利用空参构造创建SimpleDateFormat对象,默认对象
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		Date d1 = new Date(0L);
		String str1 = sdf1.format(d1);
		System.out.println(str1);    //1970/1/1 08:00       默认格式

		//2.利用带参构造创建SimpleDateFormat对象,指定格式
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String str2 = sdf2.format(d1);
		System.out.println(str2);   //1970年01月01日 08:00:00

		//格式:yyyy年MM月dd日 时:分:秒 星期
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
		String str3 = sdf3.format(d1);
		System.out.println(str3);   //1970年01月01日 08:00:00 周四
	}
}
