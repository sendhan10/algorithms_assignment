import java.util.*;

public class SlidingWindowMaximum {
    // Returns maximum for each sliding window of size k.
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); // stores indices, decreasing values

        for (int i = 0; i < n; i++) {
            // remove indices out of window
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) dq.pollFirst();
            // remove smaller values from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}
