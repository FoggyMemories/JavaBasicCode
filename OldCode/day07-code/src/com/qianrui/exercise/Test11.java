package com.qianrui.exercise;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*
        练习；双色球系统
            投注号码由6个红色球号码和一个蓝色球号码组成。
            红色球号码从1~33中选择；蓝色球号码从1~16中选择。
         */

        //1.生成中奖号码
        int[] arr = createNumber();

        //2.让用户输入号码（红色球 + 蓝色球）
        int[] userInputArr = userInputNumber();

        //3.判断用户的中奖情况:
        //分为两部分:第一部分判断红色球的中奖个数,第二部分判断蓝色球是否中奖

        int redCount = 0;
        int blueCount = 0;
        //首先判断红球的中奖个数
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[j]) {
                    redCount++;
                    //如果找到了,那么后面的数字就没有必要继续比较了,因为数字不可能重复
                    //跳出内循环,继续循环下一个红色球号码是否中奖
                    break;
                }
            }
        }

        //继续判断蓝色球是否中奖
        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }

        System.out.println("恭喜你所中奖的红色球的个数" + redCount);
        System.out.println("恭喜你所中奖的蓝色球的个数" + blueCount);

        //根据红色球和蓝色球的中奖个数来判断中奖金额.
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜您,中奖金额为1000万元");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜您,中奖金额为500万元");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜您,中奖金额为3000元");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜您,中奖金额为200元");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜您,中奖金额为10元");
        } else if ((redCount == 2 || redCount == 1 || redCount == 0) && blueCount == 1) {
            System.out.println("恭喜您,中奖金额为5元");
        } else {
            System.out.println("很遗憾,本期彩票您没有中奖");
        }

        System.out.println("===============================");
        System.out.println("本期的中奖号码为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("===============================");
    }

    public static int[] userInputNumber() {
        //1.创建数组用于添加用户所输入所购买的数组
        int[] arr = new int[7];

        Scanner sc = new Scanner(System.in);
        //让用户输入红色球号码
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int inputRedNumber = sc.nextInt();
            //inputRedNumber 的范围为1~33 ,且唯一不重复
            if (inputRedNumber <= 33 && inputRedNumber >= 1) {
                boolean flag = contains(arr, inputRedNumber);
                if (!flag) {
                    //不存在
                    //此时为有效数字,可以添加到数组当中
                    arr[i] = inputRedNumber;
                    i++;
                } else {
                    //存在,此时应该重新输入不重复的数字
                    System.out.println("您输入的红色球号码与前面的重复,请重新输入.");
                }
            } else {
                System.out.println("您所输入的数字有误,请重新输入.");
            }
        }
        //让用户输入蓝色球号码
        System.out.println("请输入蓝色球号码:");
        //蓝色球号码的范围为1~16;
        while (true) {
            int inputBlueNumber = sc.nextInt();
            if (inputBlueNumber <= 16 && inputBlueNumber >= 1) {
                arr[arr.length - 1] = inputBlueNumber;
                break;
            } else {
                System.out.println("您所输入的蓝色球号码有误");
            }
        }
        return arr;
    }

    public static int[] createNumber() {
        //1.创建数组用于添加中奖号码
        //6个红色球 1个蓝色球 数组长度为7
        int[] arr = new int[7];

        //2.随机生成号码并添加到数组当中
        //红色球：不能相互重复
        //蓝色球：可以和红色球重复
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                //把红球代码添加到数组当中
                arr[i] = redNumber;
                i++;
            }
        }

        //生成蓝色球号码并添加到数组当中
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;

        return arr;

    }

    //用于判断数字在数组中是否存在
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}


