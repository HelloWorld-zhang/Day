package com.zhang.Day_01;

/*
 *if的语法格式
 * if(关系表达式){
 *      语法体
 * }
 *案例1：判断两个数是否相等
 * 案例2：判断一个数是否为偶数或者奇数
 */
public class ifDemo {
    public static void main(String[] args) {
     /*   int a = 10;
        int b = 20;
        if (a == b){
            System.out.println("a等于b");
        }else {
            System.out.println("a不等于b");
        }*/

        int a = 10;
        if (a%2 == 0){
            System.out.println("a：" + a + "是偶数");
        }else{
            System.out.println("a：" + a + "是奇数");
        }
    }
}
