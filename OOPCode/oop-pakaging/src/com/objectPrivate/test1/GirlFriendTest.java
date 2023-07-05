package com.objectPrivate.test1;

public class GirlFriendTest {
    public static void main(String[] args) {

        //创建一个新的对象
        GirlFriend gf1 = new GirlFriend();

        //进行赋值、并进行判断
        gf1.setName("小萌萌");
        gf1.setAge(18);
        gf1.setGender("女");

        //可以用新定义的变量来接收
        String name = gf1.getName();
        int age = gf1.getAge();
        String gender = gf1.getGender();

        System.out.println("女朋友的名字是：" + name);
        System.out.println("女朋友的年龄是：" + age);
        System.out.println("女朋友的性别是：" + gender);

        //也可以直接用来打印
        System.out.println("女朋友的名字是：" + gf1.getName());
        System.out.println("女朋友的年龄是：" + gf1.getAge());
        System.out.println("女朋友的性别是：" + gf1.getGender());


        gf1.eat();
        gf1.sleep();
    }
}
/*
总结：
    1.private关键字是一个权限修饰符
    2.可以修饰成员（成员变量和成员方法）
    3.被private修饰的成员只能在本类中才能访问
    4.针对private修饰的成员变量，如果需要其他类使用，提供相应的操作
    5.提供"setXxx(参数)"方法,用于给成员变量赋值,方法用public修饰
    6.提供"getXxx()"方法,用于获取成员变量的值,方法用public修饰
 */
