package com.talent.java.talent_java_homework.Day7HomeWork.homework1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentList {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Aung Aung"));
        students.add(new Student(2, "Kyaw Kyaw"));
        students.add(new Student(3, "Mg Mg"));
        students.add(new Student(4, "Su Su"));
        students.add(new Student(5, "Hla Hla"));

        // PRINT all students
        System.out.println("All Students");
        try {
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (Exception e) {
            System.out.println("Error while displaying students.");
        }

        Scanner sc = new Scanner(System.in);

        // SEARCH student by name
        System.out.println("\nSearch Panel");
        String searchByName = "";

        try {
            searchByName = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        System.out.println("Searching for " + searchByName);
        boolean found = false;

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(searchByName)) {
                System.out.println("Found: " + student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }

        // REMOVE student by ID
        System.out.println("\nRemove Student");
        System.out.println("Enter the valid ID");

        int removeId = -1;

        try {
            removeId = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid ID input.");
        }

        boolean foundId = false;

        try {
            Iterator<Student> iterator = students.iterator();

            while (iterator.hasNext()) {
                Student student = iterator.next();

                if (student.getId() == removeId) {
                    iterator.remove(); // SAFE removal
                    System.out.println("Student ID " + removeId + " has been removed.");
                    foundId = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error while removing student.");
        }

        if (!foundId) {
            System.out.println("Invalid ID");
        }

        System.out.println("\nTotal number of students: " + students.size());
    }
}
