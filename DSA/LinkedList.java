package com.akashdipmahapatra.DSA;

// Creat our own LinkedList Class in same package

// node
class Node{
    int data;
    Node next;

    //create a constracter - take data as parameter
    public Node(int data){
        this.data = data;
        next = null;
    }
}

public class LinkedList {

    Node head = null;

    // methode
    public void add(int data){ //Now we're only working with no. so int

        //Create a Node first
        //Now create a new Node
        Node newNode = new Node(data);

        Node current = head;
        if(head == null) {
            head = newNode;
        }else{
            while(current.next != null){
                current = current.next;
            current.next = newNode;

            }
        }
    }


    //methode for Print Values
    public void printValues(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
