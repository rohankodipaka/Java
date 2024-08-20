package com.javacoding.stack;



public class StackImplementationUsingArrays {
    public static void main(String[] args) {

        stack stack = new stack();

        stack.push(3);
        stack.push(6);
        stack.push(7);
        System.out.println("Top of the stack before deleting any element : " + stack.top());
        System.out.println("Size of the stack before deleting any element : " + stack.size());
        System.out.println("The element deleted is : " + stack.pop());
        System.out.println("Size of the stack after deleting an element : " + stack.size());
        System.out.println("Top of the stack after deleting an element : " + stack.top());
    }
}

class stack{
    int size = 10000;
    int[] array = new int[size];
    int top = -1;
    void push(int item){
        top++;
        array[top] = item;
    }
    int pop(){
        int removed = array[top];
        top--;
        return removed;
    }
    int top(){
        return array[top];
    }
    int size(){
        return top+1;
    }

}
