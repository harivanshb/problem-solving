class Solution {
    public int lengthOfLongestSubstring(String s) {
         char[] storeString = s.toCharArray();
        int i=0,j=0;
        int max =0;
        Set<Character> set = new HashSet<>();
        if(s.length()>1) {
            while (j < s.length()) {
                if (!set.contains(storeString[j])) {
                    set.add(storeString[j]);
                    j++;
                } else {
                    max = Math.max(max, s.substring(i, j).length());
                    set.clear();
                    i++;
                    j = i + 1;
                    set.add(storeString[i]);
                }
            }
            max = Math.max(max, s.substring(i, j).length());
            return max;
        }
        else return s.length();
    }
}