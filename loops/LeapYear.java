package com.javacoding.loops;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = sc.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year + " is Leap Year");
                } else{
                    System.out.println(year + " is not a Leap Year");
                }
            } else{
                System.out.println(year + " is Leap Year");
            }
        } else{
            System.out.println(year + " is not a Leap Year");
        }

    }
}
