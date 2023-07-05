package com.qian.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        /*
            Collection系列集合三种通用的遍历方式:
                1.迭代器遍历
                2.增强for遍历
                3.lambda表达式遍历

            迭代器遍历相关的三个方法:
                Iterator<E> iterator()  :   获取一个迭代器对象
                boolean hasNext()       :   判断当前指向的位置是否有元素
                E next()                :   获取当前指向的元素并移动指针

         */

        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        //2.获取迭代器对象
        //迭代器就好比是一个箭头,默认指向集合的0索引处
        Iterator<String> it = coll.iterator();

        //3.利用循环不断的去获取集合中的每一个元素
        while (it.hasNext()){//如果有元素则返回true,无元素返回false
            //4.next方法的两件事情:获取元素并移动元素
            String str = it.next();
            System.out.println(str);
        }

        //当上面循环结束之后,迭代器的指针已经指向了最后没有元素的位置
        //System.out.println(it.next());  //NoSuchElementException

        //迭代器遍历完毕后,指针不会复位
        System.out.println(it.hasNext());//false

        System.out.println("------------------------------");

        //如果我们要继续第二次遍历集合,只能再次获取一个迭代器
        Iterator<String> it2 = coll.iterator();
        while (it2.hasNext()){
            String str = it2.next();
            System.out.println(str);
        }

        System.out.println("------------------------------");

        Iterator<String> it3 = coll.iterator();
        //remove
        while ((it3.hasNext())){
            String str = it3.next();
            if ("bbb".equals(str)){
                it3.remove();
            }
        }
        System.out.println(coll);
        /*
        迭代器的细节注意点：
            1.报错NoSuchElementException
            2.迭代器遍历完毕，指针不会复位
            3.循环中只能用一次next方法
            4.迭代器遍历时，不能用集合的方法进行增加或者删除
                暂时当做一个结论先行记忆，在今天我们会讲解源码详细的再来分析。
                如果我实在要删除：那么可以用迭代器提供的remove方法进行删除。
                如果我要添加，暂时没有办法。
       */
    }
}
