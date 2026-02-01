package com.talent.java.talent_java_homework.Day5HomeWork.homework2;

public class Vehicle {
    private String country;
    private int year;
    private int fuelLevel;


    private static int totalVehicles = 0;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public static int getTotalVehicles() {
        return totalVehicles;
    }

    public static void setTotalVehicles(int totalVehicles) {
        Vehicle.totalVehicles = totalVehicles;
    }


    public void refuel(int amount) {
        fuelLevel += amount;
        System.out.println("Vehicle refueled. Current fuel level: " + fuelLevel);
    }

    public Vehicle(String country, int year, int fuelLevel) {
        this.country = country;
        this.year = year;
        this.fuelLevel = fuelLevel;
        totalVehicles++;
    }

    public void startEngine() {
        System.out.println("The vehicle engine is starting.");
    }

    public void drive() {
        System.out.println("The vehicle is driving.");
    }

    public String getVehicleType(){
        return "Vehicle";
    }
}
