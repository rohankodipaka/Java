package com.javacoding.strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String name = "enoone";
        String result = "";
        char[] chars = name.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            result = result+chars[i]+"";
        }
        if(name.equals(result))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
