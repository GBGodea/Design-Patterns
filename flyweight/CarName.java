package com.godea.structural.flyweight;

public class CarName implements Car {
    private String nameOfCar;

    public CarName(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    @Override
    public void createCar(CarContext context) {
        System.out.println("Creating " + nameOfCar + " with price: " + context.getPrice());
    }
}
