package com.test.test4case1;

import java.util.Random;

public class MyThread extends Thread {
	//共享数据
	//100块钱，3个红包

	static double money = 100;
	static int count = 3;


	//最小的金额
	static final double MIN_MONEY = 0.01;

	@Override
	public void run() {
		//同步代码块
		//判断共享数据是否到了末尾(已经到达末尾)
		//判断共享数据是否到了末尾(没有到达末尾)

		synchronized (MyThread.class) {
			if (count == 0) {
				//已经到达末尾
				System.out.println(getName() + "没有抢到红包!!!");
			} else {
				//没有到达末尾
				//定义一个变量表示中奖的金额
				double prize = 0;
				if (count == 1) {
					//表示此时是最后一个红包
					//就无需随机,剩余所有钱都是中奖金额
					prize = money;
				} else {
					//表示第一次,第二次中奖金额(随机)
					Random r = new Random();
					double bounds = money - (count - 1) * MIN_MONEY;
					prize = r.nextDouble(bounds);//JDK17

					//防止抽到的金额小于最低金额
					if (prize < MIN_MONEY) {
						prize = MIN_MONEY;
					}
				}
				//从money当中去除当前中奖的金额
				money -= prize;
				//红包个数-1
				count--;
				//对本次红包的信息进行打印
				System.out.println(getName() + "抢到了" + prize + "元");
			}
		}
	}
}
