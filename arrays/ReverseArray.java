package com.javacoding.arrays;

public class ReverseArray {
    public static int[] reverseAnArray(int[] numbers){
        int i = 0;
        int j = numbers.length - 1;
        while(i<j){
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            i++;
            j--;
        }
        return numbers;
    }
    public static void main(String[] args) {
        int[] numbers = {2,3,1,17,4,5};
        int[] reversed_numbers = reverseAnArray(numbers);
        //for each loop
        for(int number : reversed_numbers){
            System.out.print(number + " ");
        }
    }
}
