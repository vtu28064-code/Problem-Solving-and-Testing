class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // Double the string: e.g., "abab" -> "abababab"
        String doubled = s + s;
        
        // Remove the first and last characters: "abababab" -> "bababa"
        // If s ("abab") exists in "bababa", it confirms a repeating pattern
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}
