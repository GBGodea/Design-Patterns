package com.godea.behavioral.strategy;

public class TheatreStrategy {
    private Theatre theatre;
    private IPerson person;

    public TheatreStrategy(Theatre theatre, IPerson person) {
        this.theatre = theatre;
        this.person = person;
    }

    private int initialCapacity = 0;
    public void TheatreChoiser() {
        if(person.getClass() == BadPerson.class) {
            System.err.println("Bad Person");
        } else {
            if(((Person) person).getAge() < theatre.getAgeAppropriate() || ((Person) person).getMoney() < theatre.getPrice() || initialCapacity > theatre.getCapacity()) {
                AllTheatreShow.instance().getAllShows(((Person) person).getAge(), ((Person) person).getMoney());
            } else {
                System.out.println("Билет продан");
            }
        }
    }
}
