package com.godea.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.ride(1, 60);
        car.ride(1, 60);
        car.saveState();
        car.ride(1, 60);
        car.saveState();
        car.ride(3, 120);
        car.saveState();
        car.getHistory();
//        System.out.println(car.getKilometers());
//        System.out.println(car.getSpeed());
    }
}
