package com.qian.a06oopextendsdemo06;

public class SharPei extends Dog{

    //沙皮狗吃的是狗粮和骨头
    //父类中的方法不能满足我们的需求了，所以需要进行重写


    @Override
    public void eat() {
        super.eat();
        System.out.println("狗啃骨头");
    }
}
