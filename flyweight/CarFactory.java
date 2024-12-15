package com.godea.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private final Map<String, Car> cars = new HashMap<>();

    public Car getCar(String name) {
        Car car = cars.get(name);

        if(car == null) {
            car = new CarName(name);
            cars.put(name, car);
        }
        return car;
    }
}
