package com.godea.creational.factorymethod;

public class DevFab extends HRManager {
    @Override
    public HR create() {
        return new Developer();
    }
}
