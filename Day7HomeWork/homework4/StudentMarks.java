package com.talent.java.talent_java_homework.Day7HomeWork.homework4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args) {

        HashMap<String, Integer> studentMarksDetail = new HashMap<>();

        studentMarksDetail.put("Zaw Zaw", 87);
        studentMarksDetail.put("Kyaw Kyaw", 90);
        studentMarksDetail.put("Hla Hla", 77);
        studentMarksDetail.put("Zaw Lay", 67);
        studentMarksDetail.put("Mg Mya", 57);

        // PRINT all students using Iterator
        System.out.println("Student Marks List");
        try {
            Iterator<Map.Entry<String, Integer>> iterator =
                    studentMarksDetail.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<String, Integer> entry = iterator.next();
                System.out.println("Name: " + entry.getKey()
                        + ", Marks: " + entry.getValue());
            }
        } catch (Exception e) {
            System.out.println("Error while displaying student marks.");
        }

        // FIND highest mark (safe but wrapped for practice)
        String topStudent = "";
        int highestMark = Integer.MIN_VALUE;

        try {
            for (Map.Entry<String, Integer> mark : studentMarksDetail.entrySet()) {
                if (mark.getValue() > highestMark) {
                    highestMark = mark.getValue();
                    topStudent = mark.getKey();
                }
            }
            System.out.println("\nTop Student: " + topStudent +
                    ", Marks: " + highestMark);
        } catch (Exception e) {
            System.out.println("Error while finding top student.");
        }

        // REMOVE student
        System.out.println("\nRemove student based on name");
        try {
            Integer removed = studentMarksDetail.remove("Mg Mya");
            if (removed != null) {
                System.out.println("Remove Successful");
            } else {
                System.out.println("Student not found");
            }
        } catch (Exception e) {
            System.out.println("Error while removing student.");
        }

        // PRINT current list
        System.out.println("\nCurrent Student List");
        try {
            Iterator<Map.Entry<String, Integer>> iterator1 =
                    studentMarksDetail.entrySet().iterator();

            while (iterator1.hasNext()) {
                Map.Entry<String, Integer> currentStudent = iterator1.next();
                System.out.println(currentStudent.getKey()
                        + " = " + currentStudent.getValue());
            }
        } catch (Exception e) {
            System.out.println("Error while displaying current list.");
        }
    }
}
