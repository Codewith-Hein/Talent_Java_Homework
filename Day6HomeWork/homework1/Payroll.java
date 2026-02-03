package com.talent.java.talent_java_homework.Day6HomeWork.homework1;

public class Payroll {
    public static void main(String[] args) {
        Employee[] employee=new Employee[4];

        employee[0]=new HourlyEmployee("kyaw kyaw",1,4000,44);
        employee[1]=new HourlyEmployee("kyaw Mg",2,4000,40);
        employee[2]=new SalariedEmployee("mg mg",3,400000);


        for (Employee emp:employee){
            System.out.println(emp);
        }


    }
}
