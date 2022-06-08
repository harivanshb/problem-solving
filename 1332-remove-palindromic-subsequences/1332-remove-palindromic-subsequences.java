class Solution {
    public int removePalindromeSub(String s) {
        if (checkIfPalindrome(s)) {
            return 1;
        }
        return 2;
        
    }
    static boolean checkIfPalindrome(String s) {
        int i;
        for (i = 0; i < s.length() / 2; i++)
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        return true;

    }
}