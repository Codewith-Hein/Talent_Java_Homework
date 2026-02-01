package com.talent.java.talent_java_homework.Day5HomeWork.homework1;

public class Teacher extends Person {
    private String subject;


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void introduce() {
        System.out.println(
                "Hello, I am teacher " + getName() +
                        ", age " + getAge() +
                        ", and I teach " + getSubject() + "."
        );
    }

    public String getRole(){
        return "Teacher";
    }
}
