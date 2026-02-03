package com.talent.java.talent_java_homework.Day6HomeWork.homework2;

abstract class Superhero {
    private String heroName;
    private int powerLevel;


    public Superhero(String heroName, int powerLevel) {
        this.heroName = heroName;
        this.powerLevel = powerLevel;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public void powerBoost() {
        powerLevel += 10;
        System.out.println(heroName + " power boosted! Power level is now " + powerLevel);
    }


    abstract void usePower();

}
