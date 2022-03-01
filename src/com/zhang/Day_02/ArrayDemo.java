package com.zhang.Day_02;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            max = arr[i];
        }
        System.out.println("数组的最大值为："+max);


    }
}
