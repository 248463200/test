package com.template;

public class Teacher  extends PersonTemplate{

    @Override
    public void do1() {
        System.out.println("开门");
    }

    @Override
    public void do2() {
        System.out.println("开媒体");
    }

    @Override
    public void do3() {
        System.out.println("上课");
    }
}
