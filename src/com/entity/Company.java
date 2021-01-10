package com.entity;

public class Company {
    private String name ;
    private String people;

    public Company(){};

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", people='" + people + '\'' +
                '}';
    }

    public Company(String name , String people){
        this.name= name;
        this.people=people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }
}
