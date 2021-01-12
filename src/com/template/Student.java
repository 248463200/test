package com.template;

public class Student  extends PersonTemplate{

    @Override
    public void do1() {
        System.out.println("开门");
    }

    @Override
    public void do2() {
        System.out.println("拿书");
    }

    @Override
    public void do3() {
        System.out.println("上课");
    }
}
