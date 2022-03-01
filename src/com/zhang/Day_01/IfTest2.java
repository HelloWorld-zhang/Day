package com.zhang.Day_01;
/*
 * 键盘录入学生考试成绩，请根据成绩判断该学生属于哪个级别
 * 90-100	优秀
 * 80-90	好
 * 70-80	良
 * 60-70	及格
 * 60以下	不及格
 *
 * 分析：
 * A:键盘录入学生考试成绩,想到键盘录入数据的步骤
 * B:通过简单的分析，我们知道了该使用if语句的格式3进行判断
 * 		根据判断直接输出对应的级别
 *
 * 写程序的时候，做数据测试，应该测试这样的几种情况：
 * 		正确数据
 * 		边界数据
 * 		错误数据
 */

import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args) {
        System.out.println("请输入学生成绩：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (0<=score || score <=100){
            if (90 <= score && score <= 100 ){
                System.out.println("优秀");
            } if (80 <= score && score < 90){
                System.out.println("好");
            } if (70 <= score && score < 80){
                System.out.println("良");
            } if (60 <= score && score < 70){
                System.out.println("及格");
            }if ((0 <= score && score < 60)){
                System.out.println("不及格");
            }
        }else {
            System.out.println("请输入有效成绩");
        }

    }
}
