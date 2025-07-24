package com.akashdipmahapatra.DSA;

//import java.util.LinkedList;
// Creat our own LinkedList Class in same package --> LinkedList.java

public class C01_Linked_List {
    public static void main(String[] args) {

        LinkedList nums = new LinkedList();

        nums.add(3);
        nums.add(5);

//      nums.addFirst(8);
        nums.add(6);


//      System.out.println(nums);
//      System.out.println("The First Element is: " + nums.getFirst());
//      System.out.println("The Elem. in index 2 is: " + nums.get(2)); // Takes much time than array
//      System.out.println("The Head Element: " + nums.peek());

        nums.printValues();
    }

}
