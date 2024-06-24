package com.javacoding.day10.inheritancepolymorphism;

// Task 2: Employee Hierarchy

public class Employee {
    //instance varibles

    String name;
    double salary;

    double bonus;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double calculateBonus(){
        return bonus;
    }

    public void displayInfo(){
        System.out.println("Employee's name : " + name);
        System.out.println("Employee's salary : " + salary);
        System.out.println("Bonus amount : " + bonus);
    }


}
