package com.godea.behavioral.strategy;

public class Main {
    public static void main(String[] args) throws Exception {
        Theatre theater = new Theatre("Ведьмак", 1000, 18, 100);
        Theatre theater1 = new Theatre("Алиса в стране чудес", 700, 12, 80);
        Theatre theater2 = new Theatre("Колобок", 500, 6, 50);

        Person person1 = new Person(18, 1000);
        Person person2 = new Person(11, 200);
        Person person3 = new Person(8, 500);

        BadPerson badPerson = new BadPerson();

        TheatreStrategy strategy = new TheatreStrategy(theater, person1);
        TheatreStrategy strategy1 = new TheatreStrategy(theater1, person2);
        TheatreStrategy strategy2 = new TheatreStrategy(theater2, person3);
        TheatreStrategy strategy3 = new TheatreStrategy(theater, badPerson);


        strategy.TheatreChoiser();
        strategy1.TheatreChoiser();
        strategy2.TheatreChoiser();
        strategy3.TheatreChoiser();
    }
}
