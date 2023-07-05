package com.qianrui.a01immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo4 {
    public static void main(String[] args) {
        /*
            创建Map的不可见集合，键值对的数量超过10个
         */


        //1.创建以恶搞普通的Map集合

        HashMap<String,String> hm = new HashMap<>();

        hm.put("张三", "南京");
        hm.put("李四", "北京");
        hm.put("王五", "上海");
        hm.put("赵六", "北京");
        hm.put("孙七", "深圳");
        hm.put("周八", "杭州");
        hm.put("吴九", "宁波");
        hm.put("郑十", "苏州");
        hm.put("刘一", "无锡");
        hm.put("陈二", "嘉兴");
        hm.put("aaa", "111");



        /*

        //2.利用上面的数据来获取一个不可变的集合

        //获取到所有的键值对对象(Entry对象)
        Set<Map.Entry<String, String>> entries = hm.entrySet();

        //把entries变成一个数组

        //toArray方法在底层会比较集合的长度跟数组的长度两者的大小
        //如果集合的长度 > 数组的长度 ：数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
        //如果集合的长度 <= 数组的长度：数据在数组中放的下，此时不会创建新的数组，而是直接用

        //所以直接写0,不必考虑是否需要创建新的数组
        Map.Entry[] arr = entries.toArray(new Map.Entry[0]);

        //不可变的map集合
        Map map = Map.ofEntries(arr);

        */

        //简化代码

        //Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));

        Map<String, String> map = Map.copyOf(hm);


        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }


    }
}
