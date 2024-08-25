package com.java.learn._02_OOP.Encapsulation;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/25 20:42
 */
public class Person {
    private int age;
    private String name;
    private double height;

    public int getAge() {
        return age;
    }

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
}
