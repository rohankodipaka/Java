package com.javacoding.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElementInArray {
    public static void main(String[] args) {

        int[] numbers = {1,2,1,2,5,1,2};
         findFrequency(numbers);

    }

    public static void findFrequency(int[] numbers){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i=0; i<numbers.length;i++){
            if(frequencyMap.containsKey(numbers[i]))
                frequencyMap.put(numbers[i], frequencyMap.get(numbers[i])+1);
            else
                frequencyMap.put(numbers[i],1);
        }
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
