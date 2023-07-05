package com.qianrui.a03polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        //编译看左边，运行看右边
        a.eat();

        /*
        多态的弊端:
            不能直接调用子类的特有功能
            原因:
                当调用成员方法的时候,编译看左边,运行看右边
                那么,在编译的的时候会先检查左边的父类中有没有这个方法,如果没有则直接报错
            a.LookHome();
         */

        //解决方案:
        //变回子类类型就可以了
        //细节:转换的时候不能瞎转,如果转成其他类的类型,就会报错


        //判断变量的类型
        //JDK14新特性
        if(a instanceof Dog d){     //先判断a是否为Dog类型,如果是,则强转为Dog类型,转换之后变量名为d
                                    //如果不是,则不进行强转,结果直接是false
            d.LookHome();
        } else if(a instanceof Cat c){
            c.CatchMouse();
        } else {
            System.out.println("没有这个类型,无法转换");
        }



    }
}

class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void LookHome(){
        System.out.println("狗在看家");
    }
}


class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }

    public void CatchMouse(){
        System.out.println("猫捉老鼠");
    }
}
