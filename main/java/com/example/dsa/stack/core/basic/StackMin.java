package com.example.dsa.stack.core.basic;

import java.util.Stack;

/**
 * push(),pop() & min() all in O(1)
 */

public class StackMin {

    static class MyMinStack extends Stack<Integer> {
        Stack<Integer> s2;

        public MyMinStack() {
            super();
            s2 = new Stack<>();
        }

        @Override
        public synchronized Integer pop() {
            int val = super.pop();
            if (val == min())
                s2.pop();

            return val;
        }

        @Override
        public Integer push(Integer item) {
            if (item <= min())
                s2.push(item);
            return super.push(item);
        }

        public int min() {
            if (s2.isEmpty())
                return Integer.MAX_VALUE;
            else
                return s2.peek();
        }
    }

    public static void main(String... args) {
        MyMinStack myMinStack = new MyMinStack();
        myMinStack.push(1);
        myMinStack.push(9);
        myMinStack.push(100);
        myMinStack.push(5);

        System.out.println("Min element is: " + myMinStack.min());


    }

}
