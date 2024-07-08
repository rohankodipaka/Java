package com.javacoding.abstractionandencapsulation;
//Task 1: Animal Classification System

public class AnimalTest {
    public static void main(String[] args) {


        Dog dog = new Dog("Leo", 10);
        Bird bird = new Bird("Jipsy", 5);

        dog.makeSound();
        dog.move();
        bird.makeSound();
        bird.move();



    }
}
