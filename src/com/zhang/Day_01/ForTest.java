package com.zhang.Day_01;

/**
 * 需求：求出1-100之间偶数和
 * 需求：在控制台输出所有的”水仙花数”
 */
public class ForTest {
    public static void main(String[] args) {

//        int sum  = 0;
//        for (int i = 1; i <= 100; i++){
//            if (i%2 == 0){
//                sum += i;
//            }
//        }
//        System.out.println("偶数之和："+sum);
        for (int i = 100; i <= 1000; i++){
            int ge =  i%10;
            int shi = i/10%10;
            int bai = i/10/10%10;
            if ((ge*ge*ge + shi*shi*shi + bai*bai*bai) == i){
                System.out.print("水仙花数为："+ i);
            }
        }

    }
}
