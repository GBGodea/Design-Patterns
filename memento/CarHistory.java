package com.godea.behavioral.memento;

import java.util.LinkedList;
import java.util.List;

public class CarHistory {
    private LinkedList<CarMemento> history = new LinkedList<CarMemento>();
    private static CarHistory carHistory;

    private CarHistory() {}

    public void push(CarMemento carMemento) {
        history.add(carMemento);
    }

    public static CarHistory getInstance() {
        if(carHistory == null) {
            carHistory = new CarHistory();
        }
        return carHistory;
    }

    public List<CarMemento> getElements() {
        return history;
    }
}
