class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        
        // Array to store the last seen index of each character (ASCII 128 covers letters, digits, symbols, spaces)
        int[] lastSeen = new int[128];
        
        // Initialize all indices to -1 indicating they haven't been seen yet
        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1;
        }
        
        int left = 0;
        for (int right = 0; right < n; right++) {
            char currChar = s.charAt(right);
            
            // If the character was seen inside the current window, move the left boundary
            if (lastSeen[currChar] >= left) {
                left = lastSeen[currChar] + 1;
            }
            
            // Update the last seen position of the character
            lastSeen[currChar] = right;
            
            // Calculate the window length and track the maximum
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
