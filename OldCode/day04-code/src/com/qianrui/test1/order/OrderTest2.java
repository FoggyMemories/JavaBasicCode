package com.qianrui.test1.order;

public class OrderTest2 {
    public static void main(String[] args) {

        //汽车五日内驾驶会涉及到大量的判断
        //当汽车行驶的时候遇到了红绿灯，就会进行判断
        //如果是红灯亮，就会停止
        //如果是黄灯亮，就会减速
        //如果是绿灯亮，就行驶

        boolean islightgreen = false;
        boolean islightyellow = false;
        boolean islightred = true;


        if(islightgreen){
            System.out.println("请通行");
        }
        if(islightyellow){
            System.out.println("请减速");
        }
        if(islightred){
            System.out.println("请停止");
        }
    }
}
