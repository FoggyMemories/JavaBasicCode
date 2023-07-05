package com.qianrui.exercise;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
        练习：开发验证码
            需求：*定义方法实现随机产生一个长度为5的验证码
                 *验证码格式：
                           *长度为5
                           *前四位是大写字母或者小写字母
                           *最后一位为数字
         */

        //方法：需要在一堆没有什么规律的数据中进行随机抽取，
        //可以先把这些数据都放到数组当中
        //再随机抽取一个索引

        //查找ASCII码表
        int x = 'A';
        System.out.println(x);
        int y = 'a';
        System.out.println(y);

        //大写字母
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (y + i);
            } else {
                chs[i] = (char) (x + i - 26);
            }
        }


        //遍历测试
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        }

        Random r = new Random();
        System.out.println();

        String result = "";
        //因为需要4个不同的数，因此需要循环4次
        for (int i = 0; i < 4; i++) {
            //利用随即索引，获取对应的元素
            int randomIndex = r.nextInt(chs.length);
            System.out.print(chs[randomIndex] + " ");
            result += chs[randomIndex];
        }       //前四位随机字母生成结束

        //随机生成一位数字在第五位。
        int number = r.nextInt(9);
        System.out.println(number);

        result += number;
        System.out.println("这个验证码为：" + result);

    }
}
