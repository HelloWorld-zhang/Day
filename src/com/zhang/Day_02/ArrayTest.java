package com.zhang.Day_02;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        //键盘输入
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("请输入第"+(i + 1)+"个评委给出的分数");
            int score = sc.nextInt();
            arr[i] = score;
        }
        //最大值
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        //最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }

        int avg = (sum - max - min) / (arr.length -2);
        System.out.println("选手的最终得分是："+ avg);
    }
}
