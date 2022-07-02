class Solution {
    public int lengthOfLongestSubstring(String s) {
          int windowStart = 0, windowEnd;
        int max = Integer.MIN_VALUE;
        Map<Character, Integer> longest = new HashMap<>();
        for (windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char endChar = s.charAt(windowEnd);
            if (longest.containsKey(endChar)) {
                windowStart = Math.max(windowStart, longest.get(endChar) + 1);
            }
            longest.put(endChar, windowEnd);
            max = Math.max(max, windowEnd - windowStart + 1);

        }
        return s.length()==0? 0:max;
    }
}