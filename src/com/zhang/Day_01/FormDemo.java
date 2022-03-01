package com.zhang.Day_01;

/**
 * for循环语句的格式：
 *  	for(初始化语句;判断条件语句;控制条件语句) {
 *  		循环体语句;
 *  	}
 */
public class FormDemo {

    public static void main(String[] args) {
        //打印出5条数据

        /*for (int i = 1; i <= 5; i++ ){
            System.out.println("hello world hello java");
        }
        System.out.println("----------------------");*/

        //需求：获取数据1-5和5-1
        /*for (int i = 1; i <= 5; i++){
            System.out.print(i + ",");
        }
        for (int i = 5; i >= 1 ; i--) {
            System.out.print(i + ",");
        }*/

        //需求：求出1-5之间数据之和

        int sum = 0;

        for (int i = 1; i <= 5; i++){
            sum += i;
        }
        System.out.println(sum);
    }

}
