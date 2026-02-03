package com.talent.java.talent_java_homework.Day3HomeWork;

import java.util.Scanner;

public class MultiplicationTable {

    public static void printTable(int num, int row) {


        try {
            for (int i = 1; i <= row; i++) {

                int table = num * i;

                System.out.println(num + "*" + i + "=" + table);
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number... ");

        int num = sc.nextInt();

        System.out.println("enter Rows");
        int row = sc.nextInt();

        printTable(num, row);


    }
}
