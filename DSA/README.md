<img src="../img/IDEA%20(1).png">
<img src="../img/IDEA%20(2).png">


# Linear Vs Binary - 🔍 Search

```java
package com.akashdipmahapatra.DSA;

public class A_Search {

public static void main(String[] args){
    int arr[] = {5, 7, 9, 11, 13};
    int target = 11;

// Method
    int result_1 = linearSearch(arr, target);
    int result_2 = BinarySearch(arr, target);

//    output
    if(result_1 != -1) {
        System.out.println("Element found at Index: " + result_2);
    }else{
        System.out.println("Element not found");
    }
}
```
```java
public static int linearSearch(int[] arr, int target){
    int steps = 0; // To count the Steps (Optional)

    for(int i = 0; i<= arr.length; i++){
        steps++;
            if(arr[i] == target){
                System.out.println("Steps taken is Linear Search: " + steps);
                return i;
            }
        }
    return -1;
}
```
```java
public static int BinarySearch(int[] arr, int target){
// 5, 7, 9, 11, 13

    int steps = 0; // Optional
    int left = 0;
    int right = arr.length-1;

    while(left <= right){
        steps++;
        int mid = (left + right)/2;

        if(arr[mid] == target){
            System.out.println("Steps taken is Binary Search: " + steps);
            return mid;
        }else if(arr[mid] < target){
            left = mid+1;
        }else{
            right = mid-1;
        }
    }
    System.out.println("Steps taken is Binary Search: " + steps); // To cover all conditions.
    return -1;
}
```

## ❌ For loop not allow for "Divide-and-conquer" like Binary Search, Quick Sort, Marge Sort etc.

```java
// For loop not allow for "Divide-and-conquer" like Binary Search, Quick Sort, Marge Sort etc.

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
//    return -1;
//}

}
```

## Linear Vs Binary - 🔍 Search

<img src="../img/JAVA%20Search%20(1).png">
<img src="../img/JAVA%20Search%20(2).png">
<img src="../img/JAVA%20Search%20(3).png">
<img src="../img/JAVA%20Search%20(4).png">
<img src="../img/JAVA%20Search%20(5).png">
