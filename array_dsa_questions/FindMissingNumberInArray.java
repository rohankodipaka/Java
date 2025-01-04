package com.javacoding.array_dsa_questions;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,5};
        int n = 5;

        //Optimal Solution 1
        System.out.println("The missing number is : " + findMissingNumber(numbers,n));
        //Optimal Solution 2
        System.out.println("The missing number is : " + findMissingNumberUsingXOR(numbers, n));
    }

    public static int findMissingNumber(int[] numbers, int n){
        int numbersSum=0;
        for(int i=0;i<n-1;i++){
            numbersSum += numbers[i];
        }
        int sum = n*(n+1)/2;
        return sum-numbersSum;
    }

    public static int findMissingNumberUsingXOR(int[] numbers, int n){
        int xor1 = 0, xor2 = 0;
        for(int j=0;j<n-1;j++){
            xor2 = xor2^numbers[j]; // XOR of array elements
            xor1 = xor1^(j+1);      //XOR up to [1...N-1]
        }
        xor1 = xor1^n; //XOR up to [1...N]
        return xor1^xor2; // the missing number
    }

}
