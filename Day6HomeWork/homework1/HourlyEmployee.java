package com.talent.java.talent_java_homework.Day6HomeWork.homework1;

public class HourlyEmployee extends Employee{
    private int hourlyRate;
    private double hourWorked;

    public HourlyEmployee(String name, int id, int hourlyRate, double hourWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hourWorked = hourWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(double hourWorked) {
        this.hourWorked = hourWorked;
    }




    @Override
    double calculatePay() {
        if (hourWorked > 40) {
            int overTimeHour = (int) (hourWorked - 40);
            double overTimePay = 2 * (overTimeHour * hourlyRate);
            return overTimePay;
        }

        return hourlyRate * hourWorked;
    }
}
