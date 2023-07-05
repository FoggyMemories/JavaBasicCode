package com.qianrui.a03mylinkedshashmap;

import java.util.LinkedHashMap;

public class A07_LinkedHashMapDemo1 {
    public static void main(String[] args) {
        /*
            LinkedHashMap:
                由键决定:
                    有序、不重复、无索引。

                有序:
                    保存存储和取出的顺序一致

                原理:
                    底层数据结构依然是哈希表,只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序
         */


        //1.创建集合

        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        //2.添加元素

        lhm.put("a",123);
        lhm.put("a",111);   //同 键 的时候 会进行覆盖操作
        lhm.put("b",456);
        lhm.put("c",789);

        //3.遍历集合

        System.out.println(lhm);
    }
}
