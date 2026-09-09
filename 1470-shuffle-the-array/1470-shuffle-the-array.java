class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];       // Places x1, x2, x3... at even indices (0, 2, 4...)
            ans[2 * i + 1] = nums[i + n]; // Places y1, y2, y3... at odd indices (1, 3, 5...)
        }
        
        return ans;
    }
}
