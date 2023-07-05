package com.mystatic.a01stsaticdemo1;

public class StudentTest {
    public static void main(String[] args) {

        //static表示静态,是Java中的一个修饰符
        /*
        被static修饰的成员变量,叫做静态变量
        特点:
            被该类所有对象共享

        调用方式:
            类名调用(推荐)
            对象名调用
         */



        /*
        被static修饰的成员方法,叫做静态方法
        特点：
            多用在测试类和工具类中
            JavaBean类中很少会用
         */
        Student.teacherName = "钱睿老师";
        //1.创建第一个学生对象
        Student s1 = new Student();
        s1.setName("zhangsan");
        s1.setAge(23);
        s1.setGender('男');



        s1.study();
        s1.show();


        //2.创建第二个学生对象
        Student s2 = new Student();
        s2.setName("lisi");
        s2.setAge(21);
        s2.setGender('女');

        s2.study();
        s2.show();
    }
}
