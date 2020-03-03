package com.leetCode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description TODO
 * @Author naikuo
 * @Date 2020/3/1 3:44 PM
 */
public class MyStack {

    private Deque<Integer> stack;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        stack = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        stack.push(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return stack.pop();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return stack.getFirst();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return stack.isEmpty();
    }
}
