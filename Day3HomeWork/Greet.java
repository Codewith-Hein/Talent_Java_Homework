package com.talent.java.talent_java_homework.Day3HomeWork;

import java.util.Scanner;

public class Greet {
    public  static  void printGreeting(){
        System.out.println("Hello");
    }
    public  static  String printGreeting(String name){
        return name;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        String name=sc.nextLine();

       String greetingMsg=printGreeting(name);
        System.out.println("Hello " + greetingMsg);

        printGreeting();


    }
}
