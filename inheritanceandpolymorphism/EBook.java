package com.javacoding.inheritanceandpolymorphism;

// Task 1 : Library System with Different Types of Books

public class EBook extends Book{
    double fileSize;
    public EBook(String title, String author, double fileSize){
        super(title, author);
        this.fileSize = fileSize;
    }


    public void displaySize() {
        System.out.println("File size : " + fileSize + "MB");
    }

}

