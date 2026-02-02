package com.talent.java.talent_java_homework.Day5HomeWork.homework3;

public class InstructorAnimal {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog=new Dog();
        Ronney ronney=new Ronney();

        animal.speak();
        System.out.println(".................");
        dog.speak();
        dog.cute();
        System.out.println(".................");
        ronney.speak();
        ronney.cute();
    }
}
