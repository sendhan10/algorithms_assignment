import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Next Greater Element
        int[] arr = {4, 5, 2, 25};
        System.out.println("Next Greater Elements for " + Arrays.toString(arr) + ":");
        System.out.println(Arrays.toString(NextGreaterElement.nextGreater(arr)));

        // Valid Parentheses
        String s1 = "()[]{}", s2 = "([)]";
        System.out.println("isValid(\"" + s1 + "\") = " + ValidParentheses.isValid(s1));
        System.out.println("isValid(\"" + s2 + "\") = " + ValidParentheses.isValid(s2));

        // Stock Span
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Spans: " + Arrays.toString(StockSpan.calculateSpan(prices)));

        // MinStack
        MinStack ms = new MinStack();
        ms.push(3);
        ms.push(5);
        ms.push(2);
        ms.push(2);
        System.out.println("Top: " + ms.top() + ", Min: " + ms.getMin());
        ms.pop();
        System.out.println("After pop -> Top: " + ms.top() + ", Min: " + ms.getMin());

        // Sliding Window Maximum
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println("Sliding window max for " + Arrays.toString(nums) + " with k=" + k + ":");
        System.out.println(Arrays.toString(SlidingWindowMaximum.maxSlidingWindow(nums, k)));
    }
}
