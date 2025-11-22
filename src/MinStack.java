import java.util.*;

public class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        int val = stack.pop();
        if (val == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) throw new NoSuchElementException("Stack is empty");
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) throw new NoSuchElementException("Stack is empty");
        return minStack.peek();
    }
}
