package com.talent.java.talent_java_homework.Day2HomeWork;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the mark of Myanmar subject");
        int myanmar=sc.nextInt();
        System.out.println("enter the mark of English subject");
        int english=sc.nextInt();
        System.out.println("enter the mark of Maths subject");
        int maths=sc.nextInt();
        System.out.println("enter the mark of Eco subject");
        int eco=sc.nextInt();
        System.out.println("enter the mark of Physic subject");
        int physic=sc.nextInt();




        int choice;

        do{


            System.out.println("........Student Mark Menu");
            System.out.println("1,average Mark");
            System.out.println("2,Grade");
            System.out.println("0,Exist");
            System.out.println("Enter your choice");

            choice=sc.nextInt();

            switch (choice){
                case 1:
                    int sum=myanmar + english + maths + eco + physic;
                    double avg=sum/5.0;

                    System.out.println("Average");
                    System.out.println(avg);
                    break;
                case 2:
                    int total = myanmar + english + maths + eco + physic;
                    double average = total / 5.0;



                    if (average >= 90 && average <= 100) {
                        System.out.println("Grade A");
                    } else if (average >= 80) {
                        System.out.println("Grade B");
                    } else if (average >= 70) {
                        System.out.println("Grade C");
                    } else if (average >= 60) {
                        System.out.println("Grade D");
                    } else {
                        System.out.println("Grade F");
                    }
                    break;



                case 0:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalid Number");
            }

        }while (choice !=0);

        sc.close();






    }
}
