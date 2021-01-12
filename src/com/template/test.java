package com.template;

public class test {
    public static void main(String[] args) {
        new Thread(()->{
            PersonTemplate student = new Student();
            student.doTemplate();
        }).start();
        new Thread(()->{
            PersonTemplate teacher = new Teacher();
            teacher.doTemplate();
        }).start();

    }
}
