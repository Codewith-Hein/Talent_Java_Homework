package com.talent.java.talent_java_homework.Day1HomeWork;

import java.time.LocalDate;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Name");
        String myName=sc.nextLine();
        LocalDate today=LocalDate.now();


        System.out.println("My Name is : " + myName);
        System.out.println("Date: " + today);
    }
}
