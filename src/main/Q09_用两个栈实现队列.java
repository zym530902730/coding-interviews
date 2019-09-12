package main;

import java.util.Stack;

/**
 * Title: Q09_用两个栈实现队列
 * ProjectName: 剑指offer
 * Function:  用两个栈实现队列
 * author     Yiming Zhao
 * Date:      2019-09-10 10:17
 */
public class Q09_用两个栈实现队列 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
