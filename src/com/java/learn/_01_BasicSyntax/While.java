package com.java.learn._01_BasicSyntax;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/20 15:25
 */
public class While {
    public static void main(String[] args) {
        //功能：求和1+2+3+4+5
       int num = 1;
       int sum = 0;

       while (num <= 5){
           sum += num;
           num++;
       }

        System.out.println("和为：" + sum);
    }
}
