import java.util.Set;

class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int vowelCount = 0;
        
        // Use a lookup string for constant-time vowel checks
        String vowels = "aeiouAEIOU";
        
        for (int i = 0; i < n / 2; i++) {
            // Check front half (increment)
            if (vowels.indexOf(s.charAt(i)) != -1) {
                vowelCount++;
            }
            // Check back half (decrement)
            if (vowels.indexOf(s.charAt(i + n / 2)) != -1) {
                vowelCount--;
            }
        }
        
        return vowelCount == 0;
    }
}
