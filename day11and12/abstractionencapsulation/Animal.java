package com.javacoding.day11and12.abstractionencapsulation;
//Task 1: Animal Classification System

abstract class Animal {
    //instance variables
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }


    abstract void makeSound();
    abstract void move();

}
