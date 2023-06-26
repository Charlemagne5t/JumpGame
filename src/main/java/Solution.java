public class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean dp[] = new boolean[nums.length];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            if (dp[i]) {
                for (int j = 0; j <= nums[i] && i + j < dp.length; j++) {
                    dp[i + j] = true;
                }
                if (dp[n - 1]) return true;
            } else return false;
        }


        return dp[n - 1];
    }
}