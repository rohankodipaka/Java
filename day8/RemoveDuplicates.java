package com.javacoding.day8;
import java.util.HashMap;

//optimal solution using Hashmap

public class RemoveDuplicates {

    public static void deleteDuplicates(int[] numbers){
        //syntax -> HashMap<KeyType, ValueType> mapName = new HashMap<>();
        HashMap<Integer, Integer> uniqueElements = new HashMap<>();

        //for each loop
        for (int number : numbers) {
            if (!uniqueElements.containsKey(number)) {
                System.out.println(number + " ");
                //mapName.put(key, value);
                uniqueElements.put(number, 1); //here 1(value) is just a placeholder to show the presence.
            }
        }

    }

    public static void main(String[] args) {
        int[] numbers = {4, 3, 9, 2, 4, 1, 10, 89, 2};
        deleteDuplicates(numbers);
    }
}
