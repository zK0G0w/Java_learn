package com.java.learn._01_BasicSyntax;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/18 16:42
 */
public class Operator {
    public static void main(String[] args) {
        //1.算术运算符
        //+ 作用：1）表示正数   2）表示相加  3）字符串拼接
        System.out.println(+10);
        System.out.println(5 + 6);
        int num = 5;
        System.out.println("输出" + num);
        System.out.println(5 + 6 + "abc");// 11abc
        System.out.println("abc" + 5 + 6);// abc56
        //只要+左右两侧任意一侧是字符串，则结果也为字符串

        //++自增：
        int a = 5;
        a++;
        System.out.println(a);
        a = 5;
        ++a;
        System.out.println(a);

        //如果自增参与到表达式中：
        a = 5;
        int m = a++ + 7;//如果++在后，先运算，后加1
        System.out.println(a);//6
        System.out.println(m);//12

        a = 5;
        int n = ++a + 7;//先加1，后运算
        System.out.println(a);//5
        System.out.println(n);//12

    }
}
