package com.qianrui.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A02_MapTest1 {
    public static void main(String[] args) {
        //练习一:利用键找值的方式遍历map集合,要求:装着键的单列集合使用增强for的形式进行遍历

        //1.创建Map集合的对象

        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("123", "123");
        map.put("345", "345");
        map.put("456", "456");

        //3.通过键查找值

        //3.1获取所有的键，把这些键放到一个单链集合当中
        Set<String> keys = map.keySet();

        for (String key : keys) {
            String value = map.get(key);
            System.out.println(value);
        }
    }
}
