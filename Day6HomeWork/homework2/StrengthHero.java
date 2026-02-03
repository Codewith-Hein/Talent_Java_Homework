package com.talent.java.talent_java_homework.Day6HomeWork.homework2;

public class StrengthHero extends Superhero {


    public StrengthHero(String heroName, int powerLevel) {
        super(heroName, powerLevel);
    }

    @Override
    void usePower() {
        System.out.println("I am " + getHeroName() + ". My strength is unstoppable when I smash!");


    }
}
