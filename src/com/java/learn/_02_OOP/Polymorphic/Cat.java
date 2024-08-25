package com.java.learn._02_OOP.Polymorphic;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/25 22:04
 */
public class Cat extends Animal{
    @Override
    //喊叫：
    public void shout() {//子类对父类Animal提供的方法不满意，重写了
        System.out.println("Cat-miaomiao");
    }

    //挠人：
    public void scratch() {
        System.out.println("Cat-scratch human");
    }
}
