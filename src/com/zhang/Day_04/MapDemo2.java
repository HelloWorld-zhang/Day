package com.zhang.Day_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("001","刘备");
        hm.put("002","关羽");
        hm.put("003","张飞");

        //获取所有的键值对对象的集合
        Set<Map.Entry<String, String>> set = hm.entrySet();
        for (Map.Entry<String ,String> me: set) {
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "--" + value);
        }
    }
}
