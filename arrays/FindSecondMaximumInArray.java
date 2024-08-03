package com.javacoding.arrays;

public class FindSecondMaximumInArray {
    public static void main(String[] args) {
        int[] numbers = {10,2,3,4,5};
        System.out.println(findSecondMaximum(numbers));
    }

    public static int findSecondMaximum(int[] numbers){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]>max){
                secondMax = max;
                max = numbers[i];
            }
            else if(numbers[i] > secondMax && numbers[i] != max){
                secondMax = numbers[i];
            }
        }
        return secondMax;
    }

}
