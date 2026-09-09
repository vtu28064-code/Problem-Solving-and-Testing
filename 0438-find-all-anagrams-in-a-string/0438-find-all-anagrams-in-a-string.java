import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();
        
        // Edge case: if p is longer than s, an anagram is impossible
        if (sLen < pLen) {
            return result;
        }
        
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        
        // Populate the initial frequency counts for p and the first window of s
        for (int i = 0; i < pLen; i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        
        // Check if the first window is an anagram
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }
        
        // Slide the window across the rest of the string s
        for (int i = pLen; i < sLen; i++) {
            // Add the new character entering the window from the right
            sCount[s.charAt(i) - 'a']++;
            // Remove the old character leaving the window from the left
            sCount[s.charAt(i - pLen) - 'a']--;
            
            // If frequencies match, we found a valid starting anagram index
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - pLen + 1);
            }
        }
        
        return result;
    }
}
