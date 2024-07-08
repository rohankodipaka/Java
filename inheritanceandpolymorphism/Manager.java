package com.javacoding.inheritanceandpolymorphism;

// Task 2: Employee Hierarchy

public class Manager extends Employee{
    double bonusPercentage;


    public Manager(String name, double salary, double bonusPercentage){
        super(name, salary);
        this.bonusPercentage = bonusPercentage;
    }

    public double calculateBonus(){
        return bonus = super.salary * (bonusPercentage/100);

    }

    public void displayInfo(){
        System.out.println("Manager's name : " + name);
        System.out.println("Manager's salary : " + salary);
        System.out.println("Bonus amount : " + calculateBonus());
    }
}
