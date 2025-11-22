import java.util.*;

public class NextGreaterElement {
    // Returns an array of next greater elements for each element in nums.
    // If no greater element exists to the right, returns -1 for that position.
    public static int[] nextGreater(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Deque<Integer> stack = new ArrayDeque<>(); // store indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = nums[i];
            }
            stack.push(i);
        }
        return res;
    }
}
