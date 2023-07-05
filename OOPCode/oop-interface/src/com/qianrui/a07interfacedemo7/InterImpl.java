package com.qianrui.a07interfacedemo7;

public class InterImpl extends InterAdapter{

    //我需要用到哪个方法,就重写哪个方法
    @Override
    public void method5() {
        System.out.println("method5");
    }
}
