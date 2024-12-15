package com.godea.structural.proxy;

public class BDConnectionProxy implements BD, Runnable {
    BDConnection oldBd = new BDConnection();
    String host;

    public BDConnectionProxy(String host) {
        this.host = host;
    }

    @Override
    public void connect(String host) throws InterruptedException {
        oldBd.connect(host);
    }

    @Override
    public void run() {
        try {
            connect(host);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
