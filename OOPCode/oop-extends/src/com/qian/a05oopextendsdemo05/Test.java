package com.qian.a05oopextendsdemo05;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("吃米饭,吃菜");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

class Student extends Person {


    //方法的重写:
    //当父类的方法不能满足子类现在的需求时,需要进行方法重写
    //注意:子类重写的方法上面需要加上@override
    //建议:重写的方法尽量和父类保持一致
    //重写方法的名称、形参列表必须与父类中的一致。
    //子类重写父类方法时，访问权限子类必须大于等于父类
    //子类重写父类方法时，返回值类型子类必须小于等于父类
    //只有被添加到虚方法表中的方法才能被重写
    @Override
    public void drink() {
        System.out.println("喝牛奶");
    }


    public void lunch() {

        //以下均包含隐藏的this.
        //现在本类中是含有方法,如果有,就会调用子类的,如果没有,就会调用从父类继承下来的方法
        eat();
        drink();    //喝牛奶

        //直接调用父类里面的内容,不会再查看子类中的方法
        super.eat();
        super.drink();  //喝开水
    }
}
