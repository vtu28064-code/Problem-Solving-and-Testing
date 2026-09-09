import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert the integer array to String array
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        
        // Sort using custom comparator (descending order of combined strings)
        Arrays.sort(strs, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        
        // Edge case: If the largest number is "0", the whole number is 0 (e.g., [0, 0])
        if (strs[0].equals("0")) {
            return "0";
        }
        
        // Combine sorted strings
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        
        return sb.toString();
    }
}
