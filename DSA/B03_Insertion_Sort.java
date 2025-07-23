package com.akashdipmahapatra.DSA;

public class B03_Insertion_Sort {

    public static void main(String[] args) {

        int arr[] = {6, 5, 2, 8, 9, 7};



        // Insertion Sort - https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/visualize/
        for(int i=1; i<arr.length; i++){

            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= key;
        }



        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
