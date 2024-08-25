package com.java.learn._02_OOP.Exthends;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/25 21:36
 */
public class Student extends Person{//子类Student继承父类Person
    //定义子类拓展的属性：
    private int sId;

    //定义子类拓展的方法：

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    //学习：
    public void study() {
        System.out.println("student can study");
    }
}
