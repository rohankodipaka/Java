package com.javacoding.arrays;

public class LargestAndSmallestElement {

    public static int largestElement(int[] numbers){
        int max_number = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(max_number < numbers[i]){
                max_number = numbers[i];
            }
        }
        return max_number;
    }

    public static int smallestElement(int[] numbers){
        int min_number = numbers[0];
        for(int i = 1; i <= numbers.length-1; i++){
            if(min_number > numbers[i]){
                min_number = numbers[i];
            }
        }
        return min_number;
    }

    public static void main(String[] args) {
        int[] numbers = {6,47,24,5,259,2};
        System.out.println("Largest Element is : " + largestElement(numbers));
        System.out.println("Smallest Element is : " + smallestElement(numbers));
    }
}
