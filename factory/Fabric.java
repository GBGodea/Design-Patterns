package com.godea.creational.factory;

public class Fabric {
    public Car createCar(Car car) {
        if(car.getClass().equals(Lamgorghini.class)) {
            return new Lamgorghini(4, "Orange");
        }

        if(car.getClass().equals(BMV.class)) {
            return new BMV(4, "Blue");
        }

        return null;
    }
}
