package com.java.learn._01_BasicSyntax;

/**
 * @Description: 变量
 * @Author: WainZeng
 * @Date: 2024/8/13 16:09
 */
public class Variable {
    public static void main(String[] args) {
        //1.变量的声明（定义）
         int age;//定义一个变量，名字（标识符）叫age，类型为int类型
        //变量不可以重复定义
        //同时可以定义多个变量
        //int a,b;

        //2. 变量的赋值
        age = 18;//等号进行赋值操作
        age = 32;
        age = 40 + 18;

        //变量的定义和赋值可以同时进行
         //int age1 = 55;
         //int c = 10,d = 20;
        // int e,f = 30;//e没有赋值，f赋值为30

        //3. 变量的使用
        System.out.println(age);//使用变量时，通过变量名字访问到空间中具体的值
        System.out.println(age + 10);
        int g = 20;
        System.out.println(age + g);
    }
}
