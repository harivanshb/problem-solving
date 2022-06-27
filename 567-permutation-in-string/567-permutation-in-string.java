class Solution {

    public boolean checkInclusion(String s1, String s2) {
        int i = 0, j = 0, l = 0;
        Map<Character, Integer> string1Map = new HashMap<>();
        Map<Character, Integer> map = new HashMap<>();
        int k = s1.length();
        while (l < k) {
            if (string1Map.containsKey(s1.charAt(l))) {
                string1Map.put(s1.charAt(l), string1Map.get(s1.charAt(l)) + 1);
            } else string1Map.put(s1.charAt(l), 1);
            l++;
        }
        while (j < s2.length()) {
            if (j - i < s1.length()) {
                if (map.containsKey(s2.charAt(j))) {
                    map.put(s2.charAt(j), map.get(s2.charAt(j)) + 1);
                } else map.put(s2.charAt(j), 1);
                j++;
            } else {
                if (map.equals(string1Map))
                    return true;
                map.clear();
                i++;
                j = i + 1;
                map.put(s2.charAt(i), 1);
            }
        }
        return map.equals(string1Map);
    }
}
