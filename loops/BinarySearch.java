package com.javacoding.loops;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] elements = {54,25,6,77,2};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to find : ");
        int findElement = sc.nextInt();
        int low=0, high = elements.length-1;
        int index=-1;
        Arrays.sort(elements); //2,6,25,54,77
        while(low<=high){
            int mid = (low+high)/2;
            if(findElement == elements[mid]){
                index = mid;
                break;
            }
            else if(findElement<elements[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(index==-1){
            System.out.println("Element Not found");
        }
        else{
            System.out.println("Element found at index : "+ index);
        }

    }
}
