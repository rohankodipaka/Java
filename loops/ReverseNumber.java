package com.javacoding.loops;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=154;
        int reverse=0;
        while(n>0){
            int r = n%10;
            reverse = reverse*10+r;
            n=n/10;
        }
        System.out.println(reverse);
    }
}
