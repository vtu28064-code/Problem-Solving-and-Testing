class Solution {
    public int removeDuplicates(int[] nums) {
        // Base case: An array of length 0 or 1 already has no duplicates
        if (nums.length == 0) return 0;
        
        int k = 1; // Tracks the placement of the next unique element
        
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous unique element
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; // Move it to the unique position
                k++;               // Increment unique element count
            }
        }
        
        return k; // k represents the number of unique elements
    }
}
