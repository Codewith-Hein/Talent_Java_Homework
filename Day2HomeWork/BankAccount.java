package com.talent.java.talent_java_homework.Day2HomeWork;


import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to HeinBank,Please enter your balance amount");

        int balance = sc.nextInt();
        int choice;

        try {
            do {
                System.out.println(".......HeinBanking System........");
                System.out.println("1,Deposit Money");
                System.out.println("2,Withdraw Money");
                System.out.println("3,Check Your Balance");
                System.out.println("0,Exist");
                System.out.println("Enter your choice");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter your Deposit Amount");
                        int deposit = sc.nextInt();
                        balance += deposit;
                        System.out.println("Deposit Successful");
                        break;
                    case 2:
                        System.out.println("Enter your Withdraw Amount");
                        int withDraw = sc.nextInt();
                        if (withDraw > balance) {
                            System.out.println("insufficient balance");
                        } else {
                            balance -= withDraw;
                            System.out.println("Withdraw Amount is: " + withDraw);
                            System.out.println("Withdraw Successful");
                        }

                        break;
                    case 3:
                        System.out.println("Current Balance: " + balance);
                        break;

                    case 0:
                        System.out.println("Thank you for using HeinBank!");
                        break;

                    default:
                        System.out.println("Invalid code.Please try again");
                }

            } while (choice != 0);
        } catch (Error e) {
            System.out.println("error" + e.getMessage());
        }


        sc.close();


    }
}
