package com.talent.java.talent_java_homework.Day1HomeWork;

import java.time.LocalDate;
import java.util.Scanner;

public class MyAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your birthYear");

        int birthYear=sc.nextInt();

        int currentYear= LocalDate.now().getYear();

        int age=currentYear-birthYear;

        System.out.println("my age is: " + age);
    }
}
