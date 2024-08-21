package com.java.learn._01_BasicSyntax;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/20 15:59
 */
public class For {
    public static void main(String[] args) {
        //功能：求和 1+2+3+4+5；

        int sum = 0;
        for (int num = 1; num <= 5; num++) {
            sum += num;
        }
        System.out.println("和为：" + sum);
    }
}
