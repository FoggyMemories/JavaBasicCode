package com.qianrui.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        //创建三个对象，并调用register方法

        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(20);

        Teacher t = new Teacher();
        t.setName("王建国");
        t.setAge(30);

        Administrator admin = new Administrator();
        admin.setName("qianrui");
        admin.setAge(20);

        register(s);
        register(t);
        register(admin);
    }


    //这个方法技能接收老师，又能接收学生，还能接收管理员
    public static void register(Person p){
        p.show();
    }
}
