package com.javacoding.stack;

import java.util.Scanner;

public class QueueImplementationUsingArrays {
    public static void main(String[] args) {

        int ch;
        Queue queue = new Queue();

        Scanner sc = new Scanner(System.in);
        System.out.println("Queue Operations");
        System.out.println("1. Enqueue - Insert Data");
        System.out.println("2. Dequeue - Delete Data");
        System.out.println("3. Display Data");
        System.out.println("0. Exit");

        while (true) {
            System.out.println("Enter your choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1: queue.enqueue();
                    break;
                case 2: queue.dequeue();
                    break;
                case 3: queue.display();
                    break;
                case 0: System.exit(0);
                default:
                    System.out.println("Enter proper choice : ");
            }
        }
    }
}

class Queue {
    int rp = -1, fp = -1;
    int size = 5;
    int[] array = new int[size];

    boolean isEmpty() {
        if (rp == -1 || fp > rp) {
            System.out.println("Queue is Empty");
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (rp == size - 1) {
            System.out.println("Queue is Full");
            return true;
        }
        return false;
    }

    void enqueue() {
        Scanner sc = new Scanner(System.in);
        if (!isFull()) {
            System.out.println("Enter element to insert: ");
            int item = sc.nextInt();
            rp++;
            array[rp] = item;
            if (fp == -1) {
                fp = 0;
            }
        }
    }

    void display() {
        if (!isEmpty()) {
            for (int i = fp; i <= rp; i++) {
                System.out.println(array[i]);
            }
        }
    }

    void dequeue() {
        if (!isEmpty()) {
            System.out.println(array[fp] + " is deleted successfully");
            array[fp] = 0;
            fp++;
            if (fp > rp) {
                fp = rp = -1; // Reset the queue when empty
            }
        }
    }
}
