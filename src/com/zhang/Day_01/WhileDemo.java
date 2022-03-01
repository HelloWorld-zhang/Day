package com.zhang.Day_01;
/*
 * while循环的语句格式：
 * 		while(判断条件语句) {
 * 			循环体语句;
 * 		}
 *
 * 完整格式：
 * 		初始化语句;
 * 		while(判断条件语句) {
 * 			循环体语句;
 * 			控制条件语句;
 * 		}
 *
 * 回顾for循环的语句格式：
 * 		for(初始化语句;判断条件语句;控制条件语句) {
 * 			循环体语句;
 * 		}
 */

public class WhileDemo {
    public static void main(String[] args) {
        //求出1-100之间的和
        int sum = 0;
        int i = 1;
        while (i <= 100){
            sum +=i;
            i++;
        }
        System.out.println("1-100之间的和为："+ sum);
    }
}
