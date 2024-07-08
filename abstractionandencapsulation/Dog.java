package com.javacoding.abstractionandencapsulation;
//Task 1: Animal Classification System

public class Dog extends Animal{

    Dog(String name, int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println(name + " sound : BOW BOW!");
    }

    public void move(){
        System.out.println(name + " is running");
    }

}
