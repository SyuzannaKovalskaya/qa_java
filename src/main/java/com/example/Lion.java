package com.example;

import java.util.List;

public class Lion {
    //Класс Lion не должен зависеть от класса Feline. Используй принцип инъекции зависимостей.
    boolean hasMane;
    private Predator predator;


    public Lion(String sex, Feline feline) throws Exception {
        this.predator = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return predator.getChildren();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
