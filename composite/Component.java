package com.godea.structural.composite;

public class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void add(Component component) {};
    public void remove(Component component) {};
    public void print() {};
}
