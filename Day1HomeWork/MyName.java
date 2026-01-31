package com.talent.java.talent_java_homework.Day1HomeWork;

import java.util.Scanner;

public class MyName {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();

        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
