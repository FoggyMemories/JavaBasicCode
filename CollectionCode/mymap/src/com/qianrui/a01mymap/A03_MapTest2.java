package com.qianrui.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A03_MapTest2 {
    public static void main(String[] args) {
        //练习二:利用键找值的方式遍历map集合,要求:装着键值对对象的单列集合使用Lambda的形式进行遍历

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();


        //2.添加元素
        map.put("郭靖", "黄蓉");
        map.put("韦小宝", "沐剑屏");
        map.put("尹志平", "小龙女");

        //3.Map集合的第二种遍历方式
        //通过键值对对象进行遍历
        //3.1 通过一个方法获取多有的键值对对象,返回一个Set集合

        //泛型的嵌套
        Set<Map.Entry<String, String>> entries = map.entrySet();

        entries.forEach(Entry -> {
            String key = Entry.getKey();
            String value = Entry.getValue();
            System.out.println(key + " = " + value);
        });

    }
}
