package com.godea.behavioral.memento;

public class Car {
    private int kilometers = 0;
    private int speed = 0;

    public void ride(int hours, int speed) {
        this.speed = speed;
        int result = 0;
        result = hours * speed;
        this.kilometers += result;
    }

    public CarMemento saveState() {
        System.out.println("Сохранение...");
        return new CarMemento(kilometers, speed);
    }

    public void getHistory() {
        for(int i = 0; i < CarHistory.getInstance().getElements().size(); i++) {
            System.out.println(CarHistory.getInstance().getElements().get(i));
        }
    }

    public int getKilometers() {
        return kilometers;
    }

    public int getSpeed() {
        return speed;
    }
}
