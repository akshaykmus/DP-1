// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : Yes returning and formula inside for loop

// Your code here along with comments explaining your approach

public class Solution {
    public int rob(int[] nums) {

        int n = nums.length;
        if (n < 2)
            return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        return dp[n - 1];
    }
}
