package com.javacoding.loops;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 5;
        int number = 2;

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=2;j<=number;j++){
                if(number%j==0)
                    count++;
            }
            if(count==1)
                System.out.println(number + " ");
            number++;
        }

//        int count = 1;
//
//        for(int i=2; i<number; i++){
//            if(number%i==0){
//                count++;
//            }
//        }
//        if(count>1)
//            System.out.println("Not a Prime");
//        else
//            System.out.println("Prime");
    }
}
