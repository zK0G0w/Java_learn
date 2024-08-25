package com.java.learn._02_OOP.Exthends;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/25 21:39
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setsId(10081);
        s.setName("wain");
        s.setAge(18);
        s.setHeight(171.1);
        s.sleep();
        s.eat();
        s.study();
        s.shout();
    }
}
