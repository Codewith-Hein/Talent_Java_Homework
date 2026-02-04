package com.talent.java.talent_java_homework.Day7HomeWork.homework3;

import java.util.HashSet;
import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {

        HashSet<String> guestNameList = new HashSet<>();

        guestNameList.add("Kyaw Kyaw");
        guestNameList.add("Mg Mg");
        guestNameList.add("Mg Mg");      // duplicate ignored
        guestNameList.add("Mya Mya");
        guestNameList.add("Mg Kyaw");
        guestNameList.add("Mg Kyaw");    // duplicate ignored

        System.out.println("Today All Guest List");
        for (String guest : guestNameList) {
            System.out.println(guest);
        }

        System.out.println("Search Panel");

        Scanner sc = new Scanner(System.in);
        String nameSearch = "";


        try {
            nameSearch = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        System.out.println("Searching...");
        boolean found = false;

        for (String guest : guestNameList) {
            if (guest.equalsIgnoreCase(nameSearch)) {
                System.out.println("Found: " + guest);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid Name");
        }


        try {
            boolean removeName = guestNameList.remove("Mg Kyaw");
            System.out.println("Remove Guest Successful: " + removeName);
        } catch (Exception e) {
            System.out.println("Error while removing guest.");
        }

        System.out.println("Updated Guest List");
        for (String guest : guestNameList) {
            System.out.println(guest);
        }

        System.out.println("Total Guest List: " + guestNameList.size());
    }
}
