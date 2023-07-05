package com.study.a04test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
	public static void main(String[] args) {
        /*
        练习:
            算法水题:
                判断任意一个年份是闰年还是平年
                要求:用JDK7和JDK8两种方式判断

                提示:
                    二月有29天的是闰年
                    一年有366天是闰年
         */

		//JDK7

		//把时间设置为2000年3月1日
		Calendar c = Calendar.getInstance();
		c.set(2000, 2, 1);

		//把日历往前减一天
		c.add(Calendar.DAY_OF_MONTH, -1);

		//查看时间日期是28还是29日
		int day1 = c.get(Calendar.DAY_OF_MONTH);
		if (day1 == 28) {
			System.out.println(c.get(Calendar.YEAR) + "不是闰年");
		} else {
			System.out.println(c.get(Calendar.YEAR) + "是闰年");
		}

		//JDK8


		//复杂:
		//月份的范围1 ~ 12
		//把时间设置为2000年3月1日
		LocalDate ld1 = LocalDate.of(2000, 3, 1);
		//把时间往前减一天
		LocalDate ld2 = ld1.minusDays(1);
		//获取这天的日期
		int day2 = ld2.getDayOfMonth();
		if (day2 == 28) {
			System.out.println(ld2.getYear() + "不是闰年");
		} else {
			System.out.println(ld2.getYear() + "是闰年");
		}


		//简易:

		//ture:闰年
		//false:平年
		System.out.println(ld1.isLeapYear());
	}
}
