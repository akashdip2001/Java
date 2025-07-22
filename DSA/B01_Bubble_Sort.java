package com.akashdipmahapatra.DSA;

public class B01_Bubble_Sort {

    public static void main(String[] args) {

        int arr[] = {8, 2 , 6, 7 , 1};
        int size = arr.length;

        System.out.print("After Shorting: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }

        // Bubble Short
        for(int i=0; i < size; i++){
            for(int j=0; j < size-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.print("Before Shorting: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}
