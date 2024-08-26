package com.javacoding.linkedList;


class Node{
    int data;
    Node next;

    Node(int data1){
        this.data = data1;
        this.next = null;
    }

}


public class LinkedList {

    private static Node convertArrayToLL(int[] values){
        Node head = new Node(values[0]);
        Node mover = head;
        for(int i=1;i< values.length;i++){
            Node temp = new Node(values[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] values = {12,2,3,4,5};
        Node head = convertArrayToLL(values);
        System.out.println(head.data);
    }
}
