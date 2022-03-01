package com.zhang.Day_01;
/*
 * 需求：请输出一个4行5列的星星(*)图案。
 * 结果：
 * 		*****
 * 		*****
 * 		*****
 * 		*****
 *
 * 循环嵌套：就是循环体语句本身是一个循环语句。
 *
 * 结论：
 * 		外循环控制的是行，内循环控制的是列
 */

public class ForForDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
