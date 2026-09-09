import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }
        
        return result;
    }
    
    private boolean matches(String word, String pattern) {
        // Arrays initialized to 0; tracks 1-based index mapping to differentiate from unmapped characters
        int[] patternToWord = new int[26];
        int[] wordToPattern = new int[26];
        
        for (int i = 0; i < word.length(); i++) {
            int pChar = pattern.charAt(i) - 'a';
            int wChar = word.charAt(i) - 'a';
            
            // Check mapping from pattern to word
            if (patternToWord[pChar] == 0) {
                patternToWord[pChar] = wChar + 1;
            } else if (patternToWord[pChar] != wChar + 1) {
                return false;
            }
            
            // Check mapping from word to pattern
            if (wordToPattern[wChar] == 0) {
                wordToPattern[wChar] = pChar + 1;
            } else if (wordToPattern[wChar] != pChar + 1) {
                return false;
            }
        }
        
        return true;
    }
}
