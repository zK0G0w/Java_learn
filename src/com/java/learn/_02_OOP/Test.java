package com.java.learn._02_OOP;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/22 10:10
 */

/**
 * 测试类
 */
public class Test {
    //程序入口
    public static void main(String[] args) {
        //对Person类的对象进行创建，创建了一个Person对象，名字叫p1
        Person p1 = new Person();
        p1.name = "zengwen";
        p1.age = 30;
        p1.height = 170.1;
        //读取属性
        System.out.println(p1.age);
        System.out.println(p1.name);
        //调用方法
        p1.study();
    }
}
