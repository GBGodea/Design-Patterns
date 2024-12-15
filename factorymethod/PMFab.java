package com.godea.creational.factorymethod;

public class PMFab extends HRManager {
    @Override
    public HR create() {
        return new PM();
    }
}
