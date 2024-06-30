package com.javacoding.collections;
import java.util.ArrayList;

public class ArrayListCollection{
    public static void main(String[] args) {

        ArrayList<String> elements = new ArrayList<>();

        //adding elements
        elements.add("Bujji");
        elements.add("Bhairava");
        elements.add("Roxie");
        elements.add("Ashwathama");
        elements.add("Supreme Yaskin");

        //Modify
        //replace element at index 2 with a new value
        elements.set(2, "Sumathi");
        //remove the element at index 4
        elements.remove(4);

        //Iterate through ArrayList
        for(int i = 0; i<=elements.size()-1; i++){
            System.out.println(elements.get(i));
        }

        //check a element arrayList
        if(elements.contains("Bujji")){
            System.out.println("Found");
        } else{
            System.out.println("Not found");
        }




    }
}
