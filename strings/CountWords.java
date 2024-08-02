package com.javacoding.strings;

public class CountWords {
    public static void main(String[] args) {
        String sentence = "Hi my name is Rohan";
        int count = 0;
        char[] letters = sentence.toCharArray();
        for(int i=0; i< letters.length; i++){
            if(letters[i]==' '){
                count++;
            }
        }
        System.out.println(count+1);

    }
}
