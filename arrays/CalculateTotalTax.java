package com.javacoding.arrays;

public class CalculateTotalTax {
    public static void main(String[] args) {
        int size = 5;
        long[] billings = {1000, 2000, 3000, 4000, 5000};
        System.out.println(calcTotalTax(size,billings));
    }
    public static long calcTotalTax(int size, long[] billings){
        long result = 0;
        for(int i=0; i<size; i++){
            if(billings[i]!=1000){
                billings[i]-=1000;
                result += billings[i]*0.10;
            }
        }
        return result;
    }

}
