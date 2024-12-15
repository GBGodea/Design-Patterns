package com.godea.creational.builder;

import com.godea.creational.builder.exceptions.BigTemeratureException;
import com.godea.creational.builder.exceptions.NotARightVolume;

public class Coffee {
    private int volume;
    private int gramsOfCoffee;
    private int millOfMilk;
    private int grSugar;
    private int tempretature;
    private String coffeeName;

    public Coffee(CoffeeBuilder builder) {
        volume = builder.volume;
        gramsOfCoffee = builder.gramsOfCoffee;
        millOfMilk = builder.millOfMilk;
        grSugar = builder.grSugar;
        tempretature = builder.tempretature;
        coffeeName = builder.coffeeName;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "volume=" + volume +
                ", gramsOfCoffee=" + gramsOfCoffee +
                ", millOfMilk=" + millOfMilk +
                ", grSugar=" + grSugar +
                ", tempretature=" + tempretature +
                ", coffeeName='" + coffeeName + '\'' +
                '}';
    }

    public static class CoffeeBuilder {
        private int volume;
        private int gramsOfCoffee;
        private int millOfMilk;
        private int grSugar;
        private int tempretature;
        private String coffeeName;

        public CoffeeBuilder addVolume(int volume) throws NotARightVolume {
            if (volume < 100 || volume > 1000 ) {
                throw new NotARightVolume("Volume of coffee is not right, choose under 100 and 1000");
            }
            this.volume = volume;
            return this;
        }

        public CoffeeBuilder addGramsOfCoffee(int gramsOfCoffee) {
            this.gramsOfCoffee = gramsOfCoffee;
            return this;
        }

        public CoffeeBuilder addMillOfMilk(int millOfMilk) {
            this.millOfMilk = millOfMilk;
            return this;
        }

        public CoffeeBuilder addGrSugar(int grSugar) {
            this.grSugar = grSugar;
            return this;
        }

        public CoffeeBuilder addTempretature(int tempretature) throws BigTemeratureException {
            if(tempretature > 120) {
                throw new BigTemeratureException("Temreature is bigger then 120");
            }

            if(tempretature < 50) {
                throw new BigTemeratureException("Temreature is less then 50");
            }

            this.tempretature = tempretature;
            return this;
        }

        public CoffeeBuilder addCoffeeName(String coffeeName) throws BigTemeratureException, NotARightVolume {
            switch(coffeeName) {
                case "LATTE":
                    addGramsOfCoffee(10).addCoffeeName("Latte").addGrSugar(10).addTempretature(90).addMillOfMilk(100).addVolume(250);
                    return this;

                case "ESPRESSO":
                    addVolume(150).addCoffeeName("Espresso").addTempretature(100).addGramsOfCoffee(50);
                    return this;

                case "AMERICANO":
                    addVolume(200).addTempretature(100).addGramsOfCoffee(30).addGramsOfCoffee(40).addCoffeeName("Americano");

                case "CAPPUCHINO":
                    addVolume(350).addCoffeeName("Capuchino").addGramsOfCoffee(20).addTempretature(110).addMillOfMilk(80);
            }
            this.coffeeName = coffeeName;
            return this;
        }

        public Coffee build() {
            return new Coffee(this);
        }
    }
}
