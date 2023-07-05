package com.qian.test;

public abstract class Cat extends Animal{
    //继承抽象类时有两种解决方法
    //1.重写里面所有的抽象方法
    //2.本身Cat也是一个抽象的,让Cat的子类再去重写 重写方法

    //此时采取第二种处理方案
    //因为猫中两个子类中eat的方法还是不一样的

}
