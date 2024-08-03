package com.javacoding.arrays;

import java.util.ArrayList;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 3, 2, 5,1};
        System.out.println(findDuplicates(numbers));
    }
    public static ArrayList<Integer> findDuplicates(int[] numbers){
        ArrayList<Integer> duplicatesList = new ArrayList<>();
        for(int i=0; i< numbers.length; i++){
            for(int j=i+1; j< numbers.length;j++){
                if(numbers[i]==numbers[j]) {
                    if (duplicatesList.contains(numbers[i]))
                        break;
                    else {
                        duplicatesList.add(numbers[i]);
                    }
                }
            }
        }
        return duplicatesList;
    }
}
