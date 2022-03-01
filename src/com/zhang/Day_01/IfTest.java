package com.zhang.Day_01;

import java.util.Scanner;

/**
 * 通过键盘输入判断比较连个数据值大小
 */
public class IfTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int b = scanner.nextInt();
         int max;
         if (a > b){
             max = a;
         }else {
             max = b;
         }
        System.out.println("最大值为：" + max);
    }
}
