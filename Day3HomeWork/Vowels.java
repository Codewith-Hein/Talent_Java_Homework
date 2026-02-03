package com.talent.java.talent_java_homework.Day3HomeWork;

import java.util.Scanner;

public class Vowels {

    public static int countVowels(String input) {

        int countVowels = 0;
        input = input.toLowerCase();
        try {
            for (int i = 0; i < input.length(); i++) {
                char inputChar = input.charAt(i);

                if (inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u') {
                    countVowels++;
                }
            }
        } catch (Exception e) {
        }


        return countVowels;


    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        int vowelsContains = countVowels(name);

        System.out.println("Number of vowels: " + vowelsContains);


    }
}
