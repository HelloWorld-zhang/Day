package com.zhang.Day_04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("001","刘备");
        hm.put("002","关羽");
        hm.put("003","张飞");
        Set<String> st = hm.keySet();
        for (String s: st) {
            String values = hm.get(s);
            System.out.println(s +"---"+values);
        }

        Collection<String> values = hm.values();
        for (String t: values) {
            System.out.println(t);
        }
    }
}
