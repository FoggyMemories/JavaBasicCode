package com.qianrui.test1.order;

import java.awt.*;

public class WhileTest1 {
    public static void main(String[] args) {
        /*
        练习:打印折纸的次数.
            需求:世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米),
            加入我有一张足够大的纸,它的厚度是0.1毫米.

            请问,该纸需要折叠多少次,就可以折成珠穆朗玛峰的高度?
         */
        int count = 0;
        double x = 0.1;

        while(x <= 8844430){
            count++;
            x *= 2;
        }
        System.out.println(count);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        toolkit.beep();

    }
}
