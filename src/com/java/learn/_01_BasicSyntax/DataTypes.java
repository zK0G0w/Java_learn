package com.java.learn._01_BasicSyntax;

/**
 * @Description: zkogow.cn312
 *
 * @Author: WainZeng
 * @Date: 2024/8/13 16:33
 */
public class DataTypes {
    public static void main(String[] args) {
        //基本数据类型：
        //1.整数类型
        byte a = 10;//表数范围：-128~127
        short b = 20;//表数范围：正负三万
        int c = 30;//表数范围：正负21亿
        long d = 4300000000L;//表数范围：很大很大，如果表示数的范围超过了int类型的范围要加L

        //2.浮点类型：
        float e = 3.14F;//如果用float类型表示小数，后面一定要加F或f
        double f = 3.14;//double适合表示精度高的小数

        //3.字符型：
        char g = 'a';//单引号引起来的单个字符

        //4.布尔类型：
        boolean flag = true;//布尔值只要true或false
    }
}
