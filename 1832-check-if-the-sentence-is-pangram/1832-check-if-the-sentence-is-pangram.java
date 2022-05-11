class Solution {
    public boolean checkIfPangram(String sentence) {
         int initial = 97;
        int i, j;
        int[] ascii = new int[26];
        for (i = 0; i < 26; i++) {
            ascii[i] = initial;
            initial++;
        }

        char[] newSentence = sentence.toCharArray();
        for (i = 0; i < newSentence.length; i++) {
            for (j = 0; j < ascii.length; j++) {
                if (newSentence[i] == ascii[j]) {
                    ascii[j] = 0;
                }
            }
        }
        for(i=0;i< ascii.length;i++){
            if(ascii[i]!=0){
                return false;
            }
        }
        return true;
    }
}