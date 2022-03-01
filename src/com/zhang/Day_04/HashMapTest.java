package com.zhang.Day_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        map.put("001",new Student("张飞",10));
        map.put("002",new Student("关羽",20));
        map.put("003",new Student("刘备",30));

        // 遍历
        // 根据键找值

        Set<String> set1 = map.keySet();
        for (String key: set1) {
            Student student = map.get(key);
            System.out.println(key+"--"+ student.getName()+"--"+ student.getAge());
        }
        // 根据键值对对象找键和值
        Set<Map.Entry<String, Student>> set = map.entrySet();
        for (Map.Entry<String, Student> me: set) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+"---"+value.getName()+":"+value.getAge());
        }
    }
}
