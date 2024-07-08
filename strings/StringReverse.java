package com.javacoding.strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String name = sc.next();
        char ch[] = name.toCharArray();
        String reverse = "";
        for(int i = ch.length-1; i>=0; i--){
            reverse = reverse + ch[i];
        }
        System.out.println(reverse);
    }
}
