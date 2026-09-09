class Solution {
    public boolean rotateString(String s, String goal) {
        // If lengths don't match, s can never be shifted to become goal
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Check if goal exists inside the doubled string
        String doubled = s + s;
        return doubled.contains(goal);
    }
}
