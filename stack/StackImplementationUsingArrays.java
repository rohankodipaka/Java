package com.javacoding.stack;



public class StackImplementationUsingArrays {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(3);
        stack.push(6);
        stack.push(7);
        System.out.println("Top of the stack before deleting any element : " + stack.top());
        System.out.println("Size of the stack before deleting any element : " + stack.size());
        System.out.println("The element deleted is : " + stack.pop());
        System.out.println("Size of the stack after deleting an element : " + stack.size());
        System.out.println("Top of the stack after deleting an element : " + stack.top());
        stack.search(6);
    }
}

class Stack{
    int size = 5;
    int top = -1;
    int[] array = new int[size];

    void push(int value){
        if(top >= size){        //top >= 5
            System.out.println("Stack is Full");
        }
        top = top+1;
        array[top] = value;
    }

    int pop(){
        int value = array[top];
        top = top-1;
        return value;
    }

    int top(){
        return array[top];
    }

    int size(){
        return top+1;
    }

    void search(int value){
        int index = -1;
        for(int i=0;i<=top;i++){
            if(value == array[i]){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index : " + index);
        }
    }


}
