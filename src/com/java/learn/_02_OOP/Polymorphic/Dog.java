package com.java.learn._02_OOP.Polymorphic;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/25 22:17
 */
public class Dog extends Animal{
    @Override
    //喊叫：
    public void shout() {
        System.out.println("Dog-wangwang");
    }

    //看家护院：
    public void guard() {
        System.out.println("Dog-protect");
    }
}
