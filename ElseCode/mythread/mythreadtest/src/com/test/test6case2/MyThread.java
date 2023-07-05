package com.test.test6case2;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
	ArrayList<Integer> list;

	public MyThread(ArrayList<Integer> list) {
		this.list = list;
	}


	@Override
	public void run() {

		ArrayList<Integer> boxList = new ArrayList<>();

		while (true) {
			synchronized (com.test.test5.MyThread.class) {
				if (list.size() == 0) {
					System.out.print("在此次抽奖过程中,");
					print(boxList);
					break;
				} else {
					//继续抽奖
					Collections.shuffle(list);
					Integer prize = list.remove(0);
					boxList.add(prize);
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void print(ArrayList<Integer> list) {
		System.out.println(getName() + "总共产生了" + list.size() + "个奖项.");
		System.out.print("分别为:");
		int sum = list.get(0);
		for (int index : list) {
			System.out.print(index + ", ");
			sum += index;
		}
		System.out.println("最高奖项为:" + Collections.max(list) + "总计额为" + sum);
	}
}
