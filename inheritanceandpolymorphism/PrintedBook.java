package com.javacoding.inheritanceandpolymorphism;

// Task 1 : Library System with Different Types of Books

public class PrintedBook extends Book{
    int numPages;

    public PrintedBook(String title, String author, int numPages){
        super(title, author);
        this.numPages = numPages;
    }

    public void displayNumPages(){
        System.out.println("Number of Pages: " + numPages);
    }

}
