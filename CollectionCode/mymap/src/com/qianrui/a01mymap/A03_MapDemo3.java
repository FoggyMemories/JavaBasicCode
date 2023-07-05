package com.qianrui.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式


        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();


        //2.添加元素
        map.put("郭靖", "黄蓉");
        map.put("韦小宝","沐剑屏");
        map.put("尹志平","小龙女");

        //3.Map集合的第二种遍历方式
        //通过键值对对象进行遍历
        //3.1 通过一个方法获取多有的键值对对象,返回一个Set集合

        //泛型的嵌套
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //3.2 遍历entries这个集合,去得到里面的每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            //3.3利用entry调用get方法获取键和值
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " = " + value);
        }
    }
}
