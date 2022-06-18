class Solution {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int countOfWords = words.length;
        int printCount = 1;
        String s1 = new String();
        for (String word : words) {
            int length = word.length();
            int end = length - 1;
            int start = 0;
            char[] ch = word.toCharArray();
            while (start < end) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
            if (printCount < countOfWords) {
                s1 = s1 + String.valueOf(ch) + " ";
                printCount++;
            } else s1 = s1 + String.valueOf(ch);
        }
        return s1;
    }
}
