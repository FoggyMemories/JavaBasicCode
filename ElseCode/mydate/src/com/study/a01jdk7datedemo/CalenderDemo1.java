package com.study.a01jdk7datedemo;

import java.util.Calendar;
import java.util.Date;

public class CalenderDemo1 {
	public static void main(String[] args) {
        /*

        Calendar概述
            Calender代表了系统当前时间的日历对象,可以单独修改、获取时间中的年,月,日
            细节:Calendar是一个抽象类,不能直接创建对象.

        获取Calendar日历类对象的方法
                      方法名                           说明
        public static Calendar getInstance()      获取当前时间的日历对象

        public final Date getTime()               获取日期对象
        public final setTime(Date date)           给日历设置日期对象

        public long getTimeInMillis()             拿到时间毫秒值
        public void setTimeInMillis(long millis)  给日历设置时间毫秒值

        public int get(int field)                 取日历中的某个字段信息
        public void set(int field,int value)      修改日历的某个字段信息
        public void add(int field,int amount)     为某个字段增加/减小指定的值

         */

		//1.获取日历对象
		//细节1:Calendar是一个抽象类,不能直接创建对象.通过一个静态方法获取到子类对象
		//底层原理:
		//会根据系统的不同时区来获取不同的日历对象.
		//把时间中的纪元,年,月,日,时,分,秒,星期,等等都放一个数组当中
		//索引值:
		//  0 : 纪元
		//  1 : 年
		//  2 : 月
		//  3 : 一个年中的第几周
		//  4 : 一个月中的第几周
		//  5 : 一个月中的第几天(日期)
		//...
		//  16 : ...
		//public static Calendar getInstance()      获取当前时间的日历对象
		Calendar c = Calendar.getInstance();
		System.out.println(c);

		//2.修改日历代表的时间
		//细节2:
		//月份:范围 0 ~ 11,从0月份开始
		//星期:在外国人眼里,星期日是一周中的第一天
		//1(星期日) 2(星期一)......7(星期六)
		Date d = new Date(0L);
		c.setTime(d);
		System.out.println(c);

		//Date time = c.getTime();
		//System.out.println(time);
		//Thu Jan 01 08:00:00 HKT 1970

		System.out.println("-----------------------------");

		//public int get(int field)                 取日历中的某个字段信息
		//public void set(int field,int value)      修改日历的某个字段信息
		//public void add(int field,int amount)     为某个字段增加/减小指定的值
		c.set(Calendar.YEAR, 2023);
		c.set(Calendar.MONTH, 8);//月份的范围是 0 ~ 11 如果溢出，则年份会向后顺延
		c.set(Calendar.DAY_OF_MONTH, 10);
		//调用方法在这个基础上增加一个月
		c.add(Calendar.MONTH, 1);//往时间后面增加一个月，如果为负数,则会向前减小

		//一般情况下0索引:纪元 很少使用
		//Java在Calendar类中，吧索引对应的数字都定义成常量
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int week = c.get(Calendar.DAY_OF_WEEK);
		int date = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + ", " + month + ", " + date + ", " + getWeek(week));//1970, 1, 1, 5

		System.out.println(c.getTimeInMillis());

	}

	/*查表法*/
	//表:容器
	//让数据跟索引产生对应的关系

	//传入对应的数字:1-7
	//返回对应的星期
	public static String getWeek(int index) {
		//定义一个数组,让汉字星期几 跟数字1-7产生对应关系
		String[] arr = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
		//根据索引返回对应的星期
		return arr[index - 1];
	}
}
