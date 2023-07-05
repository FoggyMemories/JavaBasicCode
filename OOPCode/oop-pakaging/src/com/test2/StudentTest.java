package com.test2;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象

        //调用的空参构造
        /*
        Student s = new Student();
         */
        //会直接调用Student里面的空参

        //带参构造
        Student s = new Student("zhangsan",20);
        //当带参数输入时，系统会自动的录入构造
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
/*
构造方法注意事项
    1.构造方法的定义
        如果没有定义构造方法，系统将给出一个 默认 的 无参构造方法
        如果定义了构造方法，系统将不再提供默认的构造方法
    2.构造方法的重载
        带参构造方法，和无参数构造方法，两者方法名相同，但是参数不同，这叫做构造方法的重载
    3.推荐的使用方式
        无论是否使用，都手动书写空参数构造方法和带全部参数的构造方法
 */
