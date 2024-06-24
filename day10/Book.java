package com.javacoding.day10;

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
