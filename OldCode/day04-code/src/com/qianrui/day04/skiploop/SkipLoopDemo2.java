package com.qianrui.day04.skiploop;

public class SkipLoopDemo2 {
    public static void main(String[] args) {
        //小老虎吃包子，迟到第三个就吃饱了。
        //2.结束整个循环
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第" + i + "个包子");
            if(i == 3){
                break;
            }
        }
    }
}
