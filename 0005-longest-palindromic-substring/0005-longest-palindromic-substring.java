class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd length palindrome (centered at i)
            int len1 = expandAroundCenter(s, i, i);
            // Case 2: Even length palindrome (centered between i and i+1)
            int len2 = expandAroundCenter(s, i, i + 1);
            
            // Get the maximum length found from this center
            int maxLen = Math.max(len1, len2);
            
            // If it's longer than our previous max, update the boundaries
            if (maxLen > (end - start)) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        // Expand outwards as long as characters match and indices are valid
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return length of the found palindrome
        return right - left - 1;
    }
}
