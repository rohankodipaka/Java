package com.javacoding.strings;

public class CountVowels {
    public static void main(String[] args) {
        String sentence = "count vowels";
        System.out.println(vowelsCountInString(sentence));
    }

    public static int vowelsCountInString(String words){
        char[] letters = words.toCharArray();
        int count = 0;
        for(int i=0;i<letters.length;i++){
            if(letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u'){
                count = count+1;
            }
        }
        return count;
    }

}
