package com.qianrui.a04innerclassdemo4;

public class Test {
    public static void main(String[] args) {
        /*注意事项：
          1.静态内部类也是成员内部类中的一种
          2.静态内部类只能访问外部类中的静态变量和静态方法
            如果想要访问非静态类的需要创建对象.


          创建静态内部类对象的格式:
                外部类名.内部类名 对象名 = new 外部类名.内部类名();
          调用静态方法的格式:
                外部类名.内部类名.方法名();

         */

        //创建静态内部类的对象
        //只要是静态的东西,都可以用类名.直接获取
        Outer.Inner oi = new Outer.Inner(); //静态内部类

        oi.show1();
        //静态方法
        Outer.Inner.show2();
    }
}
