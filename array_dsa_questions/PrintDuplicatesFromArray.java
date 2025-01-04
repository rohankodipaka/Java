package com.javacoding.array_dsa_questions;
import java.util.ArrayList;

public class PrintDuplicatesFromArray {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,2,2,3,3,3};
        System.out.println(findDuplicates(numbers));
    }

    //This solution works for both sorted and unsorted arrays.
    public static ArrayList<Integer> findDuplicates(int[] numbers){
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j< numbers.length;j++){
                if(numbers[i]==numbers[j])
                    if(duplicates.contains(numbers[i]))
                        break;
                    else
                        duplicates.add(numbers[i]);
            }
        }
        return duplicates;
    }

}
