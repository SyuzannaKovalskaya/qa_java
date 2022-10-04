package com.example;

import java.util.List;
public class LionAlex extends Lion {
    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

    //    getFriends() возвращает список имён его друзей — зебры Марти, бегемотихи Глории и жирафа Мелман;
//    getPlaceOfLiving() возвращает место, где он живёт — Нью-Йоркский зоопарк.
//    Также нужно переопределить метод getKittens(), потому что у Алекса нет львят.
//    А ещё — написать свой конструктор, так как в классе Lion нет дефолтного конструктора.
//    Алекс самец, поэтому в конструктор класса Lion всегда будет передаваться одно и то же значение.

}
