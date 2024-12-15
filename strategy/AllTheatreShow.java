package com.godea.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class AllTheatreShow {
    private final List<Theatre> listOfTheatresShow = new ArrayList<>();
    private static AllTheatreShow allTheatreShow;

    private AllTheatreShow() {};

    public static AllTheatreShow instance() {
        if(allTheatreShow == null) {
            allTheatreShow = new AllTheatreShow();
        }
        return allTheatreShow;
    }

    public void pushShow(Theatre theatre) {
        listOfTheatresShow.add(theatre);
    }

    public void getAllShows(int age, int money) {
        System.out.println("Предлагаем такие шоу:");
        for(int i = 0; i < listOfTheatresShow.size(); i++) {
            if(listOfTheatresShow.get(i).getPrice() <= money && listOfTheatresShow.get(i).getAgeAppropriate() <= age) {
                System.out.println(listOfTheatresShow.get(i));
            }
        }
    }
}
