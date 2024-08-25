package com.java.learn._02_OOP.Polymorphic;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/25 22:08
 */
public class Test {
    public static void main(String[] args) {
        //创建女孩的实例、对象：
        Girl g = new Girl();

        //创建猫的实例、对象：
//        Cat c = new Cat();

        //创建狗的实例、对象：
//        Dog d = new Dog();

        //女孩玩小猫：
//        g.play(c);

        //女孩玩小狗：
//        g.play(d);
        //女孩玩动物：
        Animal animal;
        Cat c = new Cat();
        animal = c;
        g.play(animal);

        Animal animal1 = new Dog();
        g.play(animal1);

        Animal animal2 = new Pig();
        g.play(animal2);
    }

}
