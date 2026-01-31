package com.talent.java.talent_java_homework.Day3HomeWork;

import java.util.Scanner;

public class Test {
    public  static String reverse(String name){
        String rev="";

        for(int i=name.length()-1;i>=0;i--){
            rev +=name.charAt(i);

        }

      return rev;

    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        try {
            String name=sc.nextLine();

            String reverseName=reverse(name);
            System.out.println(reverseName);

        }catch (Exception e){
            throw new Exception("input must be String");

        }




    }
}
