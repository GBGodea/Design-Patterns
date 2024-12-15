package com.godea.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        HRManager devHr = new DevFab();
        devHr.createFactMethod();

        HRManager pmHr = new PMFab();
        pmHr.createFactMethod();
    }
}
