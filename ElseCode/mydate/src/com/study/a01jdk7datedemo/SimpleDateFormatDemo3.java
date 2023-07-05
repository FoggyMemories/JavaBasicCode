package com.study.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo3 {
	public static void main(String[] args) throws ParseException {
        /*
        限时秒杀练习:
            秒杀开始时间:2023年11月11日 0:0:0
            秒杀结束时间:2023年11月11日 0:10:0

        需求:
            小贾下单并付款的时间为:2023年11月11日 0:01:0
            小皮下单并付款的时间为:2023年11月11日 0:11:0

            用代码说明这两位同学有没有参加上秒杀活动?
         */


		//比较两个时间
		//下单并付款的时间跟 开始时间 和 结束时间 进行比较

		//1.解析时间得到毫秒值
		String starStr = "2023年11月11日 0:0:0";
		String endStr = "2023年11月11日 0:10:0";
		String orderJiaStr = "2023年11月11日 0:01:0";
		String orderPiStr = "2023年11月11日 0:11:0";


		//2.解析
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

		Date startDate = sdf1.parse(starStr);
		Date endDate = sdf1.parse(endStr);
		Date orderJiaDate = sdf1.parse(orderJiaStr);
		Date orderPiDate = sdf1.parse(orderPiStr);

		//3.得到三个时间的毫秒值
		long startTime = startDate.getTime();
		long endTime = endDate.getTime();
		long orderJiaTime = orderJiaDate.getTime();
		long orderPiTime = orderPiDate.getTime();

		//4.进行判断
		if (orderJiaTime >= startTime && orderJiaTime <= endTime) {
			System.out.println("小贾参加上了秒杀活动");
		} else {
			System.out.println("小贾没有参加上秒杀活动");
		}
		if (orderPiTime >= startTime && orderPiTime <= endTime) {
			System.out.println("小皮参加上了秒杀活动");
		} else {
			System.out.println("小皮没有参加上秒杀活动");
		}
	}
}
