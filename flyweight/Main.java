package com.godea.structural.flyweight;

public class Main {
    public static void main(String[] args) {
       CarFactory factory = new CarFactory();

       Car Lamborghini = factory.getCar("Lamborghini");
        Lamborghini.createCar(new CarContext(100_000));

       Car BMV = factory.getCar("BMV");
       BMV.createCar(new CarContext(70_000));

       Car LamborghiniUrus = factory.getCar("Lamborghini");
       LamborghiniUrus.createCar(new CarContext(150_000));
    }
}
