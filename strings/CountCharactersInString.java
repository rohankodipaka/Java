package com.javacoding.strings;

public class CountCharactersInString {
    public static void main(String[] args) {
        String name = "This is a sentence";
        char[] letters = name.toCharArray();
        int count =0;
        for(int i=0;i< letters.length;i++){
            if(letters[i]!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
