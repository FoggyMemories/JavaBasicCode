package com.objectOriented.test;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();

        //给手机进行赋值
        p.brand = "小米";
        p.price = 1999.98;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法
        p.call();
        p.playGame();




        //如果想添加一个新的手机则需重新定义即可
        Phone p2 = new Phone();

        p2.brand = "苹果";
        p2.price = 8999.99;

        //获取新定义手机中的值
        System.out.println(p2.brand);
        System.out.println(p2.price);

        //调用新手机中的方法
        p2.call();
        p2.playGame();
    }
}

/*
    总结:
        1.类和对象是什么?
           类:是共同特征的描述(设计图);
           对象:是真是存在的具体实例.
        2.如何得到对象?
           public class 类名 {
                1.成员变量(代表属性的,一般是名词)
                2.成员方法(代表行为的,一般是动词)
           }
           类名 对象名 = new 类名();
        3.拿到对象后能做什么?
            对象.成员变量;
            对象.成员方法(...)

     定义类的补充注意事项
         用来描述一类事物的类,专业叫做:JavaBean类.
         在JavaBean类中,不写main方法.

         之前所写的带main方法的类叫做 测试类

         类名首字母建议大写，需要见名知意，驼峰模式。

         一个Java文件中可以定义多个class类，且只能一个类是public修饰，
         而且public修饰的类名必须成为代码文件名。
         实际开发中建议还是一个文件定义一个class类。

         成员变量的完整格式是：修饰符 数据类型 变量名称  = 初始化值; 一把无需指定初始化值,存在默认值.
         对象的成员变量的默认值规则
         数据类型               明细                  默认值
                        byte short int long            0
         基本类型:          float double               0.0
                              boolean                false
         引用类型:        类、接口、数组、String        null




 */
