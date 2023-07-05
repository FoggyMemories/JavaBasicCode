package com.qianrui.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A02_MapTest3 {
    public static void main(String[] args) {
        //练习三:利用键找值的方式遍历map集合,要求:装着键的单列集合使用lambda表达式的形式进行遍历

        //1.创建Map集合的对象

        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("郭靖", "黄蓉");
        map.put("韦小宝","沐剑屏");
        map.put("尹志平","小龙女");

        //3.ͨ通过键查找值

        //3.1获取所有的键，把这些键放到一个单链集合当中
        Set<String> keys = map.keySet();

        keys.forEach(key -> {
            String value = map.get(key);
            System.out.println(value);
        });
    }
}
