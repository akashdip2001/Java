package com.akashdipmahapatra.DSA;

import java.io.OutputStream;

public class B02_Selection_Sort {

    public static void main(String[] args) {

        int arr[] = {6, 5, 2, 8, 9, 4};
        int size = arr.length;
        int minIndex = -1;

        System.out.print("After Shorting: ");
        for (int num : arr) {
            System.out.print(num+" ");
        }



        // Selection Short --> O(n²)
        for(int i = 0; i < size-1; i++){
            minIndex = i;

            for(int j = i+1; j < size; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // 👁 Step-by-step print (optional)
            System.out.println();
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }



        System.out.println();
        System.out.print("Before Shorting: ");
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }

}

//Output
//
//After Shorting: 6 5 2 8 9 4
//                2 5 6 8 9 4
//                2 4 6 8 9 5
//                2 4 5 8 9 6
//                2 4 5 6 9 8
//                2 4 5 6 8 9
//Before Shorting: 2 4 5 6 8 9