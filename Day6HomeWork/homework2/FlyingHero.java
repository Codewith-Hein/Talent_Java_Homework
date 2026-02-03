package com.talent.java.talent_java_homework.Day6HomeWork.homework2;

public class FlyingHero extends Superhero {


    public FlyingHero(String heroName, int powerLevel) {
        super(heroName, powerLevel);
    }

    @Override
    void usePower() {
        System.out.println("I am "+getHeroName() +". I can fly across the sky to save the world!");


    }
}
