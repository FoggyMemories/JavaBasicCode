package com.qian.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        /*

        public boolean add(E e)             添加
        public void clear()                 清空
        public boolean remove(E e)          删除
        public boolean contains(Object obj) 判断是否包含
        public boolean isEmpty()            判断是否为空
        public int size()                   集合长度


        注意点:
        Collection是一个接口,不能直接创建他的对象.
        只能创建其实现类的对象
        实现类:ArrayList

         */


        //目的:为了学习Collection接口里面的方法
        Collection<String> coll = new ArrayList<>();

        //1.添加元素
        //返回值:
        //如果想要往List系列结合种添加数据,那么方法永远返回true,因为List允许元素重复的.
        //如果我们要往Set系列集合中添加数据,如果当前要添加元素不存在,方法返回true,表示添加成功
        //                               如果当前要添加元素存在,方法返回false,表示添加失败
        //                                  因为Set系列的集合不允许重复
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        System.out.println(coll);


        System.out.println("-----------------------");
        //2.清空元素
        coll.clear();

        System.out.println(coll);

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        System.out.println("-----------------------");

        //3.删除
        //注意:因为Collection里面定义的是共性的方法,所以此时不能通过索引进行删除.只能通过元素的对象进行删除
        //方法会有一个bool类型的返回值,删除成功返回true,删除失败返回false
        //如果要删除的元素不存在,就会删除失败
        coll.remove("aaa");
        System.out.println(coll);


        System.out.println("-----------------------");

        //4.判断元素是否包含
        //底层是依赖equals方法进行判断是否存在的
        //如果集合中存储的是自定义对象,也想通过contains方法来判断是否包含,那么在JavaBean类中,一定要重写equals方法.
        boolean result = coll.contains("aaa");
        System.out.println(result);

        boolean result2 = coll.contains("bbb");
        System.out.println(result2);

        System.out.println("-----------------------");
        //5.判断集合是否为空
        boolean result3 = coll.isEmpty();
        System.out.println(result3);

        System.out.println("-----------------------");
        //6.判断集合的长度
        int size = coll.size();
        System.out.println(size);

    }
}
