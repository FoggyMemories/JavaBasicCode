package com.qian.a05myset;

public class a02_HashSetDemo1 {
    public static void main(String[] args) {
        /*

            哈希值:
                对象的整数表现形式
                1.如果没有重写hashCode方法,不同对象计算出的哈希值是不同的
                2.如果已经重写hashCode方法,不同的对象只要属性值相同,计算出的哈希值就是一样的.
                3.但是在小部分情况下,不同的属性值或者不同的地址值计算出来的哈希只也有可能一样.(哈希碰撞)

         */


        //1.创建对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);

        //2.如果没有重写hashCode方法,不同对象计算出的哈希值是不同的
        //  如果已经重写hashCode方法,不同的对象只要属性值相同,计算出的哈希值就是一样的.
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //3.但是在小部分情况下,不同的属性值或者不同的地址值计算出来的哈希只也有可能一样.(哈希碰撞)
        System.out.println("abc".hashCode());   //96354
        System.out.println("acD".hashCode());   //96354



        /*
        HashSet底层原理
            1.创建一个默认长度16,默认加载因子为0.75的数组*,数组名为table.
            2.根据元素的哈希值跟数组的长度计算出应存入的位置
            3.判断当前位置是否为null,如果为null则直接存入
            4.如果位置不为nul,表示有元素,则调用equals方法比较属性值
            5.  一样:不存               不一样:存入数组,形成链表

                JDK8以前:新元素存入数组,老元素挂在新元素下面
                JDK8以后:新元素直接挂在老元素下面


                **JDK8以后,当链表长度超过8,而且数组长度大于等于64时,自动转换为红黑树
                  如果集合中存储的时自定义对象,必须要重写hashCode和equals方法     如果不重写,在底层使用地址值进行比较的

         */

        //*
        // 在Java中，HashSet底层使用的是一个HashMap实现，其中0.75指的是HashMap的负载因子，
        // 表示在HashMap中，元素的数量达到数组大小的0.75倍时就会进行扩容操作。
        //
        // 具体来说，当HashMap中元素的数量达到数组大小的0.75倍时，HashMap会创建一个新的数组，
        // 并将原来的元素重新散列到新的数组中，这样可以避免哈希碰撞带来的性能问题。
        // 同时，新的数组大小是原来的两倍，这样可以保证HashMap的性能始终保持在一个合理的范围内。
        //
        // 因此，HashSet底层默认加载因为0.75的数组意思是，当向HashSet中添加元素时，
        // HashSet会根据0.75的负载因子计算出合适的数组大小，并创建一个初始大小为16的数组，
        // 当HashSet中的元素数量超过数组大小的0.75倍时，HashSet会自动进行扩容操作，
        // 以保证HashSet的性能和存储能力。
    }
}
