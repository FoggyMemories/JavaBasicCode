package com.test.logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        System.out.println("并且：");
        //1.  &  并且
        //两边都为真，结果才为真
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(true & false);
        System.out.println(false & true);

        System.out.println("或者：");
        //2.  |  或者
        //两边都为假，结果才为假
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(true | false);
        System.out.println(false | true);

        System.out.println("逻辑异或：");
        //3.  ^  逻辑异或
        //相同为false，不同为true
        //了解即可
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        System.out.println("逻辑非：");
        //4.  !  逻辑非
        //相反
        //提示：取反符号不要写多次，要么不写，要么只写一次
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!!true);



    }
}
