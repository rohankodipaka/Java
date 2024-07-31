package com.javacoding.arrays;

public class PerfectSquare {
    public static void main(String[] args) {
        int[] numbers = {2,3,14,25,5};
        int result = 0;
        for(int i=0;i<numbers.length;i++){
            int sqrt = (int)Math.sqrt(numbers[i]);
            if(sqrt*sqrt == numbers[i]){
                result = numbers[i];
            }
        }
        
        System.out.println("Perfect Square : "+result);

    }
}
