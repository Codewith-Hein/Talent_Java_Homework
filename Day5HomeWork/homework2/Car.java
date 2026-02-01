package com.talent.java.talent_java_homework.Day5HomeWork.homework2;

public class Car extends Vehicle{


    public Car(String country, int year, int fuelLevel) {
        super(country, year, fuelLevel);
    }

    public void startEngine() {
        System.out.println("The car engine starts with a smooth sound.");
    }


    public void drive() {
        System.out.println("The car is driving on the road.");
    }

    public void refuel(int amount) {
        setFuelLevel(amount) ;
        System.out.println("Car refueled. Fuel level: " + getFuelLevel());
    }


    public String getVehicleType(){
        return "Car";
    }
}
