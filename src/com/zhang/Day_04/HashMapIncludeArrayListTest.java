package com.zhang.Day_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapIncludeArrayListTest {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm  = new HashMap<>();
        //创建元素1
        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("诸葛亮");
        sgyy.add("赵云");
        //把元素添加到hm中
        hm.put("三国演义", sgyy);

        //创建元素2
        ArrayList<String> xyj = new ArrayList<String>();
        xyj.add("唐僧");
        xyj.add("孙悟空");
        //把元素添加到hm中
        hm.put("西游记", xyj);

        //创建元素3
        ArrayList<String> shz = new ArrayList<String>();
        shz.add("武松");
        shz.add("鲁智深");
        //把元素添加到hm中
        hm.put("水浒传", shz);

        Set<String> set = hm.keySet();
        for (String key: set) {
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for (String s: value) {
                System.out.println("\t"+s);
            }

        }

    }
}
