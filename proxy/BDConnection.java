package com.godea.structural.proxy;

import java.util.SortedSet;

public class BDConnection implements BD {
    @Override
    public void connect(String host) throws InterruptedException {
        System.out.println("Connecting...");
        Thread.sleep(2000);
        System.out.println("Connected to: " + host);
    }
}