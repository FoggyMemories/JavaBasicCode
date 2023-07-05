package com.test.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        //除法
        System.out.println(10 / 2);
        System.out.println(10 / 3);//结论：整数参与运算，结果只能产生整数
        System.out.println(10.0 / 3);//结论：如果想生成小数，运算的时候必须得有小数参与运算；且小鼠参与运算结果有可能不精确。

        //取模；取余   实际上也是除法运算，只不过得到的是余数而已
        System.out.println(10 % 2);//0
        System.out.println(10 % 3);//1



        //应用场景
        //1.可以取模来判断，A是否可以被B整除
        //A % B    10 % 3
        //2.可以判断A是否为偶数
        //A % 2 如果结果为0，那么证明A是一个整数，如果结果为1，那么证明A是一个奇数

        //3.在以后，斗地主发牌
        //三个玩家
        //把每一张牌都定义一个序号
        //拿着序号 % 3，如果结果为1，就发给第一个玩家；如果结果为2，就发给第二个玩家；如果结果为0，就发给第三个玩家。
    }
}
