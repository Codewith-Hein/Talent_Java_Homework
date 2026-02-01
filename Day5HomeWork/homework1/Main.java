package com.talent.java.talent_java_homework.Day5HomeWork.homework1;

public class Main {

    public static void main(String[] args) {
//        Person person=new Person("Alice",24);
//        person.introduce();
//
//        Student student=new Student("kyaw naing",27,12);
//        student.introduce();
//
//        Teacher teacher=new Teacher("Mya Mya",28,"java");
//        teacher.introduce();

        Person[] people=new Person[3];



people[0]=new Student("Hein Thu Linn",24,12);
people[1]=new Teacher("Daw Mya Mya",28,"Java");
people[2]=new Student("Kyaw Naing",25,10);

for(Person person:people){
    person.introduce();
    System.out.println("Role: "+ person.getRole());

}



    }
}
