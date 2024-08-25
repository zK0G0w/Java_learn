package com.java.learn._02_OOP.Encapsulation;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/24 15:57
 */
public class Girl {
    private int age;
    //给age提供一个赋值方法：
    public void setAge(int age) {
        if (age > 18) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    //给age提供一个读取值的方法：
    public int getAge() {
        return age;
    }
}
