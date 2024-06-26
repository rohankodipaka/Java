package com.javacoding.day11and12.abstractionencapsulation;
//Task 2: Encapsulated Student Class

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student();

        //set values for instance variables using setter methods
        student.setName("Rohan");
        student.setAge(22);
        student.setGrade(8.8);
        student.displayInfo();

        System.out.println();

        //updated details
        student.setName("Rohith");
        student.setAge(25);
        student.setGrade(9.5);
        student.displayInfo();
    }
}
