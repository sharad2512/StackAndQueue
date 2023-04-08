package com.stack_and_queue;

public class Stack {
    Node top;
    Node next;
    //Represent a node of the singly linked list
    public class Node {
        int data;
        Node next;
    }
    public void Node() {
        this.top = null;
    }
    /*
      create a method name as push and passing parameter
      the push is Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
     */
    public void push(int number) {
        Node node = new Node();
        node.data = number;
        node.next = top;
        top = node;
    }

    public boolean isEmpty() {
        // return value if top is null then true
        return top == null;
    }

    //create a method peek

    public int peek() {

        // if isEmpty method is true then return top element
        if (!isEmpty()) {
            return top.data;
        }

        else {

            System.out.println("stack is empty.");

            return -1;
        }

    }
    public void pop() {

        //while loop is used if Top is not null then peek the element.

        while (top != null) {

            System.out.println("this is peak now :: " + peek());

            top = top.next;

            System.out.println("one item removed from stack...");
        }
        // all the elements are removed then print stack is empty
        System.out.println("now stack is empty :: ");
    }

    /*
     *  create method name as printStack
     */
    public void printStack() {

        Node node = top;

        /*
         * using while loop
         * node is not null then print node data
         */

        while (node != null) {

            System.out.println(node.data);

            node = node.next;

        }
    }
    public static void main(String[] args) {
        Stack stackoperation = new Stack();

        stackoperation.push(70);
        stackoperation.push(30);
        stackoperation.push(56);
        stackoperation.printStack();
        stackoperation.pop();
        stackoperation.printStack();

    }

}
