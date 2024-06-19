package com.javacoding.day4;

import java.util.Scanner;

public class ZeroOneTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        //outer loop --> rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop --> columns
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j)%2 == 0 ? "1" : "0");
            }

            System.out.println();
        }
    }
}
