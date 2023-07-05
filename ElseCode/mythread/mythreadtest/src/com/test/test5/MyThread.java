package com.test.test5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
	//共享数据
	//{10,5,20,50,100,200,500,800,2,80,300,700}


	ArrayList<Integer> list;

	public MyThread(ArrayList<Integer> list) {
		this.list = list;
	}


	@Override
	public void run() {
		//循环
		//同步代码块
		//判断(已到达末尾)
		//判断(未到达末尾)

		while (true) {
			synchronized (MyThread.class) {
				if (list.size() == 0) {
					break;
				} else {
					//继续抽奖
					Collections.shuffle(list);
					Integer prize = list.remove(0);
					System.out.println(getName() + "抽奖箱又产生了一个" + prize + "元大奖");
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
