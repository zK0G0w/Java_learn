package com.java.learn._02_OOP.Exception;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/26 00:13
 */
public class Test {
    public static void main(String[] args) {
        try {
            //两数求商
            int num1 = 12;
            int num2 = 0;
            System.out.println("两个数的商为:" + num1 / num2);
        } catch (Exception ex) {
            System.out.println("对不起，程序出错了");
        }

        System.out.println("上面是一个简单的异常示例");

    }
}
