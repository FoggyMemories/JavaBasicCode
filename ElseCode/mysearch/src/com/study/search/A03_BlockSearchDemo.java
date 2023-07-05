package com.study.search;

public class A03_BlockSearchDemo {
	public static void main(String[] args) {
        /*

            分块查找：
            核心思想：
                块内无序，块见有序。
            实现步骤：
                1.创建数组blockArr存放每一个块对象的信息
                2.先查找blockArr确定要查找的数据属于哪一块
                3.再单独遍历这一数据即可

         */
		//1.要把数据进行分块
		//分块时将长度开根号，设置为分组的长度
		int[] arr = {16, 5, 9, 12, 21, 18,
				32, 23, 37, 26, 45, 34,
				50, 48, 61, 52, 73, 66};

		//创建三个块对象
		Block b1 = new Block(21, 0, 5);
		Block b2 = new Block(45, 6, 11);
		Block b3 = new Block(73, 12, 17);

		//定义数组用来管理三个块对象(索引表)
		Block[] blockArr = {b1, b2, b3};

		//定义一个变量用来记录要查找的元素
		int number = 32;

		//调用方法,传递索引表,数组,要查找的元素
		int index = getIndex(blockArr, arr, number);

		//打印一下
		System.out.println(index);
	}

	//利用分块查找的原理,查询number的索引

	//1.确定number再索引表的位置
	private static int getIndex(Block[] blockArr, int[] arr, int number) {

		//1.确定number是在哪一块当中的
		int indexBlock = findIndexBlock(blockArr, number);
		if (indexBlock == -1) {
			//表示number不在数组当中
			return -1;
		}

		//在数组当中
		//获取这一块的起始索引和结束索引
		int startIndex = blockArr[indexBlock].getStartIndex();
		int endIndex = blockArr[indexBlock].getEndIndex();

		//3.遍历
		for (int i = startIndex; i <= endIndex; i++) {
			if (arr[i] == number) {
				return i;
			}
		}
		return -1;
	}

	//定义一个方法,用来确定number在那一块当中
	private static int findIndexBlock(Block[] blockArr, int number) {
		//从0索引开始遍历blockArr,如果number小于max,那么就表示number是在这一块当中的
		for (int i = 0; i < blockArr.length; i++) {
			if (number <= blockArr[i].getMax()) {
				return i;
			}
		}

		return -1;
	}
}


class Block {
	private int max;//最大值
	private int startIndex;//起始索引
	private int endIndex;//结束索引


	public Block() {
	}

	public Block(int max, int startIndex, int endIndex) {
		this.max = max;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}

	/**
	 * 获取
	 *
	 * @return max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * 设置
	 *
	 * @param max
	 */
	public void setMax(int max) {
		this.max = max;
	}

	/**
	 * 获取
	 *
	 * @return startIndex
	 */
	public int getStartIndex() {
		return startIndex;
	}

	/**
	 * 设置
	 *
	 * @param startIndex
	 */
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * 获取
	 *
	 * @return endIndex
	 */
	public int getEndIndex() {
		return endIndex;
	}

	/**
	 * 设置
	 *
	 * @param endIndex
	 */
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	public String toString() {
		return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
	}
}