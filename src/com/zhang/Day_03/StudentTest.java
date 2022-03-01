package com.zhang.Day_03;

public class StudentTest {

    public static void main(String[] args) {
        Student st = new Student();
        st.setName("林冲");
        st.setAge(18);

        System.out.println(st.getName()+"是一个"+st.getAge()+"的青年人");

    }
}
