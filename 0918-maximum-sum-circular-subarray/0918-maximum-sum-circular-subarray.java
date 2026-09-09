class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSoFar = nums[0], currentMax = 0;
        int minSoFar = nums[0], currentMin = 0;
        
        for (int num : nums) {
            // Standard Kadane's to find the maximum subarray sum
            currentMax = Math.max(num, currentMax + num);
            maxSoFar = Math.max(maxSoFar, currentMax);
            
            // Modified Kadane's to find the minimum subarray sum
            currentMin = Math.min(num, currentMin + num);
            minSoFar = Math.min(minSoFar, currentMin);
            
            totalSum += num;
        }
        
        // Edge Case: If all elements are negative, maxSoFar will hold the largest negative value.
        // totalSum == minSoFar means the minimum subarray contains all elements, leaving an empty subarray.
        if (maxSoFar > 0) {
            return Math.max(maxSoFar, totalSum - minSoFar);
        }
        
        return maxSoFar;
    }
}
