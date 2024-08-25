package com.java.learn._02_OOP.Polymorphic;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/25 22:07
 */
public class Girl {
//    //与猫一起玩：
//    public void play(Cat cat) {
//        cat.shout();
//    }
//
//    //与狗一起玩：
//    public void play(Dog dog) {
//        dog.shout();
//    }
    //与动物玩：
    public void play(Animal animal) {
        animal.shout();
    }
}
