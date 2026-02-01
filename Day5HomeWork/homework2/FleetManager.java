package com.talent.java.talent_java_homework.Day5HomeWork.homework2;

public class FleetManager {
    public static void main(String[] args) {
        Vehicle[] fleet=new Vehicle[3];

        fleet[0] = new Car("Japan", 2020, 50);
        fleet[1] = new Motorcycles("Germany", 2019, 30);
        fleet[2] = new Car("USA", 2022, 60);


        for (Vehicle vehicle : fleet) {
            System.out.println("Vehicle Type: " + vehicle.getVehicleType());
            vehicle.startEngine();
            vehicle.drive();
            vehicle.refuel(20);
            System.out.println("---------------------");
        }

        System.out.println("Total vehicles created: " + Vehicle.getTotalVehicles());

    }



}
