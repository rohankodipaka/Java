package com.javacoding.day10;

public class LibraryTest {
    public static void main(String[] args) {
        Book book = new Book("FAULT IN OUR STARS", "GREEN");
        EBook ebook = new EBook("FAULT IN OUR STARS", "GREEN", 105.10d);
        PrintedBook printedbook = new PrintedBook("FAULT IN OUR STARS", "GREEN", 500);
        book.displayInfo();
        ebook.displaySize();
        printedbook.displayNumPages();
    }
}
