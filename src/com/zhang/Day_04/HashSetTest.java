package com.zhang.Day_04;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<Student> stu = new HashSet<>();
        //创建元素对象
        Student st1 = new Student("张飞", 18);
        Student st2 = new Student("刘备", 22);
        Student st3 = new Student("关羽", 20);

        stu.add(st1);
        stu.add(st2);
        stu.add(st3);

        //不同遍历
        for (Student s:stu) {
            System.out.println(s.getName()+"----"+s.getAge());
        }
        System.out.println("---------------------------------");

        Iterator<Student> ite = stu.iterator();
        while (ite.hasNext()){
            Student next = ite.next();
            System.out.println(next.getAge()+"---"+next.getName());
        }

    }
}
