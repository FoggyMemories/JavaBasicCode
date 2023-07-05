package com.qianrui.exercise;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*
        练习：评委打分
              需求：在唱歌比赛中，有6个评委给选手打分，分数范围是[0 ~100]之间的整数.选手的最后得分为:
                    取消最高、最低分后的4个评委的平均分,请完成上述过程并计算出选手的得分.
         */
        int[] scoreArr = getScores();
        System.out.println("这六位评委的打分分别为:");

        //进行对评委打分的数值遍历
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.print(scoreArr[i] + " ");
        }

        System.out.println();

        int max = getMax(scoreArr);
        System.out.println("这6个评委打分之中的最大值为:" + max);

        int min = getMin(scoreArr);
        System.out.println("这6个评委打分之中的最小值为:" + min);

        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        System.out.println("这六个评委打分的总和为:" + sum);

        double average = (sum - max - min)/((scoreArr.length) - 2);  //尽量不要将数值写死,应该将数值给变换为长度减2.

        System.out.println("这六个评委去除最高分,去除最低分的平均数为:" + average);

    }

    public static int[] getScores() {
        int[] scores = new int[6];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {    //在此处将i的自加给删除
            System.out.println("请输入第" + (i + 1) + "位评委的打分结果");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;     //如果数据不符合范围,则不会进行i的自加,则走else
            } else {
                System.out.println("您所录入的数字有误,请重新录入");
                //else结束后则会重新进行if里面的语句,
                // 重新判断下一个录入的数字是否合法
            }
        }
        return scores;
    }

    //求数组的最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (max < scoreArr[i]) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    //求数组的最小值   shift+F6可以选中相同的定义字符
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (min > scoreArr[i]) {
                min = scoreArr[i];
            }
        }
        return min;
    }
}
