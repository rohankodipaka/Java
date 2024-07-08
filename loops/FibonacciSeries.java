package com.javacoding.loops;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int limit = sc.nextInt();
        int number1 = 1, number2 = 1, number3;

        System.out.print(number1 + " ");
        while (number2 <= limit) {
            System.out.print(number2 + " ");
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;

        }
    }
}