package com.example.dsa.stack.core;

import java.util.EmptyStackException;

/**
 * Generic Stack implementation
 */

public class MyStack<T> {

    private class MyStackNode<T> {
        T data;
        private MyStackNode<T> next;

        public MyStackNode(T data) {
            this.data = data;
            this.next = null;
        }

    }

    private MyStackNode<T> top;

    /**
     * Add new node to the stack
     */

    public void push(T data) {
        MyStackNode<T> newNode = new MyStackNode<T>(data);
        newNode.next = top;
        top = newNode;
    }

    /**
     * pop the element from top
     * of the stack
     *
     * @return
     */
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        T item = top.data;
        top = top.next;
        return item;
    }

    /**
     * Retrieve the element from
     * TOS
     *
     * @return
     */
    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    /**
     * Check if the stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        return top == null;
    }

}
