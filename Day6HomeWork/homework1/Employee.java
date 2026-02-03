package com.talent.java.talent_java_homework.Day6HomeWork.homework1;

public abstract class Employee {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return " Employee Salary -> " +
                "Name: " + name +
                ", Pay: " + calculatePay();
    }


    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    double calculatePay() {
        return 0;
    }
}
