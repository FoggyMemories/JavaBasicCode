package com.qianrui.day04.loop;

import java.util.Random;

public class
Loop_RandomDemo2 {
    public static void main(String[] args) {
        //需求:随机数的范围:1~100
        Random r = new Random();
        int x= r.nextInt(11);
        x -= 1;
        System.out.println(x);

        //秘诀
        //用来生成任意数到任意数之间的随机数
        //1.让这个范围头尾都减去一个值,让这个范围从0开始
        //2.尾巴+1
        //3.最终的结果,再加上第一步减去的值.

        //如7~15
        int a = r.nextInt(9) + 7;
        System.out.println(a);
    }
}
