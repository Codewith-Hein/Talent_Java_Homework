package com.talent.java.talent_java_homework.Day5HomeWork.homework1;

public class Main {

    public static void main(String[] args) {


        Person[] people = new Person[3];


        people[0] = new Student("Hein Thu Linn", 24, 12);
        people[1] = new Teacher("Daw Mya Mya", 28, "Java");
        people[2] = new Student("Kyaw Naing", 25, 10);


        try {
            for (Person person : people) {
                person.introduce();
                System.out.println("Role: " + person.getRole());

            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }


    }
}
