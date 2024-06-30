package com.javacoding.collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapCollections {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        //add student ids and values
        students.put(1, "Rohan");
        students.put(2, "Jessica");
        students.put(3, "Lahari");
        students.put(4, "Charan");
        students.put(5, "Sunny");

        //display
        for(int i = 1; i<= students.size(); i++){
            System.out.println(students.get(i));
        }

        //modify
        //replace
        students.replace(5, "Pavan");
        //remove
        students.remove(4);

        //Iterate through for each loop
        for(Map.Entry<Integer, String> student_details : students.entrySet()){
            System.out.println("Key : " + student_details.getKey() + ", Value : " + student_details.getValue());
        }

    }
}
