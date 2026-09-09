class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Tracks the index for non-val elements
        
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, move it forward
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++; // Increment the count of valid elements
            }
        }
        
        return k; // k represents the number of elements not equal to val
    }
}
