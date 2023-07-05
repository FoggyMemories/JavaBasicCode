package com.qian.demo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建集合的对象
        //泛型：限定集合中存储数据的类型


        //此时我们创建的是ArrayList的对象，而ArrayList是java已经写好的一个类
        //这个类再底层做了一些处理
        //打印对象不是地址值，而是集合中存储数据内容
        //在展示的时候会拿[]把所有的数据进行包裹
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);       //[]




        /*
        ArrayList成员方法
                方法名                         说明
        boolean add(E e)            添加元素,返回值表示是否添加成功
        boolean remove(E e)         删除指定元素,返回值表示是否删除成功
        E remove(int index)         删除指定索引的元素,返回被删除元素
        E set(int index,E e)        修改指定索引下的元素,返回原来的元素
        E get(int index)            获取指定索引的元素
        int size()                  集合的长度,也就是集合中的元素的个数
         */
    }
}
