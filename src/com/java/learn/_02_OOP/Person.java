package com.java.learn._02_OOP;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/22 10:04
 */

/**
 * 人类
 */
public class Person {
    //特性-属性-动词（只定义和业务逻辑相关的代码）
    String name;//姓名
    int age;//年龄
    double height;//身高

    //行为-方法-名词（只定义和业务逻辑相关的代码）
    //定义一个学习的方法；
    public void study(){
        System.out.println(this.name + "正在学习");
    }

    //显式编写空构造器：
    public Person(){
        System.out.println("调用了空构造器");
    }


    //有参构造器
    public Person(int age, String name, double height){
        this.age = age;
        this.name = name;
        this.height = height;
        System.out.println(this.age + this.name + this.height);
    }
}
