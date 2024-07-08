package com.javacoding.abstractionandencapsulation;
//Task 2: Encapsulated Student Class

public class Student {
    String name;
    int age;
    double grade;

    public Student(){
        this.name = "";
        this.age = 0;
        this.grade = 0.0;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getGrade(){
        return grade;
    }

    public void displayInfo(){
        System.out.println("Student Details - ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Grade : " + grade);
    }

}
