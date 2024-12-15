package com.godea.creational.factory;

public class Main {
    public static void main(String[] args) {
        Car lamboFabric = new Fabric().createCar(new Lamgorghini(4, "orange"));
        Car bmwFabric = new Fabric().createCar(new BMV(4, "blue"));
        lamboFabric.readyToUse();
        bmwFabric.readyToUse();
    }
}
