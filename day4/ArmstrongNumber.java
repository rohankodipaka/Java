package com.javacoding.day4;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int originalNumber = number;
        int noOfDigits = String.valueOf(number).length();
        int result = 0;

        while(number > 0){
            int digit = number % 10;
            result = result + (int) Math.pow(digit, noOfDigits);
            number/=10;
        }

        //ternary operator
        System.out.println((originalNumber == result) ? (originalNumber + " is Armstrong") : (originalNumber + " is not Armstrong"));

    }
}
