package com.javacoding.strings;

import java.util.Arrays;

public class CheckTwoStringsAreAnagrams {
    public static void main(String[] args) {
        String firstWord = "fire";
        String secondWord = "rifa";

        if(firstWord.length()!=secondWord.length()){
            System.out.println("Not Anagrams");
        }
        char[] firstWordLetters = firstWord.toCharArray();
        char[] secondWordLetters = secondWord.toCharArray();
        Arrays.sort(firstWordLetters);
        Arrays.sort(secondWordLetters);
        if(Arrays.equals(firstWordLetters, secondWordLetters)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }


    }
}
