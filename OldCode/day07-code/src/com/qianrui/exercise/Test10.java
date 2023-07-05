package com.qianrui.exercise;

import java.util.Random;

public class Test10 {
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


        //1.把奖池里面的所有奖项打乱顺序
        int[] arr = {2,588,888,1000,10000};
        //打乱顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //拿着i跟随机索引上的值进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        //2.遍历奖池，从 0 索引驾驶获取每一个奖项
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "元的奖金被抽出");
        }
    }
}
