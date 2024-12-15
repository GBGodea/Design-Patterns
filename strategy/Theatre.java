package com.godea.behavioral.strategy;

public class Theatre {
    private String title;
    private int price;
    private int ageAppropriate;
    private int capacity;

    public Theatre(String title, int price, int ageAppropriate,int capacity) {
        this.title = title;
        this.price = price;
        this.ageAppropriate = ageAppropriate;
        this.capacity = capacity;
        AllTheatreShow.instance().pushShow(this);
    }

    public int getPrice() {
        return price;
    }

    public int getAgeAppropriate() {
        return ageAppropriate;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", ageAppropriate=" + ageAppropriate +
                ", capacity=" + capacity +
                '}';
    }
}
