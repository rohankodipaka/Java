package com.javacoding.loops;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int[] values = {28,15,5,74,6};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to find : ");
        int findValue = sc.nextInt();
        int index = -1;
        for(int i=0; i<values.length; i++){
            if(findValue == values[i]){
                index = i;
            }
        }
        if(index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index - "+index);



    }
}
