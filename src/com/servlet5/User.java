package com.servlet5;

public class User {
    private int id;
    private String name;

    public User(){};

    public User(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
