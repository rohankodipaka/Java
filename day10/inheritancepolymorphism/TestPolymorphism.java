package com.javacoding.day10.inheritancepolymorphism;

// Task 2: Employee Hierarchy

public class TestPolymorphism {
    public static void main(String[] args) {

        Employee employee = new Employee("Rohan", 50000);
        Manager manager = new Manager("Rohan", 50000, 15d);
        Developer developer = new Developer("Rohan", 50000, 20d);

        employee.calculateBonus();
        employee.displayInfo();
        System.out.println();

        manager.calculateBonus();
        manager.displayInfo();
        System.out.println();

        developer.calculateBonus();
        developer.displayInfo();

    }
}
