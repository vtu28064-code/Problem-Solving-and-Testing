import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // If the element already exists in the set, a duplicate is found
            if (!seen.add(num)) {
                return true;
            }
        }
        
        return false;
    }
}
