package com.akashdipmahapatra.DSA;

public class B04_Quick_Short {



    // Quick Short
    public static void QuickShort(int[] arr, int low, int high){

        if(low < high){

            int pi = partition(arr, low, high);

            QuickShort(arr, pi+1 , high);
            QuickShort(arr, low, pi-1);
        }
    }



    public static int partition(int[] arr, int small, int large){

        int pivot = arr[large];
        int i = small-1;

        for(int j= small; j <= large-1; j++){

            if(arr[j] < pivot){
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[large];
        arr[large] = arr[i+1];
        arr[i+1] = temp;

        return i+1;
    }



    public static void main(String[] args){

        int arr[] = { 15, 7, 9, 10, 2, 5, 6, 8,  4};
        int size = arr.length;

        System.out.println("After Short: ");
        for( int i : arr){
            System.out.print(i+" ");
        }


        // call Quick Short
        QuickShort(arr, 0, size-1);


        System.out.println();
        System.out.println("Before Short:");
        for( int i : arr){
            System.out.print(i+" ");
        }


    }
}
