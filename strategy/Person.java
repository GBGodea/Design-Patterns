package com.godea.behavioral.strategy;

public class Person implements IPerson {
    private int age;
    private int money;

    public Person(int age, int money) {
        this.age = age;
        this.money = money;
    }

    @Override
    public Person getPerson() {
        return this;
    }

    public int getAge() {
        return age;
    }

    public int getMoney() {
        return money;
    }
}
