package com.test.logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        //1.  &&  短路与
        //运行结果和 & 一样
        //表示两边都为真，结果才为真
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);


        //2.  ||  短路或
        //运行结果和 | 一样
        //表示两边都为假，结果才为假
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

        //3.短路逻辑匀速那符具有短路效果
        //就按单理解：当左边的表达式能确定最终的结果，那么右边就不会参与运行
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;  //左边已经确定为假，就不进行右边的匀速那
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);  //右边的不进行运算，所以b的值依旧为10

        boolean test = ++a < 5 & ++b < 5;
        System.out.println(test);
        System.out.println(a);
        System.out.println(b);  //此时改为 & ，会进行右边的运算，所以，右边的b变为11
    }
}
