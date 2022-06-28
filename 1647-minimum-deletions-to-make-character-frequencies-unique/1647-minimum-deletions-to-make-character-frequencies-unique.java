class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[26];
        int count = 0;
        for (char ch : s.toCharArray()) {
             arr[ch - 'a'] = arr[ch - 'a'] + 1;
        }
        Set<Integer> used = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            int freq = arr[i];
            while (freq > 0) {
                if (!used.contains(freq)) {
                    used.add(freq);
                    break;
                } 
                freq--;
                count++;
            }
        }
        return count; 
    }
}