package com.java.learn._01_BasicSyntax;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/21 22:11
 */
public class Array {
    public static void main(String[] args) {
        //数组声明：以int类型为例：
        //int[] arr;//定义一个int类型的数组，名字是arr

        //数组的创建：
        //arr = new int[4];//在创建时要给定数组的长度，创建一个长度为4的int类型的数组
        int[] arr = new int[4];//合成这一句，底层默认长度为4的空间中，每个元素有默认值0

        for (int j : arr) {
            System.out.println(j);
        }
        System.out.println();

        //数组的赋值操作：
        arr[0] = 15;
        arr[1] = 91;
        arr[2] = 11;
        arr[3] = 12;

        //数组的遍历：
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
