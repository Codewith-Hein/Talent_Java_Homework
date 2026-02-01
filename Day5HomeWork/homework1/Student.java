package com.talent.java.talent_java_homework.Day5HomeWork.homework1;

public class Student extends Person {

    private int gradeLevel;


    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Student(String name, int age, int gradeLevel) {
        super(name, age);
       this.gradeLevel=gradeLevel;
    }

    public void introduce() {
        System.out.println(
                "Hello, I am student " + getName() +
                        ", age " + getAge() +
                        ", studying in grade " + getGradeLevel() + "."
        );
    }

    public String getRole(){
        return "Student";
    }
}
