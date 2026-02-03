package com.talent.java.talent_java_homework.Day6HomeWork.homework2;

public class SuperHeroBanner {

    public static void main(String[] args) {
        Superhero[] superheroes = new Superhero[3];

        superheroes[0] = new FlyingHero("Superman", 50);
        superheroes[1] = new StrengthHero("Hulk", 10);
        superheroes[2] = new SpeedHero("Flash", 20);

        for (Superhero hero : superheroes) {
            hero.usePower();
            hero.powerBoost();
        }
    }
}
