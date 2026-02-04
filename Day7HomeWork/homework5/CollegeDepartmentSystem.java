package com.talent.java.talent_java_homework.Day7HomeWork.homework5;

import java.util.*;

public class CollegeDepartmentSystem {
    public static void main(String[] args) {

        List<String> studentName = new ArrayList<>();

        studentName.add("mg mg");
        studentName.add("kyaw kyaw");
        studentName.add("hla hla");

        Map<String, Set<String>> studentSubjects = getStringSetMap();

        // PRINT students and subjects (safe)
        System.out.println("Students and their subjects:");
        try {
            for (String student : studentName) {
                System.out.println(student + " -> " + studentSubjects.get(student));
            }
        } catch (Exception e) {
            System.out.println("Error while displaying students.");
        }

        // ADD subject (risky part)
        try {
            studentSubjects.get("mg mg").add("Computer Science");
            System.out.println("\nSubject added for mg mg.");
        } catch (NullPointerException e) {
            System.out.println("Student not found. Cannot add subject.");
        }

        // REMOVE subject (risky part)
        try {
            boolean removed = studentSubjects.get("hla hla").remove("Math");
            if (removed) {
                System.out.println("Subject removed from hla hla.");
            } else {
                System.out.println("Subject not found for hla hla.");
            }
        } catch (NullPointerException e) {
            System.out.println("Student not found. Cannot remove subject.");
        }

        // COMBINE all unique subjects (safe)
        Set<String> allSubjects = new HashSet<>();

        try {
            for (Set<String> subjectSet : studentSubjects.values()) {
                allSubjects.addAll(subjectSet);
            }
        } catch (Exception e) {
            System.out.println("Error while collecting subjects.");
        }

        System.out.println("\nAll unique subjects offered:");
        System.out.println(allSubjects);
    }

    private static Map<String, Set<String>> getStringSetMap() {
        Map<String, Set<String>> studentSubjects = new HashMap<>();

        Set<String> subjects1 = new HashSet<>();
        subjects1.add("Math");
        subjects1.add("Physics");
        subjects1.add("English");

        Set<String> subjects2 = new HashSet<>();
        subjects2.add("Math");
        subjects2.add("Chemistry");
        subjects2.add("Biology");

        Set<String> subjects3 = new HashSet<>();
        subjects3.add("English");
        subjects3.add("Computer Science");
        subjects3.add("Math");

        studentSubjects.put("mg mg", subjects1);
        studentSubjects.put("kyaw kyaw", subjects2);
        studentSubjects.put("hla hla", subjects3);
        return studentSubjects;
    }
}
