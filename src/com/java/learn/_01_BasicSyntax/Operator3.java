package com.java.learn._01_BasicSyntax;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/20 15:07
 */
public class Operator3 {
    public static void main(String[] args) {
        //关系运算符 ==
        System.out.println(5 == 6);//false
        System.out.println(5 == 5);//ture
        System.out.println();

        //逻辑运算符：逻辑运算符左右连接的为布尔值
        //&&逻辑：如果两个操作数都为true，那么结果为true，否则为false
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println();
        //||逻辑：如果两个操作数都为false，那么结果为false，否则为true
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(false || true);

    }
}
