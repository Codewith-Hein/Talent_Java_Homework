package com.talent.java.talent_java_homework.Day6HomeWork.homework1;

public class SalariedEmployee extends Employee {
    private int annualSalary;

    public SalariedEmployee(String name, int id, int annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    double calculatePay() {
        return (double) annualSalary / 12;
    }
}
