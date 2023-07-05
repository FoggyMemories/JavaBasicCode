package com.qian.a03oopextendsdemo03;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Fu{
    String name = "Fu";
}

class Zi extends Fu{
    String name = "Zi";
    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);           //就近原则,打印ziShow
        System.out.println(this.name);      //查找本类,打印Zi
        System.out.println(super.name);     //查找父类(仅仅查找上一级父类),打印Fu
        //在子类当中最多只能调用一次super,不能跨级调用父类中的成员变量
    }
}