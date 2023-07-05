package com.qian.a02oopextendsdemo02;

public class Test {
    public static void main(String[] args) {
        //利用空参构造创建子类对象
        //子类中虚拟机自己添加的一个默认的空参构造
        Zi z1 = new Zi();


        //利用带参构造创建子类对象

        //错误原因:子类无法继承父类的构造方法
        //解决方案:在子类中创建一个方法,alt+回车解决
        //Zi z2 = new Zi("zhangsan",23);

    }
}


//此时为了方便查看,以后在写代码的时候,应该一个java文件只写一个类
class Fu{
    String name;
    int age;



    //构造方法
    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu{
    //如果一个类中没有构造方法,虚拟机会自动的添加一个默认的空参构造
}
