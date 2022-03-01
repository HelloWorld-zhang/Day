package com.zhang.Day_01;

import java.util.Scanner;

/**
 * switch语法格式
 * switch(表达式){
 *     case 值1：
 *          语法体 1：
 *          break；
 *     case 值2：
 *          语法体 2：
 *          break；
 *      case 值3：
 *          语法体 3：
 *          break；
 * }
 */
public class SwitchDemo {
    public static void main(String[] args) {
        // 创建键盘录入数据
        Scanner sc = new Scanner(System.in);

        // 给出提示
        System.out.println("请输入一个整数(1-7)：");
        int weekDay = sc.nextInt();

        // 用switch语句实现判断
        switch (weekDay) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数据有误");
                break;
        }
    }

}
