package com.talent.java.talent_java_homework.Day3HomeWork;

public class Calculator {
    public  static int multiplication(int a,int b){
        return a * b;
    }

    public  static int multiplication(int a,int b,int c){
        return a * b * c;
    }


    public static void main(String[] args) {

        int a=10;
        int b=11;
        int c=20;

        int towMultiply=multiplication(a,b);
        int threeMultiply=multiplication(a,b,c);
        System.out.println(towMultiply);
        System.out.println(threeMultiply);


    }
}
