package com.qian.a04mygenerice;


import java.util.Arrays;

/**
 * 当我在编写一个类的时候,如果不确定类型,那么这个类就可以定义为泛型类.
 * 一般泛型有约定的符号：
 * E 代表 Element，<E> 通常在集合中使用；
 * T 代表 Type，<T>通常用于表示类；
 * K 代表 Key，V 代表 Value，<K, V> 通常用于键值对的表示；?
 *
 * @param <E>
 */
public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int size;


    /*
        E:表示是不确定的类型.该类型在类名后面已经定义过了.
        e:形参的名字,变量名
     */
    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }

    /*
        方法中形参类型不确定时

        方案1：使用类名后面的泛型           所有方法都能用
        方案2：在方法申明上定义自己的泛型    只有本方法能用


        格式:
            修饰符<类型> 返回值类型 方法名(类型 变量名){

            }

        举例:
            public<T> void show(T t){

            }
     */
}
