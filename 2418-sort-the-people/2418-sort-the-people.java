import java.util.Collections;
import java.util.TreeMap;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        // Create a TreeMap that sorts keys in descending order
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }
        
        String[] result = new String[n];
        int idx = 0;
        // Populate result array from the sorted map values
        for (String name : map.values()) {
            result[idx++] = name;
        }
        
        return result;
    }
}
