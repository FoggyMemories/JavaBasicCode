package com.qianrui.a02innerclassdemo2;

public class Outer {

    class Inner{

    }

    private class InnerA{

    }
    public InnerA getInstance(){
        return new InnerA();
    }
}
