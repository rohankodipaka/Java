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

    private static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next; // Move to the next node
            count++;
        }
        return count;
    }

    private static boolean searchInLL(Node head, int value){
        Node temp = head;
        while(temp != null){
            if(temp.data == value){
                return true;
            }
            temp = temp.next; // Move to the next node
        }
        return false;
    }


    public static void main(String[] args) {
        int[] values = {12,2,3,4,5};
        Node head = convertArrayToLL(values);
        // for finding head
         System.out.println("Head is : " + head.data);

        //Traverse through LL
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next; // Move to the next node
        }

        System.out.println();

        //Length of LL
        System.out.println("Length of LL is : " + lengthOfLL(head));

        //Search Element in LL
        System.out.println(searchInLL(head, 15));
    }
}
