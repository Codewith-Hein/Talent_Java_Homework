package com.talent.java.talent_java_homework.Day4HomeWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class YourInformation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name");
        String name=sc.nextLine();

        System.out.println("Enter your age");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter yout email");
        String email=sc.nextLine();

        File myObj=new File("personalDetail.txt");

        try{


            if (myObj.createNewFile()){
                System.out.println("File Created: " + myObj.getName());
            }else {
                System.out.println("File already exists.");
            }

            FileWriter writer=new FileWriter(myObj);

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Email: " + email + "\n");
            writer.close();
            System.out.println("Information save Successfully");


        }catch (IOException e){
            System.out.println("An error occurred.");


        }

        System.out.println("Your Information Detail:");


        try{

            Scanner fileReader=new Scanner(myObj);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }

                fileReader.close();

            }catch (Exception e){
                System.out.println("Error reading file");
            }

        }
    }


