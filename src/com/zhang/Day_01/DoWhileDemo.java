package com.zhang.Day_01;
/*
 * do...while循环语句的格式：
 * 		do {
 * 			循环体语句;
 * 		}while(判断条件语句);
 *
 * 完整格式：
 * 		初始化语句;
 * 		do {
 * 			循环体语句;
 * 			控制条件语句;
 * 		}while(判断条件语句);
 *
 * 执行流程：
 * 		A:执行初始化语句
 * 		B:执行循环体语句
 * 		C:执行控制条件语句
 * 		D:执行判断条件语句，看是true还是false
 * 			如果是false，就结束循环
 * 			如果是true，就回到B继续
 *
 * 练习：求和案例，水仙花案例
 */

public class DoWhileDemo {
    public static void main(String[] args) {
        //水仙花

        int i = 100;
        do {
            int ge =  i%10;
            int shi = i/10%10;
            int bai = i/100%10;
            if ((ge*ge*ge + shi*shi*shi + bai*bai*bai) == i){
                System.out.print("水仙花数为："+ i);
            }
            i++;
        }while (i <= 1000);
    }
}
