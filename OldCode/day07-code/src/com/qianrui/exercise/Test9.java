package com.qianrui.exercise;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        /*
        练习：抢红包
             需求：奖品是现金红包，分别有{2,588,888,1000,10000}五种红包.
                   请使用代码模拟抽奖,打印出每个奖项,奖项的出现顺序要随机且不能重复.打印效果如下:(随即顺序,不一定是下面的顺序)
                                                                              888元的奖金被抽出
                                                                              588元的奖金被抽出
                                                                              10000元的奖金被抽出
                                                                              1000元的奖金被抽出
                                                                              2元的奖金被抽出
         */


        //1.定义数组 表示奖池
        int[] arr = {2, 588, 888, 1000, 10000};

        //2.定义一个新的数组 用于存储抽奖的结果
        int[] newArr = new int[arr.length];

        //3.抽奖
        //因为有5个奖项,所以这里要循环5次
        Random r = new Random();
        for (int i = 0; i < 5; ) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //获取奖项
            int prize = arr[randomIndex];
            //判断当前的奖项是否存在,如果讯在则重新抽取,如果不存在,就表示是有效奖项
            boolean flag = contains(newArr, prize);
            if (!flag) {
                //不存在
                //把当前抽取到的奖项添加到newArr当中
                newArr[i] = prize;
                //添加完毕后移动索引,否则不移动索引,一直循环
                i++;
            }
        }
        //4.遍历newArr
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i] + "元的奖金被抽出");
        }


    }

    //定义一个方法 判断prize在数组中是否存在
    //存在true
    //不存在false
    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
