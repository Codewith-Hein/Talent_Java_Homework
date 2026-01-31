package com.talent.java.talent_java_homework.Day3HomeWork;

import java.util.Scanner;

public class CharacterTypeCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String inputText=sc.nextLine();

         int letterCount=0;
         int digitCount=0;
         int specialCharacterCount=0;

         for (int i=0;i<inputText.length();i++){
             char currentCharacter=inputText.charAt(i);

             if(Character.isLetter(currentCharacter)){
                 letterCount++;
             }else if(Character.isDigit(currentCharacter)){
                 digitCount++;
             }else {
                 specialCharacterCount++;
             }
         }


        System.out.println("Letters: " + letterCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharacterCount);
    }


}
