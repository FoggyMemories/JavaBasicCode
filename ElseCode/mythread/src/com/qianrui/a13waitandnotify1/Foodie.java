package com.qianrui.a13waitandnotify1;

public class Foodie extends Thread {
	@Override
	public void run() {
		/*
		 * 1.循环
		 * 2.同步代码块
		 * 3.判断共享数据是否到了末尾(优先写到了末尾的情况)
		 * 4.判断共享数据是否到了末尾(再写没有到末尾,执行核心逻辑)
		 * */

		while (true) {
			synchronized (Desk.lock) {
				if (Desk.count == 0) {
					break;
				} else {
					//先判断桌子上是否有面条
					if (Desk.foodFlog == 0) {
						//如果没有,就等待
						try {
							Desk.lock.wait();//让当前队形跟锁进行绑定
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						//把吃的总数进行-1
						Desk.count--;

						//如果有就开吃
						System.out.println("吃货在吃面条,还能再吃" + Desk.count + "碗!!!");
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						//吃完后,唤醒初始继续做
						Desk.lock.notifyAll();

						//修改桌子的状态
						Desk.foodFlog = 0;
					}
				}
			}
		}
	}
}
