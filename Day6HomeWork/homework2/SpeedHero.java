package com.talent.java.talent_java_homework.Day6HomeWork.homework2;

public class SpeedHero extends Superhero {


    public SpeedHero(String heroName, int powerLevel) {
        super(heroName, powerLevel);
    }

    @Override
    void usePower() {
        System.out.println("I am " + getHeroName() + ". I move faster than lightning!");
    }
}
