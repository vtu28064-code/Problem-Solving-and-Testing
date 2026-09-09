import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                // Avoid comparing a word with itself
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break; // Break early since we only need to confirm it's a substring once
                }
            }
        }
        
        return result;
    }
}
