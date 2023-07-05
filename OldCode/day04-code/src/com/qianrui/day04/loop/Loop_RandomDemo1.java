package com.qianrui.day04.loop;

import java.util.Random;

public class Loop_RandomDemo1 {
    public static void main(String[] args) {
        /*
        练习:猜数字小游戏
            需求:程序自动生成一个1~100之间的随机数字.
         */

        //获取随机数:java帮我们写好了一个类叫Random,这个类就可以生成一个随机数.
        /*
        使用步骤:
                1.导包 --- Random这个类在哪
                import java.util.Random;
                导包的动作必须出现在类定义的上边.

                2.创建对象 --- 表示我要开始用Random这个类了
                Random r = new Random();
                上面这个格式里,只有r是变量名,可以变,其他的都不允许变.

                3.生成随机数 --- 真正开始干活了
                int number = r.nextInt(随机数的范围);
                上面这个格式里,只有number是变量名,可以变,其他的都不允许变.
         */

        Random r = new Random();

        //在小括号中,书写的是生成随机数的范围
        //这个范围一定是从0开始的,到录入的数 - 1结束
        //口诀:包头不包尾,包左不包右

        for (int i = 0; i < 100; i++) {
            int x = r.nextInt(100); // 0~99;
            System.out.println(x);
        }
    }
}