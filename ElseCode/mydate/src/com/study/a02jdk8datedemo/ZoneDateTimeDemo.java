package com.study.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {
	public static void main(String[] args) {
        /*
            static ZonedDateTime now()                   获取当前时间的ZonedDateTime对象
            static ZonedDateTime ofXxxx(...)             获取指定时间的ZonedDateTime对象
            ZonedDateTime withXxx(时间)                   修改时间系列的方法
            ZonedDateTime minusXxx(时间)                  减少时间系列的方法
            ZonedDateTime plusXxx(时间)                   增加时间系列的方法
         */
		//1.获取当前时间对象(带时区)
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now);    //2023-04-02T17:58:12.339331900+08:00[Asia/Hong_Kong]

		System.out.println("---------------------------");
		//2.获取指定的时间对象(带时区)1
		//年月日时分秒纳秒方式指定
		ZonedDateTime time1 = ZonedDateTime.of(2023, 10, 1,
				11, 12, 12, 0, ZoneId.of("Asia/Shanghai"));
		System.out.println(time1);

		//通过Instant + 时区的方式指定获取时间对象
		Instant instant = Instant.ofEpochMilli(0L);
		ZoneId zoneId = ZoneId.of("Asia/Shanghai");
		ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);
		System.out.println(time2);

		System.out.println("---------------------------");


		//3.withXxx 修改时间系列的方法
		ZonedDateTime time3 = time2.withYear(2000);
		System.out.println(time3);
		//不仅可以修改年,日期,小时等也可修改
		ZonedDateTime time4 = time2.withHour(12);
		System.out.println(time4);
		System.out.println("---------------------------");

		//4. 减少时间
		ZonedDateTime time5 = time3.minusYears(1);  //同理,可以减少不同的单位 例如(小时、秒)等
		System.out.println(time5);
		System.out.println("---------------------------");

		//5.增加时间
		ZonedDateTime time6 = time5.plusYears(1);
		System.out.println(time6);


		//细节：
		//JDK8 新增的时间对象都是不可改变的
		//如果我们修改,减少,增加时间
		//那么调用者是不会改变的,产生一个新的时间。
	}
}

