package com.java.learn._01_BasicSyntax;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/8/20 15:16
 */
public class If {
    public static void main(String[] args) {
        //需求：判断成绩等级
        int score = 59;
        if (score > 90) {//if后面是表达式，结果为布尔值，为true时，才会进入后面的{}
            System.out.println("优秀");
        } else if (score > 60){//隐藏条件：score <= 90
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
