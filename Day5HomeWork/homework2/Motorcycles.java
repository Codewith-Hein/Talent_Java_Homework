package com.talent.java.talent_java_homework.Day5HomeWork.homework2;

public class Motorcycles extends Vehicle{


    public Motorcycles(String country, int year, int fuelLevel) {
        super(country, year, fuelLevel);
    }

    public void startEngine() {
        System.out.println("The motorcycle engine starts with a loud roar.");
    }


    public void drive() {
        System.out.println("The motorcycle is riding through traffic.");
    }


    public void refuel(int amount) {
        setFuelLevel(amount) ;
        System.out.println("Car refueled. Fuel level: " + getFuelLevel());
    }


    public String getVehicleType(){
        return "Motorcycles";
    }
}
