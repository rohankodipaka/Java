package com.javacoding.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int low = 0, high = arr.length-1;
        quickSort(arr, low, high);
        for(int num: arr){
            System.out.print(num + " ");
        }

    }
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int partitionIndex = sorting(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }

    }

    private static int sorting(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i= low, j= high;
        while (i < j) {
            while (arr[i]<=pivot && i<=high-1){
                i++;
            }
            while (arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] =  temp;
        return j;

    }
}
