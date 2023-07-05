package com.test;

public class 自增自减运算符 {
    public static void main(String[] args) {
        /*
        符号      作用      说明
        ++         加       变量的数值加1
        --         减       变量的数值减1
         */
        int a = 10;
        a++;      //注意事项：++和--既可以放在变量前面，也可以放在变量后面
                  //单独使用：++和--无论是放在变量的前边还是后边，单独写一行结果是一样的。
        System.out.println(a);
    }
}
