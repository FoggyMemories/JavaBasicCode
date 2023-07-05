package com.test;

public class 赋值运算 {
    public static void main(String[] args) {
        /*
            符号      作用          说明
             =        赋值       int a = 10,将10赋值给变量a
             +=     加后赋值       a+=b，将a+b的值赋给a
             -=     减后赋值       a-=b，将a-b的值赋给a
             *=     乘后赋值       a/=b，将a/b的商赋给a
             %/    取值后赋值      a%=b，将a/b的余数赋给a
         */

        //+-
        //规则：将左边和右边进行相加，然后再把结果赋值给左边
        int a = 10;
        int b = 20;
        //吧a和b进行相加，然后再把结果赋值给左边的变量a
        a += b;
        //等同于 a = a + b;但是由于下面所述的*细节*，应该等同于：a = (int)(a + b);
        System.out.println(a);   //30
        System.out.println(b);   //20

        //细节：
        //+= 、 -= 、 *= 、 /= 、 %= ，底层都隐藏了一个强制类型转换
        short s =1;
        //把左边和右边进行相加，得到结果2，再赋值给左边的变量
        s += 1;
        //并不直接等同于 s = s + 1;而是看左边转化的变量的形式，应该等同于 s = (short)(S + 1);
        System.out.println(s);  //2

        System.out.println("测试：");
        int i = 123;
        int y = 100;
        i %= y;
        System.out.println(i);

    }
}
