package com.example.dsa.stack.core;

/**
 * Created by rajeevkr on 28/01/17.
 */

public class CoreDriver {

    public static void main(String... args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(4);

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }

        MyStack<String> stringMyStack = new MyStack<>();
        stringMyStack.push("a");
        stringMyStack.push("b");
        stringMyStack.push("c");
        stringMyStack.push("d");

        while (!stringMyStack.isEmpty()) {
            System.out.println(stringMyStack.pop());
        }

    }
}
