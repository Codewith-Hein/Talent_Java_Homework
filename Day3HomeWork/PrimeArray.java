package com.talent.java.talent_java_homework.Day3HomeWork;

public class PrimeArray {


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 2, 8, 11, 15};
        int count = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (isPrime(arr[i])) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }


        System.out.println("Prime Number are: " + count);


    }
}
