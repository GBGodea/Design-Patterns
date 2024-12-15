package com.godea.creational.factorymethod;

public abstract class HRManager {
    public abstract HR create();
    public void createFactMethod() {
        HR hr = create();
        hr.askQuestion();
    }

}
