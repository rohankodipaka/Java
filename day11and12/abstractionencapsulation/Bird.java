package com.javacoding.day11and12.abstractionencapsulation;
//Task 1: Animal Classification System

public class Bird extends Animal{

    Bird(String name, int age){
        super(name, age);
    }

    public void makeSound(){
        System.out.println(name + " sound TWEE TWEE!");
    }

    public void move(){
        System.out.println(name + " is flying");
    }
}
