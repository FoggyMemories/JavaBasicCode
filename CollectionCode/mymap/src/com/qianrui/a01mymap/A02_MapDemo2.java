package com.qianrui.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        //1.创建Map集合的对象

        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("123", "123");
        map.put("345", "345");
        map.put("456", "456");

        //3.通过键查找值

        //3.1获取所有的键，把这些键放到一个单链集合当中
        Set<String> keys = map.keySet();

        //3.2遍历单链集合，得到每一个键
        for (String key : keys) {
            //System.out.println(key);
            //3.3利用map集合中的键获取对应的值  get
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
