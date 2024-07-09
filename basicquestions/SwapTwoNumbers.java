package com.javacoding.basicquestions;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void swapTwoNumbersWithXor(int firstNumber, int secondNumber){
        //Binary Conversion --> 5(0101), 6(0110)
        firstNumber = firstNumber^secondNumber; //0101^0110 = 0011
        secondNumber = firstNumber^secondNumber; //0011^0110 = 0101
        firstNumber = firstNumber^secondNumber; //0011^0101 = 0110
        System.out.println("After Swapping\n firstNumber : " +firstNumber+"\n secondNumber : " + secondNumber);
    }
    public static void swapTwoNumberWithoutThirdVariable(int firstNumber, int secondNumber){
        firstNumber = firstNumber + secondNumber; //5+6=11
        secondNumber= firstNumber - secondNumber; //11-6=5
        firstNumber = firstNumber - secondNumber; //11-5=6
        System.out.println("After Swapping\n firstNumber : " +firstNumber+"\n secondNumber : " + secondNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        System.out.println("Before Swapping \n firstNumber : " + firstNumber+"\n secondNumber : " + secondNumber + "\n");
        swapTwoNumbersWithXor(firstNumber,secondNumber);
        System.out.println();
        swapTwoNumberWithoutThirdVariable(firstNumber,secondNumber);
    }
}
