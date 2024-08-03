package com.javacoding.arrays;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(findSum(numbers));
    }

    public static int findSum(int[] numbers){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum = sum+numbers[i];
        }
        return sum;
    }

}
