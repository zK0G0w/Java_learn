package com.java.learn._01_BasicSyntax;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/20 16:20
 */
public class Method {
    //提取一个方法，功能：两数求和
    public static int addNum(int num1, int num2){
        //求和：
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }
    public static int addNum(int num1, int num2, int num3) {
        int sum = 0;
        sum = num1 + num2 + num3;
        return sum;
    }
    public static void main(String[] args) {
        int a = addNum(10, 20);
        System.out.println(a);
        int b = addNum(11,22,33);
        System.out.println(b);
    }
}
/*
1.方法的作用：提高代码的复用性，写一次，你需要的时候直接去调用即可
2.细节：
public static 方法的修饰符
int 方法的返回值类型 -》方法的返回值对应的数据类型
addNum 见名知意
num1,num2 -》形式参数列表（形参）
10，20 -》实际参数（实参）
return sum; 方法的最后一行可以有方法的返回值
如果方法没有返回值，可以直接在方法的声明处直接使用void
3.方法的重载只和方法名，形参列表有关，与其他无关
要求：方法名必须相同，形参列表必须不同（类型不同、顺序不同、个数不同）
 */
