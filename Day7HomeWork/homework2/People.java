package com.talent.java.talent_java_homework.Day7HomeWork.homework2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class People {
    public static void main(String[] args) {

        LinkedList<String> waitingList = new LinkedList<>();

        waitingList.add("kyaw kyaw");
        waitingList.add("Mg Mg");
        waitingList.add("Mu Mu");
        waitingList.add("Min Min");
        waitingList.add("aung aung");

        System.out.println("Waiting List");


        try {
            Iterator<String> person = waitingList.iterator();
            while (person.hasNext()) {
                System.out.println(person.next());
            }
        } catch (Exception e) {
            System.out.println("Error while displaying waiting list.");
        }


        try {
            String servedPerson = waitingList.removeFirst();
            System.out.println("Served: " + servedPerson);
        } catch (NoSuchElementException e) {
            System.out.println("No people in the waiting list to serve.");
        }


        waitingList.addLast("mya kyaw");

        System.out.println("Updated waiting list");
        for (String list : waitingList) {
            System.out.println(list);
        }

        System.out.println("Number of people waiting: " + waitingList.size());
    }
}
