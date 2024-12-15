package com.godea.behavioral.memento;

public class CarMemento {
    private int kilometers = 0;
    private int speed = 0;
//    CarHistory carHistory;

    public CarMemento(int kilometers, int speed) {
        this.kilometers = kilometers;
        this.speed = speed;
        CarHistory.getInstance().push(this);
    }

    public int getKilometers() {
        return kilometers;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "CarMemento{" +
                "kilometers=" + kilometers +
                ", speed=" + speed +
                '}';
    }
}
