package com.javacoding.strings;



public class PrintDuplicatesFromString {
    public static void main(String[] args) {
        String name = new String("idiodt");
        char[] characters = name.toCharArray(); // name.toCharArray() converts name to char[].
        for(int i = 0; i< characters.length; i++){
            for(int j = i+1; j< characters.length; j++){
                if(characters[i] == characters[j]){
                    System.out.println("Duplicate Characters are : " + characters[j]);
                }
            }
        }
    }
}
