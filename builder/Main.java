package com.godea.creational.builder;

import com.godea.creational.builder.exceptions.BigTemeratureException;
import com.godea.creational.builder.exceptions.NotARightVolume;

public class Main {
    public static void main(String[] args) throws BigTemeratureException, NotARightVolume {
//        Coffee.CoffeeBuilder builder = new Coffee.CoffeeBuilder();
        try {
            Coffee latte = new Coffee.CoffeeBuilder()
                    .addCoffeeName("Latte")
                    .addVolume(1000)
                    .addTempretature(50)
                    .addMillOfMilk(150)
                    .addGramsOfCoffee(20)
                    .build();

            Coffee espresso = new Coffee.CoffeeBuilder().addCoffeeName("ESPRESSO").build();
            Coffee capuchino = new Coffee.CoffeeBuilder().addCoffeeName("CAPPUCHINO").build();

            System.out.println(latte);
            System.out.println(espresso);
            System.out.println(capuchino);
        } catch(BigTemeratureException e) {
            throw new BigTemeratureException(e.getMessage());
        } catch(NotARightVolume e) {
            throw new NotARightVolume(e.getMessage());
        }
    }
}
