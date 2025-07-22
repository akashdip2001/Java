package com.akashdipmahapatra.DSA;

public class Search{

public static void main(String[] args){
    int arr[] = {5, 7, 9, 11, 13};
    int target = 7;

// Method
//    int result = linearSearch(arr, target);
    int result = BinarySearch(arr, target);

//    output
    if(result != -1) {
        System.out.println("Element found at Index: " + result);
    }else{
        System.out.println("Element not found");
    }
}



public static int linearSearch(int[] arr, int target){
        for(int i = 0; i<= arr.length; i++){
            if(arr[i] == target)
                return i;
        }
    return -1;
}




public static int BinarySearch(int[] arr, int target){
// 5, 7, 9, 11, 13

    int left = 0;
    int right = arr.length-1;

    while(left <= right){
        int mid = (left + right)/2;

        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] < target){
            left = mid+1;
        }else{
            right = mid-1;
        }
    }

//    int left = 0;
//    int right = arr.length-1;
//
//    for(int i = left; i < right; i++){
//        int mid = (left + right)/2;
//
//        if(arr[mid] == target){
//            return mid;
//        }else if(arr[mid] < target){
//            left = mid + 1;
//        }else{
//            right = mid - 1;
//        }
//    }
// For loop not allow for "Divide-and-conquer" like Binary Search, Quick Sort, Marge Sort etc.

    return -1;
}

}

