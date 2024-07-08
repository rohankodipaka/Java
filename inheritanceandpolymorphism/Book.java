package com.javacoding.inheritanceandpolymorphism;

// Task 1 : Library System with Different Types of Books

public class Book {
    //instance variables
    String title;
    String author;

    //constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    //methods
    public void displayInfo(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }

}
