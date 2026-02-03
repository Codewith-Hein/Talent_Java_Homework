package com.talent.java.talent_java_homework.Day6HomeWork.homework3;



public class BookStore {
    public static void main(String[] args) {
      Books b1=new Books("Java Basic","James",10000);
        Books b2 = new Books("OOP Concepts", "Robert", 1500);
        Books b3 = new Books("Data Structures", "Martin", 2000);

        System.out.println(b1.toString());
        System.out.println("After discount: " +b1.makeDiscount(10));

        System.out.println(b2.toString());
        System.out.println("After discount: "+b2.makeDiscount(20));

        System.out.println(b3.toString());
        System.out.println("After discount: "+b3.makeDiscount(15));


    }
}
