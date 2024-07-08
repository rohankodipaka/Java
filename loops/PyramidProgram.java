package com.javacoding.loops;

import java.util.Scanner;

public class PyramidProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        //outer-loop --> rows
        for(int i = 1; i <= rows; i++){
            //inner loop --> for spaces
            for(int j = 1; j <= rows-i; j++){
                System.out.print(" ");
            }
            //inner loop --> for stars
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
