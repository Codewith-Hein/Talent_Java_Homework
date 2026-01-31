package com.talent.java.talent_java_homework.Day3HomeWork;

import java.util.Scanner;

public class Factorial {

public static int factorial(int n){

    if(n==1||n==0){
        return 1;
    }


    int fact_nm1=factorial(n-1);
    int fact_num=n* fact_nm1;
    return fact_num;




}
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);

        try{
            int n=sc.nextInt();

            int factorial=factorial(n);

            System.out.println("Factorial: " + factorial);
        }catch (Exception e) {
            throw new Exception("input must be Integer");

        }



    }
}
