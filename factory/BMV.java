package com.godea.creational.factory;

public class BMV extends Car {
    int amountOfWheels;
    String color;

    public BMV(int amountOfWheels, String color) {
        this.amountOfWheels = amountOfWheels;
        this.color = color;
    }

    @Override
    public void createEngine() {
        System.out.println("Creating v12....");
    }

    @Override
    public void createCase() {
        System.out.println("Creating body of BMW with color: " + color +"...");
    }

    @Override
    public void creatWheels() {
        System.out.println("Creating " + amountOfWheels + " wheels...");
    }

    @Override
    public void readyToUse() {
        System.out.printf("Your BMW is ready to use with color: %s and %s wheels\n", color, amountOfWheels);
    }
}
