package com.java.learn._02_OOP.Exthends;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/25 21:33
 */
public class Person {
    //父类公共的属性：
    private int age;
    private String name;
    private double height;

    public int getAge() {
        return age;
    }

    //父类公共的方法：
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //吃饭：
    public void eat() {
        System.out.println("human can eat");
    }

    //睡觉：
    public void sleep() {
        System.out.println("human can sleep");
    }

    //喊叫：
    public void shout() {
        System.out.println("human can shout");
    }

}
