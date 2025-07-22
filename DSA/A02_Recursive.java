package com.akashdipmahapatra.DSA;

public class A02_Recursive {

    public static void main(String[] args){

//    int arr[] = new int[10000];
//    for(int i=0;i< arr.length;i++){
//        arr[i]=i+1; // Fills 1 to 100
//    }
//
//    int target = 900;

        int arr[] = {5, 7, 9, 11, 13, 15};
        int target = 15;

// Method
        int result = BinarySearch(arr, target, 0, arr.length-1);

//    output
        if(result != -1) {
            System.out.println("Element found at Index: " + result);
        }else{
            System.out.println("Element not found");
        }
    }




    public static int BinarySearch(int[] arr, int target, int left, int right) {
    // 5, 7, 9, 11, 13, 15


        if(left<=right){
            int mid = (left + right)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                return BinarySearch(arr, target, mid+1, right);
            }else{
                return BinarySearch(arr, target, left, mid-1);
            }
        }

        return -1;
    }
}

