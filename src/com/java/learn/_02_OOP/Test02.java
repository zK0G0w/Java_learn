package com.java.learn._02_OOP;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/24 15:02
 */
public class Test02 {
    public static void main(String[] args) {
        /**
         *创建一个Person类的对象
         * new Person();
         * Person() -> 空的构造方法
         * new 关键字对方法进行调用 -> 构造器作用：底层帮我们创建对象（底层的工作），在创建对象以后进行初始化操作（构造器的工作）
         *
         * 如果一个类没有显式编写构造器的话，系统会为这个类默认分配一个空构造器
         * 如果有构造器，就不会再默认分配一个空构造器了，所以尽量保证空构造器的存在，有些框架底层需要空构造器
         * 调用构造器以后，对对象进行初始化操作，将对象的地址返回给p
         */
        Person p  = new Person();
        p.age = 18;
        p.name = "zw";
        p.height = 180.5;
        System.out.println(p.age + p.name + p.height);

        Person p2 = new Person(18,"fyc",181);
    }
}
