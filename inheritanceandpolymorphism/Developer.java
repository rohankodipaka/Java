package com.javacoding.inheritanceandpolymorphism;

// Task 2: Employee Hierarchy

public class Developer extends Employee{
    double fixedBonus;

    public Developer(String name, double salary, double fixedBonus){
        super(name, salary);
        this.fixedBonus = fixedBonus;
    }

    public double calculateBonus(){
        return fixedBonus;
    }

    public void displayInfo(){
        System.out.println("Developer's name : " + name);
        System.out.println("Developer's salary : " + salary);
        System.out.println("Fixed Bonus : " + calculateBonus() + "%");
    }

}
