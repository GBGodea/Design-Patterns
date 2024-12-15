package com.godea.structural.proxy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BD bd = new BDConnectionProxy("127.0.0.1");
        Thread thread = new Thread((BDConnectionProxy) bd);
        thread.start();

        System.out.println("Doing some Job");
    }
}
