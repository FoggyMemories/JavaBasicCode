package com.qianrui.a06innerclassdemo6;

public class Test {
    public static void main(String[] args) {
        /*
            new 类名或者接口名(){
                重写方法;
            };
         */

        //编写匿名内部类的代码
        new Swim(){
            @Override
            public void Swim() {
                System.out.println("重写了游泳的方法");
            }
        };

        new Animal(){
            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };

        //如何在测试类中调用下面的method方法?
        //在之前是需要自己写一个子类继承Animal类
        //再创建子类的对象,传递给method方法
        Dog d = new Dog();//如果Dog类我只用一次,那么还需要单独定义一个类太麻烦
        method(d);


        //新的书写方式
        method(     //相当于将匿名类当参数传递给method方法

                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }

        );
    }
    public static void method(Animal a){    //Animal a = 子类对象  标准的多态形式
        a.eat();        //编译看左边,运行看右边
    }
}
