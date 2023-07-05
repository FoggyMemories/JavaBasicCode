package com.objectOriented.demo;

public class GirlFriendDemo {
    public static void main(String[] args) {
        GirlFriend girl = new GirlFriend();

        girl.name = "还没有";
        girl.personality = "乖巧";
        girl.age = 18;
        girl.high = 165;

        System.out.println("女朋友的名字是:" + girl.name);
        System.out.println("女朋友的性格是:" + girl.personality + " 身高是：" + girl.high + " 年龄是" + girl.age);

        girl.coquetry();
        girl.cookDinner();
        girl.angry();



    }
}
/*
总结：1.定义类有什么需要注意的：
        类名首字母建议大写、英文、有意义，满足驼峰模式，不能用关键字，满足标志符规定;
        一个代码文件中可以定义多个类,但是只能一个类是public修饰的,
                public修饰的类名必须是Java代码的文件名称

      2.成员变量的格式是什么样的,有什么特点?
         成员变量的完整定义格式是:修饰符 数据类型 变量名称 = 初始化值;
         一般无需指定初始化值.
 */
