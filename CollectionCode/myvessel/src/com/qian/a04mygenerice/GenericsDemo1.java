package com.qian.a04mygenerice;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型的时候,集合存储数据的方式

        //1.创建集合对象
        ArrayList list = new ArrayList();

        //2.添加数据
        list.add(123);
        list.add("aaa");
        list.add(new Student("zhangsan", 21));
        //没有泛型的时候,在集合中可以添加任意的数据


        //3.遍历集合
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            //多态的弊端是不能访问子类的特有功能     例如:不能调用字符串中的功能  obj.length();
            System.out.println(obj);
        }

        //结论:如果我们没有给集合指定类型,默认为所有的数据类型都是Object类型
        //此时可以往集合中添加任意的数据类型
        //带来一个缺陷:在获取数据的时候,无法使用子类的其他特有行为(强转会容易出现类型转化异常)

        //此时推出了泛型,可以在添加数据的时候就把数据类型进行统一
        //而且在我们获取数据的时候,也省了强转这一过程,非常的方便


        //1.创建集合对象(包括泛型)
        ArrayList<String> list1 = new ArrayList<>();

        //2.添加数据
        list1.add("asd");
        list1.add("aaa");
        list1.add("bbb");

        //3.遍历集合
        Iterator<String> it1 = list1.iterator();
        while (it1.hasNext()) {
            String str = it1.next();
            System.out.println(str.length());       //此时不需要经过强转即可实现使用子类的其他特有行为
            System.out.println(str);
        }


        /*
        泛型的好处:
            统一数据类型
            把运行时期的问题提前到了编译期间,避免了强制类型转换可能出现的异常,因为在编译阶段类型就能确定下来

        拓展知识点：Java中的泛型都是伪泛型
        此处泛型尽在编译时期有效

        泛型的擦除
         */
    }
}
