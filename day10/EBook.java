package com.javacoding.day10;

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

