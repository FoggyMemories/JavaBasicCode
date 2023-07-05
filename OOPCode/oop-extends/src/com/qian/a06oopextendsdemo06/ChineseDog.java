package com.qian.a06oopextendsdemo06;

public class ChineseDog extends Dog{

    //必须进行重写，并且，完全用不到父类中的代码，所以说不需要通过super进行调用
    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}
