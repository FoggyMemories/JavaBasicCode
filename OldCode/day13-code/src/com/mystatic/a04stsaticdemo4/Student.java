/*
static的注意事项
    静态方法 只能 访问静态变量和静态方法
    非静态方法 可以 访问静态变量或者静态方法，也可以 访问非静态的成员变量和非静态的成员方法
    静态方法中是没有this.关键字的


        总结:
            静态方法中没有this关键字
            静态方法中,只能访问静态.
            静态方法中不能访问非静态的方法
            非静态方法可以访问所有.


 */

package com.mystatic.a04stsaticdemo4;

public class Student {


    String name;
    int age;
    static String teacherName;


    //使用非静态方法，其中的内容是可以随着赋值进行改变
    //this:表示当前方法调用者的地址值。
    //这个this：是由虚拟机进行赋值的
    public void show1(Student this) {        //含有隐藏的this字符
        System.out.println("this:" + this);
        System.out.println(name + ", " + age + ", " + teacherName);

        //调用其他方法：
        this.show2();
    }

    public void show2() {
        System.out.println("Show2");
    }


    //使用静态方法，其中的赋值内容不可以发生改变
    public static void method() {
        //在静态方法中是没有this关键字的
        //静态变量里面无法进行调用非静态方法
        System.out.println("静态方法");
    }
}
