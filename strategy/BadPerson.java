package com.godea.behavioral.strategy;

public class BadPerson implements IPerson {
    @Override
    public BadPerson getPerson() {
        System.out.println("Слышна бранная речь, таких нельзя пускать");
        return this;
    }
}
