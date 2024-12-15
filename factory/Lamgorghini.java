package com.godea.creational.factory;

public class Lamgorghini extends Car {
    int amountOfWheels;
    String color;

    public Lamgorghini(int amountOfWheels, String color) {
        this.amountOfWheels = amountOfWheels;
        this.color = color;
    }

    @Override
    public void createEngine() {
        System.out.println("Creating v16....");
    }

    @Override
    public void createCase() {
        System.out.println("Creating body with color: " + color +"...");
    }

    @Override
    public void creatWheels() {
        System.out.println("Creating " + amountOfWheels + " wheels...");
    }

    @Override
    public void readyToUse() {
        System.out.printf("Your Lamgorghini is ready to use with color: %s and %s wheels\n", color, amountOfWheels);
    }
}
