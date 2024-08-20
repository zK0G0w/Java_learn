package com.java.learn._01_BasicSyntax;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/20 09:42
 */
public class Operator2 {
    public static void main(String[] args) {
        //赋值运算符 =
        int num1 = 10;
        int num2 = 20;
        int num3 = 10 + 30;

        //求和：
        int sum = 0;
        sum += num1;//sum = sum + num1;
        sum += num2;//sum = sum + num2;
        sum += num3;//sum = sum + num3;

        System.out.println("和为" + sum);

    }
}
