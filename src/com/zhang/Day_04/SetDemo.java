package com.zhang.Day_04;

import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("hello");
        st.add("world");
        st.add("java");
        st.add("world");
        for (String s : st) {
            System.out.println(s);
        }
    }
}
