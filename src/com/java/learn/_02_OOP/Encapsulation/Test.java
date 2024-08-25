package com.java.learn._02_OOP.Encapsulation;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/24 15:57
 */
public class Test {
    public static void main(String[] args) {
        //创建对象:
        Girl g = new Girl();
        g.setAge(99);
        System.out.println(g.getAge());

        Person p = new Person();
        p.setAge(18);
        p.setName("zengwen");
        p.setHeight(170.1);
        System.out.println(p.getName() + p.getAge() + p.getHeight());
    }
}
