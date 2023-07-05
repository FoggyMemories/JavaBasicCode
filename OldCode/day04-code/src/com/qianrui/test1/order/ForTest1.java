package com.qianrui.test1.order;

public class ForTest1 {
    public static void main(String[] args) {
        /*
        练习:断线重连
            在实际开发中.需要重复执行的代码,会选择循环实现.
            比如:玩游戏的时候,如果网络不好,那么会经常断线重连.
            那么断线重连这个业务逻辑就需要重复执行.
            现在公司要求,断线重连的业务逻辑最多只能写5次.
            请使用代码实现.
            备注:断线重连的业务逻辑可以用输出语句替代.
         */
        System.out.println("您当前的网络不稳定");
        System.out.println("正在尝试重新链接");
        for(int a = 1;a <= 5;a++){
            System.out.println("正在准备重新连接,剩余次数" + a +"次");
        }
    }
}
